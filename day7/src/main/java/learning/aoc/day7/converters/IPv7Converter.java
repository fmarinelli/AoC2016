package learning.aoc.day7.converters;

import learning.aoc.day7.IPv7Address;
import org.apache.camel.Converter;

@Converter
public class IPv7Converter {

    @Converter
    public IPv7Address convert(String address) {
        return new IPv7Address(address);
    }
}
