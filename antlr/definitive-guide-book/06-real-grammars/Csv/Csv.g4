grammar Csv;

file : header (NEWLINE row)*;
header : row;
row : field (',' field)* ;
field : TEXT
      | STRING
      | // matches empty field!
      ;

TEXT : ~[,"\r\n]+ ;
// This escaping is pretty interesting - NOTE: we cannot use a non-greedy rule *? because that would terminate too early matching only the opening quote, the immediately the closing quote
STRING : '"' ( '""' | ~'"' )*? '"' ;

NEWLINE : '\r'? '\n' ;