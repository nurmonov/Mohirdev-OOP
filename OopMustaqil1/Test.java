package OopMustaqil1;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("sarvar", "yunsabod", "uqimidi", 21, 78.484);
        System.out.println(student);
        Staff staff = new Staff("sarvar", "yunsabod", "10", 200_000.00);
        System.out.println("staff.toString() = " + staff.toString());
    }
}
