package Inheritanse.A;

public class Main {
    public static void main(String[] args) {

        Xirurg xirurg = new Xirurg();
        System.out.println("        XIRURG    ");
        xirurg.setName("aliyev");
        xirurg.setPhoneNumber("9989045455");
        xirurg.setPrince(300_000);
        xirurg.setWorkTime("8:00 to 16:00");
        xirurg.setGetInformationCost(100_000);
        xirurg.print();


        Lor lor = new Lor();
        System.out.println("        LOR   ");
        lor.setName("valiyev");
        lor.setPhoneNumber("9989034564554");
        lor.setWorkTime("10:00 to 18:00");
        lor.setPrince(500_000);
        lor.setGetInformationCost(200_000);
        lor.print();
    }

}
