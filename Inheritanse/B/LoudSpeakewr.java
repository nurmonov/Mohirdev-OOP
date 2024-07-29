package Inheritanse.B;

public class LoudSpeakewr extends Sounds{
    private int lootbas;
    private int bataryWatt;

    public LoudSpeakewr(String name, int wott, int watt, String names, int lootbas, int bataryWatt) {
        super(name, wott, watt, names);
        this.lootbas = lootbas;
        this.bataryWatt = bataryWatt;
    }

    public LoudSpeakewr() {
    }

    public int getLootbas() {
        return lootbas;
    }

    public void setLootbas(int lootbas) {
        this.lootbas = lootbas;
    }

    public int getBataryWatt() {
        return bataryWatt;
    }

    public void setBataryWatt(int bataryWatt) {
        this.bataryWatt = bataryWatt;
    }
}
