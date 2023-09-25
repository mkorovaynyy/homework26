import java.util.*;

public class Service {
    public static void printEvenNumbers(List<Integer> nums) {
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer integer : set) {
            if (integer % 2 != 0) {
                System.out.println(integer);
            }
        }
    }

    public static void printOddNumbers(List<Integer> nums) {
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer integer : set) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
    }

    public static void printUniqueWords(List<String> words) {
        Set<String> setOfWords = new TreeSet<>(words);
        for (String string : setOfWords) {
            System.out.println(string);
        }
    }

    public static void printTheNumberOfDuplicates(List<String> words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String t : words) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}

