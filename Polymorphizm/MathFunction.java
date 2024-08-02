package Polymorphizm;

public class MathFunction {

    public int add(int a,int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public long add(long a, long b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }
    public double sub(double a, double b){
        return a-b;
    }
    public long sub(long a, long b){
        return a-b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public double div(double a, double b){
        return a/b;
    }
    public long div(long a, long b){
        return a/b;
    }

    public double pow(double a, double b){
        return Math.pow(a,b);
    }
    public int abs(int a){
        return a>0?a:(-1)*a;
    }
    public double abs(double a){
        return a>0?a:(-1)*a;
    }
    public long abs(long a){
        return a>0?a:(-1)*a;
    }

}
class test{
    public static void main(String[] args) {
        MathFunction mathFunction = new MathFunction();
        System.out.println("mathFunction.abs(5) = " + mathFunction.abs(5));
        System.out.println("mathFunction.add(4,6) = " + mathFunction.add(4, 6));
        System.out.println("mathFunction.div(3,5) = " + mathFunction.div(3, 5));
        

    }
}



