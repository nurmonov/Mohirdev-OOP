package Inheritanse.B;

public class PC  extends Computers{
    private String windows;
    private int prince;

    public PC(String name, int wott, String type, int hard, int aperatifka, String windows, int prince) {
        super(name, wott, type, hard, aperatifka);
        this.windows = windows;
        this.prince = prince;
    }

    public PC() {
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
        System.out.println("windows: "+windows+"\nprince: "+prince);
    }
}
