package learning.aoc.day10.first.model;

import learning.aoc.day10.first.commands.BotInstruction;

public class Bot {

    private final int id;
    private BotInstruction instruction;

    private int low = -1;
    private int high = -1;

    public Bot(int id) {
        this.id = id;
    }

    public Bot(int id, BotInstruction instruction) {
        this(id);
        this.instruction = instruction;
    }

    public void assign(BotInstruction instruction) {
        this.instruction = instruction;
    }

    public void receive(BotFactory botFactory, int value) {
        int max = Math.max(low, high);
        if (max > value) {
            this.low = value;
            this.high = max;
        } else {
            this.low = max;
            this.high = value;
        }
        if (low != -1 && high != -1) {
            botFactory.callBotCompare(this, low, high);
            int low = this.low;
            int high = this.high;
            this.low = -1;
            this.high = -1;
            instruction.execute(botFactory, low, high);
        }
    }

    public boolean is(int id) {
        return id == this.id;
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    @Override
    public String toString() {
        return "Bot{" +
                "id=" + id +
                ", low=" + low +
                ", high=" + high +
                '}';
    }
}
