package Interface.A;

public class Setter  extends Voleyball{
    private int countOfSet;

    public Setter(int numberOfPoint, int countOfSet) {
        super(numberOfPoint);
        this.countOfSet = countOfSet;
    }

    public int getCountOfSet() {
        return countOfSet;
    }

    public void setCountOfSet(int countOfSet) {
        this.countOfSet = countOfSet;
    }
}
