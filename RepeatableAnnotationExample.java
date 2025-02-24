import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}


class SoftwareModule {
    @BugReport(description = "Null pointer exception in edge cases")
    @BugReport(description = "Performance issue when processing large data")
    public void process() {
        System.out.println("Processing...");
    }
}


public class RepeatableAnnotationExample {
    public static void main(String[] args) throws Exception {
        Method method = SoftwareModule.class.getMethod("process");
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);
        for (BugReport bug : bugReports) {
            System.out.println("Bug Report: " + bug.description());
        }
    }
}
