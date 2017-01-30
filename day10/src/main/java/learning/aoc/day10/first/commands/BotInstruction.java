package learning.aoc.day10.first.commands;

import learning.aoc.day10.first.model.BotFactory;

public interface BotInstruction {

    void execute(BotFactory botFactory, int low, int high);
}
