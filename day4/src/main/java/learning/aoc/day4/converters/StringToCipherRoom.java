package learning.aoc.day4.converters;

import learning.aoc.day4.model.CipherRoom;
import org.apache.camel.Converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Converter
public class StringToCipherRoom {

    public static final Pattern PATTERN = Pattern.compile("^(.+?)-(\\d+)\\[(.{5,5})\\]$");

    @Converter
    public CipherRoom convert(String text) {
        Matcher matcher = PATTERN.matcher(text);
        if (matcher.find()) {
            int groupCount = matcher.groupCount();
            String data = matcher.group(1);
            String secureId = matcher.group(2);
            String checksum = matcher.group(3);
            return new CipherRoom(data, Integer.valueOf(secureId), checksum);
        }
        throw new IllegalArgumentException("Invalid data [" + text + "]");
    }

}
