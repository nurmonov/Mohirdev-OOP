package Inheritanse.B;

public class Eloctronics {
    private String name;
    private int wott;

    public Eloctronics(String name, int wott) {
        this.name = name;
        this.wott = wott;
    }

    public Eloctronics() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getWott() {
        return wott;
    }

    public void setWott(int wott) {
        this.wott = wott;
    }

    public void print(){
        System.out.println("name: "+name+"\nwatt: "+wott);
    }
}
