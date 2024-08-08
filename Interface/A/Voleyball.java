package Interface.A;

public class Voleyball extends Players {
    private int numberOfPoint;

    public Voleyball(int numberOfPoint) {
        this.numberOfPoint = numberOfPoint;
    }

    public int getNumberOfPoint() {
        return numberOfPoint;
    }

    public void setNumberOfPoint(int numberOfPoint) {
        this.numberOfPoint = numberOfPoint;
    }
}
