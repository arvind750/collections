package advancedLevelProblems.roleBasedAccessControl;

public class Main {
    public static void main(String[] args) { 
        AdminPanel panel = new AdminPanel();

        // users with different roles
        AccessControl adminAccess = new AccessControl("ADMIN");
        AccessControl userAccess = new AccessControl("USER");

        // Admin user trying to access the admin dashboard
        adminAccess.invokeWithRoleCheck(panel, "accessAdminDashboard"); // Should print: Welcome to the Admin Dashboard!

        // Non-admin user trying to access the admin dashboard
        userAccess.invokeWithRoleCheck(panel, "accessAdminDashboard"); // Should print: Access Denied!

        // Anyone can access public information
        adminAccess.invokeWithRoleCheck(panel, "publicInfo"); // Should print: This is public information.
    }
}
