
import interfacebangunruang.LingkaranInterface;

public class Lingkaran implements LingkaranInterface {

    @Override
    public double luasLingkaran(double r, double phi) {
        double luas = phi * r * r;
        phi = 3.14;
        return luas;
    }

    @Override
    public double kelilingLingkaran(double r, double phi) {
        double kel = 2 * phi * r;
        return kel;
    }

}