import java.util.ArrayList;
import java.util.List;

// Abstract CourseType class
abstract class CourseType {
    abstract String getEvaluationType();
}

// Specific Course Types
class ExamCourse extends CourseType {
    @Override
    public String getEvaluationType() {
        return "Exam-Based";
    }
}

class AssignmentCourse extends CourseType {
    @Override
    public String getEvaluationType() {
        return "Assignment-Based";
    }
}

class ResearchCourse extends CourseType {
    @Override
    public String getEvaluationType() {
        return "Research-Based";
    }
}

// Generic Course class
class Course<T extends CourseType> {
    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + " (Evaluation Type: " + courseType.getEvaluationType() + ")";
    }
}

// Course Catalog
class CourseCatalog {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void showCourses() {
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }
}

public class import java.util.ArrayList;
import java.util.List;

// Abstract CourseType class
abstract class CourseType {
    abstract String getEvaluationType();
}

// Specific Course Types
class ExamCourse extends CourseType {
    @Override
    public String getEvaluationType() {
        return "Exam-Based";
    }
}

class AssignmentCourse extends CourseType {
    @Override
    public String getEvaluationType() {
        return "Assignment-Based";
    }
}

class ResearchCourse extends CourseType {
    @Override
    public String getEvaluationType() {
        return "Research-Based";
    }
}

// Generic Course class
class Course<T extends CourseType> {
    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + " (Evaluation Type: " + courseType.getEvaluationType() + ")";
    }
}

// Course Catalog
class CourseCatalog {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void showCourses() {
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Mathematics", new ExamCourse());
        Course<AssignmentCourse> literature = new Course<>("Literature", new AssignmentCourse());
        Course<ResearchCourse> physics = new Course<>("Physics Research", new ResearchCourse());

        CourseCatalog catalog = new CourseCatalog();
        catalog.addCourse(math);
        catalog.addCourse(literature);
        catalog.addCourse(physics);

        System.out.println("University Courses:");
        catalog.showCourses();
    }
}
 {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Mathematics", new ExamCourse());
        Course<AssignmentCourse> literature = new Course<>("Literature", new AssignmentCourse());
        Course<ResearchCourse> physics = new Course<>("Physics Research", new ResearchCourse());

        CourseCatalog catalog = new CourseCatalog();
        catalog.addCourse(math);
        catalog.addCourse(literature);
        catalog.addCourse(physics);

        System.out.println("University Courses:");
        catalog.showCourses();
    }
}
