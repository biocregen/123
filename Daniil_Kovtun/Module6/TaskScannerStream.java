package Module6;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class TaskScannerStream {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("(?U)[^\\p{L}\\p{Digit}]+");
            scanner.tokens()
                    .map(String::toLowerCase)
                    .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum))
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(
                                    Map.Entry. <String, Integer> comparingByValue())
                            .thenComparing(Map.Entry.comparingByKey()))
                    .sorted((a, b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue())
                    .limit(10)
                    .forEach(w -> System.out.println(w.getValue() + " " + w.getKey()));



        }
}



