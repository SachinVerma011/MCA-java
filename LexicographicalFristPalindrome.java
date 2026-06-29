import java.util.*;
class LexicographicalFristPalindrome {
    public static void main(String[] args) {
        String s = "accaaacbbbb";
        System.out.println(lexString(s));
    }

    static String lexString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        char middleChar = 0;

        for (char c : map.keySet()) {
            if (map.get(c) % 2 != 0) {
                oddCount++;
                middleChar = c;
            }
        }

        if (oddCount > 1) {
            return "Not possible";
        }
        
        List<Character> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        StringBuilder left = new StringBuilder();

        for (char c : keys) {
            int count = map.get(c) / 2;
            for (int i = 0; i < count; i++) {
                left.append(c);
            }
        }
        String right = left.reverse().toString();

        if (oddCount == 1) {
            return left.reverse().toString() + middleChar + right;
        } else {
            return left.reverse().toString() + right;
        }
    }
}