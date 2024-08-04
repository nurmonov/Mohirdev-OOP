package Polymorphizm2;

public class Trapezium extends GeometricFigure {
    private int a;
    private int b;
    private int h;
    public Trapezium(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }



    @Override
    public double trapeziumArea() {
        return super.trapeziumArea();
    }


}
class Tesst{
    public static void main(String[] args) {
        Trapezium trapezium = new Trapezium(5, 6, 7);
        System.out.println("trapezium.trapeziumArea() = " + trapezium.trapeziumArea());


    }

}
