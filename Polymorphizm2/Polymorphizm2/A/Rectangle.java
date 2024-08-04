package Polymorphizm2.A;

public class Rectangle  extends GeometricFigure {
    private int a;
    private int b;

    public Rectangle(int sideA, int sideB) {
        this.a = sideA;
        this.b = sideB;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double rectanglyArea(){
        return a*b;
    }

    @Override
    public double rectanglyPeremetr() {
        return (a+b)*2;
    }

}
class Test{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 5);
        System.out.println("rectangle.rectanglyArea() = " + rectangle.rectanglyArea());
        System.out.println("rectangle.rectanglyPeremetr() = " + rectangle.rectanglyPeremetr());
    }
}
