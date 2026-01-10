package skillforge;

public class Student extends User {

    private int progress;   // percentage
    private int score;

    public Student(String name) {
        super(name);
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules;  // operator usage
    }

    public void calculateScore(int marksObtained, int totalMarks) {
        score = (marksObtained * 100) / totalMarks;
    }

    public int getProgress() {
        return progress;
    }

    public int getScore() {
        return score;
    }

    @Override
    public void displayRole() {
        System.out.println("Student: " + name);
    }
}
