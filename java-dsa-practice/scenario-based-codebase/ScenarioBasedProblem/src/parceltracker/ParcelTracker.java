package parceltracker;

public class ParcelTracker {

    private StageNode head;

    // Add initial stage
    public void addStage(String stage) {
        StageNode newNode = new StageNode(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        StageNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add custom intermediate checkpoint after a given stage
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null && !temp.stage.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found: " + afterStage);
            return;
        }

        StageNode newNode = new StageNode(newStage);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Forward tracking through stages
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost! No tracking available.");
            return;
        }

        StageNode temp = head;
        while (temp != null) {
            System.out.print(temp.stage);
            if (temp.next != null)
                System.out.print(" → ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Handle lost/missing parcel (null pointer scenario)
    public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as LOST.");
    }
}
