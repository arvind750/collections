package beginnerLevelProblems.pendingTasks;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        TodoManager manager = new TodoManager();

        try{
            // Get all methods from the class
            Method methods[] = manager.getClass().getDeclaredMethods();

            // Loop through each method and check for the @Todo annotation
            for(Method method : methods){
                if(method.isAnnotationPresent(Todo.class)){
                    // Retrieve the Todo annotation
                    Todo todo = method.getAnnotation(Todo.class);

                    // Print the details of each pending task
                    System.out.println("Task: " + todo.task());
                    System.out.println("Assigned To: " + todo.assignedTo());
                    System.out.println("Priority: " + todo.priority());
                    System.out.println("Method: " + method.getName());
                    System.out.println();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
