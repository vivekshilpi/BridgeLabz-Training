package medistore;

public interface ISellable {

    boolean checkExpiry();
    void sell(int quantity);
}
