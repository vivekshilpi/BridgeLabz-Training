package examcell;

class Student {
    int rollNo;
    String name;
    double score;

    Student(int rollNo, String name, double score) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
    }

    void display() {
        System.out.println(rollNo + " | " + name + " | Score: " + score);
    }
}
