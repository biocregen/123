package Module6;

import java.util.stream.IntStream;

public class IntStreamTask {
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, i -> (i*i % 10000) / 10);
    }
    public static void main(String[] args) {
        IntStream i = pseudoRandomStream(13);
        i.limit(20).forEach(System.out::println);
    }
}

