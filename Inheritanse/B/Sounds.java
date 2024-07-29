package Inheritanse.B;

public class Sounds  extends Eloctronics{
    private int watt;
    private String names;

    public Sounds(String name, int wott, int watt, String names) {
        super(name, wott);
        this.watt = watt;
        this.names = names;
    }

    public Sounds() {
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}
