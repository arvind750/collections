package practiceProblems.customAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME) // Make it available at runtime
@Target(ElementType.METHOD) // Can only be used on methods
public @interface TaskInfo {
    String priority(); // Field for task priority
    String assignedTo(); // Field for assigned person
}
