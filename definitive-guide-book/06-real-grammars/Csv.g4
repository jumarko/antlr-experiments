grammar Csv;

file : header (NEWLINE row)*;
header : row;
row : field (',' field)* ;
field : TEXT
      | STRING
      | // matches empty field!
      ;

TEXT : ~[,"\r\n]+ ;
STRING : '"' ( '""' | ~'"' )* '"' ;

NEWLINE : '\r'? '\n' ;