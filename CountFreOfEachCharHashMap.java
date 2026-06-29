import java.util.HashMap;

class CountFreOfEachCharHashMap {
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();

        String s = "Sachin Verma";

        for (char c : s.toCharArray()) {
           // if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c,0) + 1);
            //} else {
            //    map.put(c, 1);
           // }
        }

        System.out.println(map);
    }
}