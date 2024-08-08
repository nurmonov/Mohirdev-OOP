package Interface.A;

public class Basketball extends Players {
    private int numberOfGoal;

    public Basketball(int countOfGoal) {
        this.numberOfGoal = countOfGoal;
    }

    public int getNumberOfGoal() {
        return numberOfGoal;
    }

    public void setNumberOfGoal(int numberOfGoal) {
        this.numberOfGoal = numberOfGoal;
    }
}
