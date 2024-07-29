package Inheritanse.B;

public class Subwofer extends Sounds {
    private int type;

    public Subwofer(String name, int wott, int watt, String names, int type) {
        super(name, wott, watt, names);
        this.type = type;
    }

    public Subwofer() {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
