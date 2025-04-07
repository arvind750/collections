package intermediateLevelProblems.loggingExecutionTime;

public class TaskManager{
    @LogExecutionTime // Applying annotation to measure execution time
    public void performTask1(){
        try{
            // Simulating a task by sleeping for 1 second
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Task 1 completed");
    }

    @LogExecutionTime  // Applying annotation to measure execution time
    public void performTask2(){
        try{
            // Simulating a task by sleeping for 0.5 second
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Task 1 completed");
    }

    public void performNormalTask(){
        System.out.println("Normal task completed without logging execution time.");
    }
}