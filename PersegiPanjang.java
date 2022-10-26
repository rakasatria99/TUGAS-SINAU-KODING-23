
import interfacebangunruang.PersegiPanjangInterface;

public class PersegiPanjang implements PersegiPanjangInterface {

    @Override
    public double luasPersegiPanjang(double s1, double s2) {
        double luas = s1 * s2;
        return luas;
    }

    @Override
    public double kelilingPersegiPanjang(double s1, double s2) {
        double kel = 2 * (s1 + s2);
        return kel;
    }

}