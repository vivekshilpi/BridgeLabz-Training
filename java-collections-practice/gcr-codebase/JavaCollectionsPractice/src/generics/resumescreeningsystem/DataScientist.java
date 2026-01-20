package generics.resumescreeningsystem;

public class DataScientist extends JobRole {

    DataScientist(String name) {
        super(name);
    }

    @Override
    void screen() {
        System.out.println(candidateName +
                " screened for Data Scientist (ML, Statistics)");
    }
}
