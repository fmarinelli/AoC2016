package learning.aoc.day4.model;

import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CipherRoom {

    private String data;

    private Integer secureId;

    private String checksum;

    public CipherRoom() {
    }

    public CipherRoom(String data, Integer secureId, String checksum) {
        this.data = data;
        this.secureId = secureId;
        this.checksum = checksum;
    }

    public boolean validate() {
        TreeSet<Map.Entry<String, Long>> sortedSet = new TreeSet<>((e1, e2) -> {
            int compareValue = e1.getValue().compareTo(e2.getValue());
            if (compareValue == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }
            return Math.negateExact(compareValue);
        });

        Map<String, Long> repetition = data.chars()
                .mapToObj(i -> String.valueOf((char) i))
                .filter(s -> !s.equals("-"))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        sortedSet.addAll(repetition.entrySet());
        String check = sortedSet.stream().map(Map.Entry::getKey).collect(Collectors.joining()).substring(0, 5);
        return check.equals(checksum);
    }

    public String decipher() {
        int modulo = 'z' - 'a' + 1;
        int base = 'a';
        int delta = secureId % modulo;
        return data.chars()
                .mapToObj(i -> {
                    char c;
                    if(i == '-') {
                        c = ' ';
                    } else {
                        c = (char) (base + ((i - base + secureId) % modulo));
                    }
                    return String.valueOf(c);
                })
                .collect(Collectors.joining());
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getSecureId() {
        return secureId;
    }

    public void setSecureId(Integer secureId) {
        this.secureId = secureId;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
}
