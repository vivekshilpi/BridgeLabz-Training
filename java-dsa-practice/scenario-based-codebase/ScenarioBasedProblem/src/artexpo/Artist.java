package artexpo;

public class Artist {
    String name;
    long registrationTime;   

    Artist(String name, long registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    void display() {
        System.out.println(registrationTime + " → " + name);
    }
}
