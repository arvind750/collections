package advancedLevelProblems.customSerialization;

public class Main {
    public static void main(String[] args) {
        // Create a User object
        User user = new User("JohnDoe", 30);

        // Serialize the object to JSON using the custom serializer
        String json = JsonSerializer.toJson(user);

        // Output the JSON string
        System.out.println(json);
    }
}

