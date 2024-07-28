package Mashq1;

public class Triangly {
    double a;
    double b;
    double peremetr;
    double yuza;

    public Triangly(double a, double b) {
        this.a = a;
        this.b = b;
        this.peremetr = getPeremetr();
        this.yuza = getYuza();
    }

    public double getPeremetr() {
        return a+b+Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }

    public double getYuza() {
        return a*b/2;
    }
}
