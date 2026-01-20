package generics.resumescreeningsystem;

import java.util.List;

public class ResumeUtil {

    // Generic method
    public static <T extends JobRole> void processResume(Resume<T> resume) {
        resume.process();
    }

    // Wildcard method
    public static void bulkProcess(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            role.screen();
        }
    }
}
