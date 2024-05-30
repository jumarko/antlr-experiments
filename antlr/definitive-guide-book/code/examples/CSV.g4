grammar CSV;

file : hdr (NEWLINE row)+;
hdr : row ;

row : field (',' field)* ;

field
    :   TEXT
    |   STRING
    |
    ;

TEXT : ~[,\n\r"]+ ;
STRING : '"' ('""'|~'"')* '"' ; // quote-quote is an escaped quote

NEWLINE : '\r'? '\n' ;
