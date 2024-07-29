package Inheritanse.A;

public class Doctor {
    private String name;
    private String phoneNumber;
    private float prince;
    private String workTime;

    public Doctor(String name, String phoneNumber, float prince, String workTime) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.prince = prince;
        this.workTime = workTime;
    }

    public Doctor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getPrince() {
        return prince;
    }

    public void setPrince(float prince) {
        this.prince = prince;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }
    public void print(){
        System.out.println("name: "+name+"\nworkTime: "+workTime+"\nphoneNumber: "+phoneNumber+"\nprince: "+prince);
    }
}
