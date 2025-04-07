package intermediateLevelProblems.loggingExecutionTime;

import java.lang.reflect.Method;

public class MethodExecutionLogger {
    // Method to log execution time
    public static void LogExecutionTime(Method method, Object obj){
        if(method.isAnnotationPresent(LogExecutionTime.class)){
            long startTime = System.nanoTime();  // Start time before method execution
            try{
                method.invoke(obj); // Execute the method
            }
            catch(Exception e){
                e.printStackTrace();
            }

            long endTime = System.nanoTime(); // End time after method execution
            long executionTime = endTime - startTime; // Calculate the time taken
            System.out.println("Execution time of method: " + method.getName() + ": " + executionTime + " nanoseconds");
        }
    }
}
