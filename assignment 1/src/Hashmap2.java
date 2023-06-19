
import java.util.HashMap;

    public class Hashmap2 {

        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("apple", 7);
            map.put("banana", 8);
            map.put("orange", 9);
            map.remove("banana");
            System.out.println(map);
        }
    }
