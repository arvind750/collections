package practiceProblems.customAnnotation;

public class TaskManager {
    // Applying annotation
    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeTask(){
        System.out.println("Completed the assigned task!");
    }
}
