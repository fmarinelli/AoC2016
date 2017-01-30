package learning.aoc.day10.first.model;

import learning.aoc.day10.ChipCompareCallback;

import java.util.ArrayList;
import java.util.List;

public class BotFactory {

    private final List<Bot> bots = new ArrayList<>();
    private final List<OutputBin> outputBins = new ArrayList<>();

    private final List<ChipCompareCallback> compareCallbacks = new ArrayList<>();

    public void addCompareCallback(ChipCompareCallback c) {
        compareCallbacks.add(c);
    }

    public void callBotCompare(Bot bot, int low, int high) {
        compareCallbacks.forEach(c -> c.apply(bot, low, high));
    }

    public void give(int botId, int value) {
        Bot bot = findBotOrCreate(botId);
        bot.receive(this, value);
    }

    public void putInOutputBin(int outputId, int value) {
        OutputBin outputBin = findOutputBinOrCreate(outputId);
        outputBin.add(value);
    }

    public Bot findBotOrCreate(int botId) {
        return bots.stream().filter(b -> b.is(botId)).findFirst().orElseGet(() -> {
            Bot b = new Bot(botId);
            bots.add(b);
            return b;
        });
    }

    public OutputBin getOutputBin(int id) {
        return findOutputBinOrCreate(id);
    }

    private OutputBin findOutputBinOrCreate(int outputId) {
        return outputBins.stream().filter(o -> o.is(outputId)).findFirst().orElseGet(() -> {
            OutputBin o = new OutputBin(outputId);
            outputBins.add(o);
            return o;
        });
    }
}
