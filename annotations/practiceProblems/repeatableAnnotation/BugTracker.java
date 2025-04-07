package practiceProblems.repeatableAnnotation;

//Apply @BugReport twice on a method
public class BugTracker {

    @BugReport(description = "Bug 1: UI freezes when clicking the submit button.")
    @BugReport(description = "Bug 2: Application crashes on startup.")
    public void process() {
        // Method implementation
    }
}
