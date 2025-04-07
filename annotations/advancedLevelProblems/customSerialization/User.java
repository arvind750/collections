package advancedLevelProblems.customSerialization;

public class User {
    @JsonField(name = "user_name")
    private String name;

    @JsonField(name = "uaer_name")
    private int age;

    // Constructor
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getters for the fields
    public String getName(){
        return name;
    }

    public int age(){
        return age;
    }
}
