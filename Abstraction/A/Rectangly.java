package Abstraction.A;

public class Rectangly extends GeometricFigure{
    int a;
    int b;
    @Override
    void peremetr() {
        System.out.println((a+b)*2);
    }

    @Override
    void area() {
        System.out.println(a*b);
    }
}
