package Inheritanse.A;

public class Xirurg extends  Doctor{

    private int getInformationCost;

    public Xirurg(String name, String phoneNumber, float prince, String workTime, int getInformationCost) {
        super(name, phoneNumber, prince, workTime);
        this.getInformationCost = getInformationCost;
    }

    public Xirurg() {
    }

    public int getGetInformationCost() {
        return getInformationCost;
    }

    public void setGetInformationCost(int getInformationCost) {
        this.getInformationCost = getInformationCost;
    }
    public void print(){
        super.print();
        System.out.println("getInformationCost = " + getInformationCost);
    }
}
