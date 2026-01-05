package hashmap.ImplementCustomHashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Insert some key-value pairs
        map.put("Om", 10);
        map.put("Harshveer", 50);
        map.put("Durgesh", 25);

        // Retrieve values
        System.out.println("Om's age: " + map.get("Om"));
        System.out.println("Harshveer's age: " + map.get("Harshveer"));

        // Remove a key-value pair
        map.remove("Durgesh");
        System.out.println("Durgesh's age after removal: " + map.get("Durgesh"));

        // Check if the map contains a key
        System.out.println("Contains 'Om': " + map.containsKey("Om"));
        System.out.println("Contains 'Bipin': " + map.containsKey("Bipin"));
    }
}
