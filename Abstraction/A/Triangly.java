package Abstraction.A;

public class Triangly extends GeometricFigure{
    double a;
    double b;
    double c;

    @Override
    void peremetr() {
        System.out.println(a+b+c);
    }

    @Override
    void area() {
        double p=(a+b+c)/2;
        System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
