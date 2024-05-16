grammar Json;

file : object | array;

object : '{}' // empty object
       | '{' prop (',' prop)* '}'
       ;

prop : key ':' value ;
key : STRING ;

array : '[]' // empty array
      | '[' value (',' value) *  ']' ;


value : STRING
      | NUMBER
      | TRUE
      | FALSE
      | NULL
      | object
      | array;

TRUE : 'true';
FALSE : 'false' ;
NULL : 'null' ;

STRING : '"' (~["\\] | ESC)* '"';
fragment ESC : '\\' ( ["\\/bfnrt] | UNICODE ) ;
fragment UNICODE: 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-zA-Z] ;

NUMBER : '-' ?
         ( INT
           | INT EXP
           | INT '.' [0-9]+ EXP?)
         ;
fragment EXP : [eE] [+-]? INT ;
fragment INT : '0' | [1-9] [0-9]* ;


WHITESPACE : [ \t\n\r]+ -> skip;
ANY_CHAR : .;

