package Module5;

import java.io.*;
import java.util.*;


public class TaskGetSalesMap {
    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> map = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            /*
            String key = scanner.next();
            Long value = scanner.nextLong();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
        */
            // код без merge
            map.merge(scanner.next(), scanner.nextLong(), (x, y) -> x + y);
        }

        return map;
    }
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000".getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        Map<String, Long> map = getSalesMap(buffReader);
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
