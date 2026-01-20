package generics.resumescreeningsystem;

public class ProductManager extends JobRole {

    ProductManager(String name) {
        super(name);
    }

    @Override
    void screen() {
        System.out.println(candidateName +
                " screened for Product Manager (Strategy, Communication)");
    }
}
