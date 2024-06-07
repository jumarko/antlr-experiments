grammar R;

prog: ( expr_or_assign (';' | NL) | NL )*
      EOF
      ;

expr_or_assign :
    // 3 assignment operators here
    expr ('<-' | '=' | '<<-') expr_or_assign
    | expr
    ;

expr :
    /* operators according to precedence */
    expr '[[' sublist ']' ']' // notice the opening '[[' (probably enforces no space)
    | expr '[' sublist ']'
    | expr ('::' | ':::') expr // see that '::' is before ':::' (is that significant??)
    | expr ('$' | '@') expr
    // antlr 4.2.2 output to console warning (157)
    // => The <assoc> should now be moved left of the "expression"
    | <assoc=right> expr '^' expr
    | ('-' | '+') expr // unary - or +
    | expr ':' expr
    | expr USER_OP expr // antying wrapped in %: '%' .* '%'
    | expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | expr ('>' | '>=' | '<' | '<=' | '==' | '!=') expr
    | '!' expr
    | expr ('&' || '&&') expr
    | expr ('|' || '||') expr
    | '~' expr
    | expr '~' expr
    | expr ('->' | '->>' | ':=') expr

    /* functions */
    |   'function' '(' formlist? ')' expr // define function
    |   expr '(' sublist ')'              // call function

    | '{' exprlist '}' // compound statement

    /* control flow structures */
    | 'if' '(' expr ')' expr
    // if with 'else' branch
    | 'if' '(' expr ')' expr 'else' expr
    | 'for' '(' ID 'in' expr ')' expr
    | 'while' '(' expr ')' expr
    | 'repeat' expr
    | '?' expr // get help on expr (usually string or ID)
    | 'next'
    | 'break'

    /* the rest copied from examples/R.g4 */
    |   '(' expr ')'
    |   ID
    |   STRING
    |   HEX
    |   INT
    |   FLOAT
    |   COMPLEX
    |   'NULL'
    |   'NA'
    |   'Inf'
    |   'NaN'
    |   'TRUE'
    |   'FALSE'
    ;


exprlist : expr_or_assign ( (';'|NL) expr_or_assign )*
    |
    ;

formlist : form (',' | form)* ;
form : ID
    | ID '=' expr
    | '...'
    ;

sublist : sub (',' sub)* ;
// each argument can ber tagged (tag=expr), or just be a simple expression, or empty, or one of special tokens '...', '..2', etc.
sub : expr
    | ID '='
    | ID '=' expr
    | STRING '='
    | STRING '=' expr
    | 'NULL' '='
    | 'NULL' '=' expr
    | '...'
    |
    ;



// don't discard new lines since they can be used as statement separators
NL : '\r'? '\n' ;
ID : '.' (LETTER | '_' | '.') ID_CHAR*
    | LETTER ID_CHAR*
    ;
// valid characters in identifiers
fragment ID_CHAR : (LETTER | DIGIT | '_' | '.') ;
fragment LETTER : [a-zA-Z] ;
fragment DIGIT: [0-9] ;


USER_OP :   '%' .*? '%' ;
COMMENT :   '#' .*? '\r'? '\n' -> type(NL) ;
WS      :   [ \t]+ -> skip ;

/* the rest of lexer rules copied from examples/R.g4
   they don't seem very relevant ... */
////////////////////////////////////////////////////////
HEX :   '0' ('x'|'X') HEXDIGIT+ [Ll]? ;
INT :   DIGIT+ [Ll]? ;

fragment HEXDIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

FLOAT:  DIGIT+ '.' DIGIT* EXP? [Ll]?
    |   DIGIT+ EXP? [Ll]?
    |   '.' DIGIT+ EXP? [Ll]?
    ;
fragment EXP :   ('E' | 'e') ('+' | '-')? INT ;

COMPLEX :   INT 'i'
    |   FLOAT 'i'
    ;

STRING :   '"' ( ESC | ~[\\"] )*? '"'
    |   '\'' ( ESC | ~[\\'] )*? '\''
    ;

fragment ESC :   '\\' ([abtnfrv]|'"'|'\'')
    |   UNICODE_ESCAPE
    |   HEX_ESCAPE
    |   OCTAL_ESCAPE
    ;

fragment UNICODE_ESCAPE
    :   '\\' 'u' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT
    |   '\\' 'u' '{' HEXDIGIT HEXDIGIT HEXDIGIT HEXDIGIT '}'
    ;

fragment OCTAL_ESCAPE
    :   '\\' [0-3] [0-7] [0-7]
    |   '\\' [0-7] [0-7]
    |   '\\' [0-7]
    ;

fragment HEX_ESCAPE
    :   '\\' HEXDIGIT HEXDIGIT?
    ;
