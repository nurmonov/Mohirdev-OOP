package Mashq1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car=new Car();
        car.setModel("bmw");
        car.setcolor("black");
        car.setPrince(350_000);
        car.setAutomat("mexanika🤣");

        Triangly triangly = new Triangly(3, 4);
        System.out.println("triangly.yuza = " + triangly.yuza);
        System.out.println("triangly.yuza = " + triangly.yuza);


        Point point = new Point();
        point.setX(scanner.nextInt());
        point.setY(scanner.nextInt());
        point.setZ(scanner.nextInt());
        point.print();

    }
}
