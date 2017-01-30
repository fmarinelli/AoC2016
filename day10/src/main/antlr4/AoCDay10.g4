grammar AoCDay10;

@header {
package learning.aoc.antlr4;
}

instructions: (botgatherer|botBB|botOB|botBO|botOO)+ EOF;

botgatherer: VALUE value=digits GOES TO BOT bot=digits;
botBB: BOT bot=digits GIVES LOW TO BOT botLow=digits AND HIGH TO BOT botHigh=digits;
botOB: BOT bot=digits GIVES LOW TO OUTPUT outputLow=digits AND HIGH TO BOT botHigh=digits;
botBO: BOT bot=digits GIVES LOW TO BOT botLow=digits AND HIGH TO OUTPUT outputHigh=digits;
botOO: BOT bot=digits GIVES LOW TO OUTPUT outputLow=digits AND HIGH TO OUTPUT outputHigh=digits;
digits: INT+;

//value 5 goes to bot 2
//bot 2 gives low to bot 1 and high to bot 0
//value 3 goes to bot 1
//bot 1 gives low to output 1 and high to bot 0
//bot 0 gives low to output 2 and high to output 0
//value 2 goes to bot 2

VALUE: 'value';
BOT: 'bot';
OUTPUT: 'output';
GOES: 'goes';
GIVES: 'gives';
AND: 'and';
LOW: 'low';
HIGH: 'high';
TO: 'to';

INT: '0'..'9';

WS: (' ' | '\t')+ -> skip;
NL:  '\r'? '\n' -> skip;
