/**
  * The book seems to implement a simplified version of the format.
  * References:
  * - https://en.wikipedia.org/wiki/.properties
  * - https://docs.oracle.com/cd/E23095_01/Platform.93/ATGProgGuide/html/s0204propertiesfileformat01.html
  *   - this is the version we aim to support (e.g. both '=' and  ':' for separating keys and values)
  * - https://docs.oracle.com/javase/8/docs/api/java/util/Properties.html
  *   - the input/output stream is encoded in ISO 8859-1 character encoding.
  *     Characters that cannot be directly represented in this encoding can be written using Unicode escapes
  *     as defined in section 3.3 of The Java™ Language Specification; only a single 'u' character is allowed in an escape sequence.
  */

grammar PropertyFile;

file : prop+ ;
// whitespaces at the beginning of the line and between key and value are ignored
prop : WS? key WS? ASSIGN WS? value '\n'; // NOTE: this '\n' requires a new line at the end of the file
key : ID ;
// unlike the official format, we require double quotes to enclose the property value
value : STRING ;

ID : [a-zA-Z0-9]+ ;
STRING : '"' (ESC | .)*? '"' ;
fragment ESC : '\\"' ;

ASSIGN : '=' | ':' ;
WS : [ \t]+ ;

// TODO: comments
COMMENT : ('#'|'!') .*? '\r'? '\n' ->  skip ;
// TODO: escaped sequences