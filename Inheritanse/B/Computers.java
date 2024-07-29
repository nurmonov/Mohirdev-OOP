package Inheritanse.B;

public class Computers extends Eloctronics{
    private String type;
    private int hard;
    private int aperatifka;

    public Computers(String name, int wott, String type, int hard, int aperatifka) {
        super(name, wott);
        this.type = type;
        this.hard = hard;
        this.aperatifka = aperatifka;
    }

    public Computers() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHard() {
        return hard;
    }

    public void setHard(int hard) {
        this.hard = hard;
    }

    public int getAperatifka() {
        return aperatifka;
    }

    public void setAperatifka(int aperatifka) {
        this.aperatifka = aperatifka;
    }
    public void print(){
        System.out.println("type:  "+type+"\nhard:  "+hard+"\naperatifka:  "+aperatifka);
    }
}
