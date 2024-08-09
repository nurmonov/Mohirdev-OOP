package OopMustaqil2;

public class MyTime1 {
    private int hour;
    private int minute;
    private int second;

    public MyTime1(int hour, int minute, int second) {
        setHour(hour,minute,second);
    }

    public void setHour(int hour, int minute, int second){
        if(isValidHour(hour) && isValidMinute(minute) && isValidSecond(second)){
            this.hour=hour;
            this.minute=minute;
            this.second=second;
        }
        else
            System.out.println("yaroqsiz soat");

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void nextHour() {
        if(hour<23 ){
            hour++;
        }
        else {
            hour=0;

        }
    }

    public void nextMinute() {
        if(minute<59){
            minute++;
        }
        else {
            minute=0;
            nextHour();
        }
    }

    public void nextSecond() {
        if(second<59){
            second++;
        }
        else {
            second=0;
            nextMinute();
        }
    }
    public void previousHour() {
        if(hour>0 ){
            hour--;
        }
        else {
            hour=23;

        }
    }

    public void previousMinute() {
        if(minute>0){
            minute--;
        }
        else {
            minute=59;
            previousHour();
        }
    }

    public void previousSecond() {
        if(second>0){
            second--;
        }
        else {
            second=59;
            previousMinute();
        }
    }

    public boolean isValidHour(int hour){
        return hour>0 && hour<24;
    }
    public boolean isValidMinute(int minute){
        return minute>0 && minute<60;
    }
    public boolean isValidSecond(int second){
        return second>0 && second<60;
    }

}
