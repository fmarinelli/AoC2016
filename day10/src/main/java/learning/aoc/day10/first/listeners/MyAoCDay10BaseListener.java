package learning.aoc.day10.first.listeners;

import learning.aoc.antlr4.AoCDay10BaseListener;
import learning.aoc.antlr4.AoCDay10Parser;
import learning.aoc.day10.first.commands.*;
import learning.aoc.day10.first.model.Bot;
import learning.aoc.day10.first.model.BotFactory;

public class MyAoCDay10BaseListener extends AoCDay10BaseListener {

    private final BotFactory botFactory;

    public MyAoCDay10BaseListener(BotFactory botFactory) {
        this.botFactory = botFactory;
    }

    @Override
    public void exitBotBB(AoCDay10Parser.BotBBContext ctx) {
        Bot bot = botFactory.findBotOrCreate(Integer.valueOf(ctx.bot.getText()));
        int low = Integer.valueOf(ctx.botLow.getText());
        int high = Integer.valueOf(ctx.botHigh.getText());

        bot.assign(new BotLowBotHigh(low, high));
    }

    @Override
    public void exitBotOB(AoCDay10Parser.BotOBContext ctx) {
        Bot bot = botFactory.findBotOrCreate(Integer.valueOf(ctx.bot.getText()));
        int low = Integer.valueOf(ctx.outputLow.getText());
        int high = Integer.valueOf(ctx.botHigh.getText());

        bot.assign(new OutputLowBotHigh(low, high));
    }

    @Override
    public void exitBotBO(AoCDay10Parser.BotBOContext ctx) {
        Bot bot = botFactory.findBotOrCreate(Integer.valueOf(ctx.bot.getText()));
        int low = Integer.valueOf(ctx.botLow.getText());
        int high = Integer.valueOf(ctx.outputHigh.getText());

        bot.assign(new BotLowOutputHigh(low, high));
    }

    @Override
    public void exitBotOO(AoCDay10Parser.BotOOContext ctx) {
        Bot bot = botFactory.findBotOrCreate(Integer.valueOf(ctx.bot.getText()));
        int low = Integer.valueOf(ctx.outputLow.getText());
        int high = Integer.valueOf(ctx.outputHigh.getText());

        bot.assign(new OutputLowOutputHigh(low, high));
    }
}
