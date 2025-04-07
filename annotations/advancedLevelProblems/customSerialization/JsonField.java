package advancedLevelProblems.customSerialization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Make it accessible at runtime
@Target(ElementType.FIELD) // Annotation only for fields
public @interface JsonField {
    String name();
}
