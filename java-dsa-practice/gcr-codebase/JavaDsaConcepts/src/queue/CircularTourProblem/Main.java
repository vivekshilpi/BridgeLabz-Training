package queue.CircularTourProblem;

public class Main {
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        CircularTour tour = new CircularTour();
        int start = CircularTour.findStartingPoint(petrol, distance);
        System.out.println(start);

    }
}
