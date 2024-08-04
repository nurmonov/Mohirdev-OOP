package Polymorphizm2.A;

public class GeometricFigure {
    int a;
    int b;
    int c;
    int h;
    public double trianglyArea(){

      double  p=(a+b+c)/2;
        double area=Math.sqrt((p)*(p-a)*(p-b)*(p-c));
        return area;

    }
    public double trianglyPeremetr(){
        double peremetr =(a+b+c);
        return peremetr;
    }
    public double rectanglyPeremetr(){
        double peremetr =(a+b)*2;
        return peremetr;
    }
    public double rectanglyArea(){

        return a*b;
    }

    public double trapeziumArea(){

        return (a+b)/2*h;
    }


}
