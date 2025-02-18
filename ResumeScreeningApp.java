import java.util.ArrayList;
import java.util.List;

// Abstract JobRole class
abstract class JobRole {
    abstract String getRoleName();
}

// Specific Job Roles
class SoftwareEngineer extends JobRole {
    @Override
    public String getRoleName() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    @Override
    public String getRoleName() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    @Override
    public String getRoleName() {
        return "Product Manager";
    }
}

// Generic Resume class
class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }

    @Override
    public String toString() {
        return "Resume: " + candidateName + " (Role: " + jobRole.getRoleName() + ")";
    }
}

// Resume Screening System
class ResumeScreeningSystem {
    private List<Resume<? extends JobRole>> resumes = new ArrayList<>();

    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    public void screenResumes() {
        System.out.println("Screening Resumes:");
        for (Resume<? extends JobRole> resume : resumes) {
            System.out.println(resume);
        }
    }

    // Generic method to process resumes dynamically
    public static <T extends JobRole> Resume<T> processResume(String candidateName, T jobRole) {
        return new Resume<>(candidateName, jobRole);
    }
}

public class ResumeScreeningApp {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = ResumeScreeningSystem.processResume("Alice Johnson", new SoftwareEngineer());
        Resume<DataScientist> dsResume = ResumeScreeningSystem.processResume("Bob Smith", new DataScientist());
        Resume<ProductManager> pmResume = ResumeScreeningSystem.processResume("Charlie Davis", new ProductManager());

        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();
        screeningSystem.addResume(seResume);
        screeningSystem.addResume(dsResume);
        screeningSystem.addResume(pmResume);

        screeningSystem.screenResumes();
    }
}
