package Inheritanse.A;

public class Lor extends Doctor {
    private int getInformationCost;

    public Lor(String name, String phoneNumber, float prince, String workTime, int getInformationCost) {
        super(name, phoneNumber, prince, workTime);
        this.getInformationCost = getInformationCost;
    }

    public Lor() {
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
