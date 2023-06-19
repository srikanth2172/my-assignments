

import java.util.HashMap;

    public class Hashmap1 {
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("apple", 7);
            map.put("banana", 8);
            map.put("orange", 9);
            int appleCount = map.get("apple");
            int bananaCount = map.get("banana");
            int orangeCount = map.get("orange");
            System.out.println("There are " + appleCount + " apples.");
            System.out.println("There are " + bananaCount + " bananas.");
            System.out.println("There are " + orangeCount + " oranges.");
        }
    }
