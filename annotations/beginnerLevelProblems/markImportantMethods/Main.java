package beginnerLevelProblems.markImportantMethods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        TaskManager task = new TaskManager();

        try{
            // Get all methods from the class
            Method methods[] = task.getClass().getDeclaredMethods();

            // Loop through each method and check for the @ImportantMethod annotation
           for(Method method : methods){
                if(method.isAnnotationPresent(ImportantMethod.class)){
                    // Retrieve the annotation
                    ImportantMethod important = method.getAnnotation(ImportantMethod.class);

                    // Print method name and importance level
                    System.out.println("Method: " + method.getName());
                    System.out.println("Importance Level: " + important.level());
                    System.out.println();
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

