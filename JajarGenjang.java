import interfacebangunruang.JajarGenjangInterface;

public class JajarGenjang implements JajarGenjangInterface {

    @Override
    public double luasJajarGenjang(double s1, double s2) {
        double luas = s1 * s2;
        return luas;
    }

    @Override
    public double kelilingJajarGenjang(double s1, double s2) {
        double kel = 2 * (s1 + s2);
        return kel;
    }

}