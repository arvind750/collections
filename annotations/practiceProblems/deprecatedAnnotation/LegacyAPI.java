package practiceProblems.deprecatedAnnotation;

// Legacy API class
public class LegacyAPI {
    @Deprecated
    public void oldFeature(){
        System.out.println("This is the old feature. Please use newFeature() instead.");
    }

    public void newFeature(){
        System.out.println("This is the new and improved feature.");
    }
}
