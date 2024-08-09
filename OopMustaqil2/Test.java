package OopMustaqil2;

public class Test {
    public static void main(String[] args) {
        MyTime1 time = new MyTime1(23,59,59);
        System.out.println(time); // 23:59:59

        time.nextSecond();
        System.out.println(time); // 00:00:00

        time.previousSecond();
        System.out.println(time); // 23:59:59

        time.setHour(12);
        time.setMinute(30);
        time.setSecond(45);
        System.out.println(time); // 12:30:45

        time.nextMinute();
        System.out.println(time); // 12:31:45

        time.nextHour();
        System.out.println(time); // 13:31:45

        time.previousMinute();
        System.out.println(time); // 13:30:45

        time.previousHour();
        System.out.println(time); // 12:30:45
    }

}
