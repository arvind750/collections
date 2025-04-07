package practiceProblems.customAnnotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        // Create an instance of TaskManager
        TaskManager task = new TaskManager();

        try {
            // Get the 'completeTask' method using reflection
            Method method = task.getClass().getMethod("completeTask");

            // Check if the method has the @TaskInfo annotation
            if (method.isAnnotationPresent(TaskInfo.class)) {
                // Retrieve the annotation
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                // Print annotation details
                System.out.println("Task Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }
        } 
        catch (NoSuchMethodException e) {
            e.printStackTrace(); // Handle the exception if the method is not found
        }
    }
}
