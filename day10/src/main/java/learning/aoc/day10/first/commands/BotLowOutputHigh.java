package learning.aoc.day10.first.commands;

import learning.aoc.day10.first.model.BotFactory;

public class BotLowOutputHigh implements BotInstruction {

    private final int lowId;
    private final int highId;

    public BotLowOutputHigh(int lowId, int highId) {
        this.lowId = lowId;
        this.highId = highId;
    }

    @Override
    public void execute(BotFactory botFactory, int low, int high) {
        botFactory.give(lowId, low);
        botFactory.putInOutputBin(highId, high);
    }
}
