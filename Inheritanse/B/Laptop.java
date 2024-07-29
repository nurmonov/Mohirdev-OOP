package Inheritanse.B;

public class Laptop extends Computers {
    private int powerTime;
    private String windows;
    private int prince;

    public Laptop(String name, int wott, String type, int hard, int aperatifka, int powerTime, String windows, int prince) {
        super(name, wott, type, hard, aperatifka);
        this.powerTime = powerTime;
        this.windows = windows;
        this.prince = prince;
    }

    public Laptop() {

    }

    public int getPowerTime() {
        return powerTime;
    }

    public void setPowerTime(int powerTime) {
        this.powerTime = powerTime;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public int getPrince() {
        return prince;
    }

    public void setPrince(int prince) {
        this.prince = prince;
    }
    public void print(){
        super.print();
        System.out.println("windows: "+windows+"\nprince: "+prince+"\npowerTime: "+powerTime);
    }
}
