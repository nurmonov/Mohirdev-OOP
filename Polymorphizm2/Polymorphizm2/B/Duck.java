package Polymorphizm2.B;

public class Duck extends Animals{
    @Override
    public void getName(String name) {
        super.getName(name);
        System.out.println(name);
    }

    @Override
    public void souds(String soud) {
        super.souds(soud);
        System.out.println(soud);
    }
}
