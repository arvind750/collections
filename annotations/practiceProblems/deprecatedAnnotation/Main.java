package practiceProblems.deprecatedAnnotation;

public class Main {
    public static void main(String[] args) {
        LegacyAPI legacy = new LegacyAPI();
        legacy.oldFeature();  // This will show a warning
        legacy.newFeature(); // Recommended method
    }
}
