package beginnerLevelProblems.pendingTasks;

public class TodoManager {
    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void implementLoginFeature() {
        System.out.println("Implementing the login feature...");
    }

    @Todo(task = "Fix bug in payment module", assignedTo = "Bob", priority = "LOW")
    public void fixPaymentBug() {
        System.out.println("Fixing the bug in the payment module...");
    }

    @Todo(task = "Refactor user profile page", assignedTo = "Charlie") // Default priority is MEDIUM
    public void refactorProfilePage() {
        System.out.println("Refactoring the user profile page...");
    }
}
