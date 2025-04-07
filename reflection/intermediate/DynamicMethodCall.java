package intermediate;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodCall {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = sc.next();

        Class<?> clazz = MathOperations.class;
        Method method = clazz.getDeclaredMethod(methodName, int.class, int.class);

        MathOperations obj = new MathOperations();
        Object result = method.invoke(obj, 10, 5);
        System.out.println("Result: " + result);
    }
}
