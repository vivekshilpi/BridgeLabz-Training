package bag_n_ball;

import java.util.ArrayList;

class Bag implements Storable {
    private String id;
    private String color;
    private int capacity;
    private ArrayList<Ball> balls;   // Composition

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    // Getters & Setters
    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBallCount() {
        return balls.size();
    }

    // Add Ball (with capacity check)
    public boolean addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("Bag " + id + " is full! Cannot add ball " + ball.getId());
            return false;
        }
        balls.add(ball);
        System.out.println("Ball " + ball.getId() + " added to Bag " + id);
        return true;
    }

    // Remove Ball by ID
    public boolean removeBall(String ballId) {
        for (Ball b : balls) {
            if (b.getId().equals(ballId)) {
                balls.remove(b);
                System.out.println("Ball " + ballId + " removed from Bag " + id);
                return true;
            }
        }
        System.out.println("Ball " + ballId + " not found in Bag " + id);
        return false;
    }

    // Display all balls in this bag
    public void displayBalls() {
        System.out.println("\nBalls in Bag " + id + " (" + balls.size() + "/" + capacity + "):");
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
        } else {
            for (Ball b : balls) {
                System.out.println(b);
            }
        }
    }

    @Override
    public String toString() {
        return "Bag[ID=" + id + ", Color=" + color + ", Capacity=" + capacity +
                ", CurrentBalls=" + balls.size() + "]";
    }
}
