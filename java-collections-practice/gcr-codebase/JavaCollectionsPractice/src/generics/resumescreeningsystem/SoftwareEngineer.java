package generics.resumescreeningsystem;

public class SoftwareEngineer extends JobRole {

    SoftwareEngineer(String name) {
        super(name);
    }

    @Override
    void screen() {
        System.out.println(candidateName +
                " screened for Software Engineer (DSA, System Design)");
    }
}
