public class Plane {
    public String planeID;
    public int capacity;

    public Plane(String planeID, int capacity) {
        this.planeID = planeID;
        this.capacity = capacity;
    }

    public String getPlaneID() {
        return planeID;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return planeID + " (" + capacity + " people)";
    }
}
