grammar AoC;

@header {
package learning.aoc.antlr4;
}

instructions: ((rect | rotateRow | rotateCol) (NL|EOF))*;

rect: RECT WS x=INT X y=INT;

rotateCol: ROTATE WS 'column' WS 'x=' column=INT WS 'by' WS value=INT;

rotateRow: ROTATE WS 'row' WS 'y=' row=INT WS 'by' WS value=INT;

X: 'x';

INT: ('0'..'9')+;

RECT: 'rect';

ROTATE: 'rotate';

WS: (' ' | '\t')+;
NL:  '\r'? '\n';