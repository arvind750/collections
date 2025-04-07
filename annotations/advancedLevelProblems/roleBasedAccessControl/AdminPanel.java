package advancedLevelProblems.roleBasedAccessControl;

public class AdminPanel {
    @RoleAllowed("ADMIN")
    public void accessAdminDashboard() {
        System.out.println("Welcome to the Admin Dashboard!");
    }

    // Method that anyone can access
    public void publicInfo() {
        System.out.println("This is public information.");
    }
}
