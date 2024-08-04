package Polymorphizm2;

public class Triangly extends GeometricFigure{
    private int a;
    private int b;
    private int c;

    public Triangly() {
    }

    public Triangly(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    @Override
    public double trianglyPeremetr() {
        double peremetr = (a + b + c);
        return peremetr;
    }
    @Override
    public double trianglyArea(){

        double  p=(a+b+c)/2;
        double area=Math.sqrt((p)*(p-a)*(p-b)*(p-c));
        return area;

    }
}

class Main{
    public static void main(String[] args) {
        Triangly triangly = new Triangly(3,4,5);
        System.out.println("triangly.trianglyArea() = " + triangly.trianglyPeremetr());
        System.out.println("triangly.trianglyArea() = " + triangly.trianglyArea());
    }
}
