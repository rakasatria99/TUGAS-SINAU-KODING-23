
import interfacebangunruang.PersegiInterface;

public class Persegi implements PersegiInterface {

    @Override
    public double luasPersegi(double sisi) {
        double luas = sisi * sisi;
        return luas;
    }

    @Override
    public double kelilingPersegi(double sisi) {
        double kel = 4 * sisi;
        return kel;
    }

}