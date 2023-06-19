import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        // create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // add key-value pairs to the map
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        // retrieve values from the map
        int appleCount = map.get("apple");
        int bananaCount = map.get("banana");
        int orangeCount = map.get("orange");

        // print the values
        System.out.println("There are " + appleCount + " apples.");
        System.out.println("There are " + bananaCount + " bananas.");
        System.out.println("There are " + orangeCount + " oranges.");
    }
}