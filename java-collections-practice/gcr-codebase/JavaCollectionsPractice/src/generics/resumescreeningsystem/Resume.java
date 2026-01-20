package generics.resumescreeningsystem;

public class Resume<T extends JobRole> {

    private T jobRole;

    Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void process() {
        jobRole.screen();
    }
}
