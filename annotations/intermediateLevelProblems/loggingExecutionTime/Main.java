package intermediateLevelProblems.loggingExecutionTime;

import java.lang.reflect.Method;
import beginnerLevelProblems.markImportantMethods.TaskManager;

public class Main {
    public static void main(String[] args) {
        TaskManager manager= new TaskManager();

        try{
            // Get the methods of TaskManager class
            Method task1 = manager.getClass().getMethod("performTask1");
            Method task2 = manager.getClass().getMethod("performTask2");
            Method normalTask = manager.getClass().getMethod("performNormalTask");

            // Log execution times for the methods
            MethodExecutionLogger.LogExecutionTime(task1, manager);
            MethodExecutionLogger.LogExecutionTime(task2, manager);
            MethodExecutionLogger.LogExecutionTime(normalTask, manager);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
