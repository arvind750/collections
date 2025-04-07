package advancedLevelProblems.roleBasedAccessControl;

import java.lang.reflect.Method;

public class AccessControl {
    private String userRole;

    // Constructor
    public AccessControl(String userRole){
        this.userRole = userRole;
    }

    // Method to invoke a method with role check
    public void invokeWithRoleCheck(Object target, String methodName){
        try{
            // Get the method to be invoked
            Method method = target.getClass().getMethod(methodName);

             // Check if the method has the RoleAllowed annotation
            if(method.isAnnotationPresent(RoleAllowed.class)){
                RoleAllowed role = method.getAnnotation(RoleAllowed.class);
                
                // Validate the user's role
                if(role.value().equals(this.userRole)){
                    method.invoke(target); // If role matches, invoke the method
                }
                else{
                    System.out.println("Access Denied!"); // Role mismatch
                }
            }
            else{
                method.invoke(target);  // If no annotation, simply invoke the method
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
