package practiceProblems.repeatableAnnotation;

import java.lang.reflect.Method;

class Main{
    public static void main(String[] args) {
        try {
            Method method = BugTracker.class.getMethod("process");
    
            // Check if the method has @BugReports annotations
            if (method.isAnnotationPresent(BugReports.class)) {
                BugReports bugReports = method.getAnnotation(BugReports.class);
                for (BugReport bugReport : bugReports.value()) {
                    System.out.println("Bug Description: " + bugReport.description());
                }
            }
        } 
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
