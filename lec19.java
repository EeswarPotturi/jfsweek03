import java.util.HashMap;
import java.util.Map;

public class Lecture18_1 {
    public static Map<String, String> showNumbers(int limit) {
        Map<String, String> numberMap = new HashMap<>();

        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                numberMap.put(String.valueOf(i), "EVEN");
            } else {
                numberMap.put(String.valueOf(i), "ODD");
            }
        }

        return numberMap;
    }

    public static void main(String[] args) {
        int limit = 10;
        Map<String, String> result = showNumbers(limit);

        System.out.println("Number\tLabel");
        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
