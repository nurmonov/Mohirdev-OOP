package Interface.B;

public class BaseConvert implements BaseConvertInterface{
    private int kalvin;

    public BaseConvert(int kalvin) {
        this.kalvin = kalvin;
    }

    public int getKalvin() {
        return kalvin;
    }

    @Override
    public double farengeyt() {
        return (kalvin-275)*9/5+32;
    }

    @Override
    public double temperature() {
        return kalvin-273;
    }
}

