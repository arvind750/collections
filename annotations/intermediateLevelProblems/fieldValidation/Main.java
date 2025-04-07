package intermediateLevelProblems.fieldValidation;

public class Main {
    public static void main(String[] args) {
        try{
            // Attempt to create a User object with a username that exceeds the max length (10 characters)
             // This should trigger an IllegalArgumentException
            User user = new User("VeryLongUsername");
        }
        catch(IllegalArgumentException e){
            // Catch the exception and display a validation error message
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}
