grammar AoCDay9;

@header {
package learning.aoc.antlr4;
}

value: premarker marker? EOF?;
marker: LPAR len=digits  X copies=digits RPAR;
premarker: (~LPAR)*;
single: .|EOF;
digits: INT+;

LPAR: '(';
RPAR: ')';
X: 'x';
INT: '0'..'9';
UNKNOWN: .;