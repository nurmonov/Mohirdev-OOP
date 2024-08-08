package Interface.A;

public class Football extends Players {
    private int countOfRedCard;
    private int countOfYellowCard;
    private int countOfGoal;

    public Football(int countOfRedCard, int countOfYellowCard, int countOfGoal) {
        this.countOfRedCard = countOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
        this.countOfGoal = countOfGoal;
    }

    public int getCountOfRedCard() {
        return countOfRedCard;
    }

    public void setCountOfRedCard(int countOfRedCard) {
        this.countOfRedCard = countOfRedCard;
    }

    public int getCountOfYellowCard() {
        return countOfYellowCard;
    }

    public void setCountOfYellowCard(int countOfYellowCard) {
        this.countOfYellowCard = countOfYellowCard;
    }

    public int getCountOfGoal() {
        return countOfGoal;
    }

    public void setCountOfGoal(int countOfGoal) {
        this.countOfGoal = countOfGoal;
    }
}
