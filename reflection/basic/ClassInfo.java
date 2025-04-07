package basic;
import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.util.ArrayList"); 

        System.out.println("Methods:");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        System.out.println("\nFields:");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(f.getName());
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> c : clazz.getDeclaredConstructors()) {
            System.out.println(c);
        }
    }
}
