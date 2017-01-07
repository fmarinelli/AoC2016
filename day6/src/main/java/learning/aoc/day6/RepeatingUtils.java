package learning.aoc.day6;

import learning.aoc.comparators.CombineComparator;
import learning.aoc.comparators.NegateComparator;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatingUtils {

    public static String decode(String[] messages) {
        return decode(new CombineComparator<Map.Entry<Integer, Integer>>(
                Map.Entry.comparingByValue(),
                new NegateComparator<Map.Entry<Integer, Integer>>(Map.Entry.comparingByKey())), messages);
    }

    public static String inverseDecode(String[] messages) {
        return decode(new CombineComparator<Map.Entry<Integer, Integer>>(
                new NegateComparator<Map.Entry<Integer, Integer>>(Map.Entry.comparingByValue()),
                Map.Entry.comparingByKey()), messages);
    }

    private static String decode(Comparator<Map.Entry<Integer, Integer>> cmp, String[] messages) {
        List<Map<Integer, Integer>> charsByPosition = new ArrayList<>(10);
        for (String message : messages) {
            for (int i = 0; i < message.length(); i++) {
                if (charsByPosition.size() <= i) {
                    charsByPosition.add(new HashMap<>());
                }
                Map<Integer, Integer> map = charsByPosition.get(i);
                map.compute((int) message.charAt(i), (ch, count) -> {
                    if (count == null) {
                        return 1;
                    }
                    return count + 1;
                });
            }
        }

        return charsByPosition.stream()
                .map(m -> m.entrySet()
                        .stream()
                        .max(cmp)
                        .get()
                )
                .map(i -> String.valueOf((char) i.getKey().intValue()))
                .collect(Collectors.joining());
    }

}
