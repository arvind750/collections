package practiceProblems.suppressUncheckedWarnings;

import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Raw ArrayList (without generics)
        ArrayList list = new ArrayList();

        list.add("Hello"); // String data type adding to list
        list.add(10); // int data type adding to list

        System.out.println("List contents: " + list);
    }
}
