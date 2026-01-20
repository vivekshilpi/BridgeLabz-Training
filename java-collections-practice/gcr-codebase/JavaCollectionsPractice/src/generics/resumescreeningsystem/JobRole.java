package generics.resumescreeningsystem;

public abstract class JobRole {

    String candidateName;

    JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    abstract void screen();
}
