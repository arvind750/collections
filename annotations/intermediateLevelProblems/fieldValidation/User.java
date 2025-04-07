package intermediateLevelProblems.fieldValidation;

import java.lang.reflect.Field;

public class User {
    @MaxLength(10)  // Max length annotation for the userName field
    String userName;

    // Constructor
    public User(String userName) {
        // Validate the userName when the object is created
        validateMaxLength(this, "userName", userName);
        this.userName = userName;
    }

    // Method to validate max length for any field
    public void validateMaxLength(Object obj, String fieldName, String value) {
        try {
            // Get the field using reflection
            Field field = obj.getClass().getDeclaredField(fieldName); 
            // Get the MaxLength annotation from the field
            MaxLength maxLength = field.getAnnotation(MaxLength.class);

            // If annotation exists, validate the length of the value
            if (maxLength != null && value.length() > maxLength.value()) {
                // Throw an IllegalArgumentException if the length exceeds the max value
                throw new IllegalArgumentException(fieldName + " exceeds max length of " + maxLength.value());
            }
        } catch (NoSuchFieldException e) {
            // Catch NoSuchFieldException if the field doesn't exist
            throw new RuntimeException("Field " + fieldName + " not found", e);
        }
    }

    // Getter for userName
    public String getUserName() {
        return userName;
    }
}
