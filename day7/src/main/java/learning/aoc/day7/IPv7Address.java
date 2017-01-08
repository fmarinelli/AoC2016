package learning.aoc.day7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class IPv7Address {

    private static final Pattern ADDRESS_PATTERN = Pattern.compile("([^\\[]+)(?:\\[([^\\]]+)\\])?");

    private final List<String> addresses = new ArrayList<>();
    private final List<String> brackets = new ArrayList<>();

    public IPv7Address(String address) {
        Matcher matcher = ADDRESS_PATTERN.matcher(address);
        while (matcher.find()) {
            addresses.add(matcher.group(1));
            if (matcher.group(2) != null) {
                brackets.add(matcher.group(2));
            }
        }
    }

    public boolean isTLS() {
        return (brackets.stream().noneMatch(this::matchABBA) && addresses.stream().anyMatch(this::matchABBA));
    }

    public boolean isSSL() {
        Set<String> abas = brackets.stream()
                .map(this::matchABA)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
        if (abas.size() > 0) {
            Pattern pattern = buildRegexpOnABAs(abas);
            return addresses.stream().anyMatch(pattern.asPredicate());
        }
        return false;
    }

    private Pattern buildRegexpOnABAs(Set<String> abas) {
        String pattern = "(" + abas.stream().map(s -> s.charAt(1) + s).collect(Collectors.joining("|")) + ")";
        return Pattern.compile(pattern);
    }

    private List<String> matchABA(String text) {
        List<String> results = new ArrayList<>();
        Pattern compile = Pattern.compile("(.)(.)\\1");
        Matcher matcher = compile.matcher(text);
        int start = 0;
        while (matcher.find(start)) {
            if (!(matcher.group(1).equals(matcher.group(2)))) {
                results.add(matcher.group(1) + matcher.group(2));
            }
            start = matcher.end() - 2;
        }
        return results;
    }

    private boolean matchABBA(String text) {
        Pattern compile = Pattern.compile("(.)(.)\\2\\1");
        Matcher matcher = compile.matcher(text);
        while (matcher.find()) {
            if (!(matcher.group(1).equals(matcher.group(2)))) {
                return true;
            }
        }
        return false;
    }
}
