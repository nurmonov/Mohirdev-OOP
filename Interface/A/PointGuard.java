package Interface.A;

public class PointGuard  extends Basketball{
    private int countOfGuard;

    public PointGuard(int countOfGoal, int countOfGuard) {
        super(countOfGoal);
        this.countOfGuard = countOfGuard;
    }

    public int getCountOfGuard() {
        return countOfGuard;
    }

    public void setCountOfGuard(int countOfGuard) {
        this.countOfGuard = countOfGuard;
    }
}
