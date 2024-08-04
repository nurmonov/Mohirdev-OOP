package Abstraction.A;

public class Trapezium extends GeometricFigure{
    int a;
    int b;
    int h;

    @Override
    void peremetr() {
        System.out.println("peremetrini topolmadm");
    }

    @Override
    void area() {
        System.out.println((a+b)*h);
    }

}
