package bag_n_ball;

class Ball implements Storable {
    private String id;
    private String color;
    private String size; // small, medium, large

    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    // Getters & Setters (Encapsulation)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ball[ID=" + id + ", Color=" + color + ", Size=" + size + "]";
    }
}
