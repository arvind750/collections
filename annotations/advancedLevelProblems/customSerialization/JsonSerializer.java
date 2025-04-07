package advancedLevelProblems.customSerialization;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {
    // Method to serialize an object to a JSON string
    public static String toJson(Object obj){
        // Using a Map to store the JSON representation
        Map<String, Object> jsonMap = new HashMap<>();

        // Get all fields of the object's class
        Field[] fields = obj.getClass().getDeclaredFields();

         // Loop through fields and check for the @JsonField annotation
        for(Field field : fields){
            JsonField annotation = field.getAnnotation(JsonField.class);
            if(annotation != null){
                try{
                    // Make the field accessible if it is private
                    field.setAccessible(true);

                    // Get the field's value
                    Object value = field.get(obj);

                    // Add the custom name and value to the map
                    jsonMap.put(annotation.name(), value);
                }
                catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // Convert the map to a JSON string
        StringBuilder json = new StringBuilder("{");
        for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
            json.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
        }

        // Remove the trailing comma and space, and close the JSON object
        if (json.length() > 1) {
            json.setLength(json.length() - 2);
        }
        json.append("}");

        return json.toString();
    }
}
