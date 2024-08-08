package Interface.A;

public class GoalKeeper extends Football{
    private int countOfSave;

    public GoalKeeper(int countOfRedCard, int countOfYellowCard, int countOfGoal, int countOfSave) {
        super(countOfRedCard, countOfYellowCard, countOfGoal);
        this.countOfSave = countOfSave;
    }

    public int getCountOfSave() {
        return countOfSave;
    }

    public void setCountOfSave(int countOfSave) {
        this.countOfSave = countOfSave;
    }
}
