grammar Hello;
r : 'hello' ID;
ID : [a-zA-Z0-9]+;
WS : [ \t\n\r]+ -> skip;
