package beginnerLevelProblems.markImportantMethods;

public class TaskManager {
     // Marking the 'completeCriticalTask' method as HIGH importance
    // This indicates that this method is critical and should be prioritized
    @ImportantMethod(level = "HIGH")
    public void completeCriticalTask(){
        System.out.println("Completing critical task...");
    }

    
    // Marking the 'completeMinorTask' method as LOW importance
    // This indicates that this method is of lesser priority
    @ImportantMethod(level = "LOW")
    public void completeMinorTask(){
        System.out.println("Completing minor task...");
    }

    // Marking the 'completeGeneralTask' method with the default level "HIGH"
    // Since no level is provided, it will use the default value "HIGH"
    @ImportantMethod() // Using default level "HIGH"
    public void completeTask(){
        System.out.println("Completing general task...");
    }
}
