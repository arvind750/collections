package beginnerLevelProblems.pendingTasks;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Make it available at runtime
@Target(ElementType.METHOD) // Can only be applied to methods
public @interface Todo {
    String task();  // Description of the task
    String assignedTo(); // Developer responsible for the task
    String priority() default "MEDIUM"; // Default value is MEDIUM
}
