grammar tmp;

string : STRING;
STRING : '"' (ESC | ~["\\])* '"' ;

ESC : '\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE : 'u' HEX HEX HEX HEX;
fragment HEX : [a-zA-Z0-9];