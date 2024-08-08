package Interface.B;

public class Test {
    public static void main(String[] args) {
        BaseConvert baseConvert = new BaseConvert(300);
        System.out.println("baseConvert.farengeyt() = " + baseConvert.farengeyt());
        System.out.println("baseConvert.temperature() = " + baseConvert.temperature());
    }
}
