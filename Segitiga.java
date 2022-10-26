import interfacebangunruang.SegitigaInterface;

public class Segitiga implements SegitigaInterface {

    @Override
    public double luasSegitiga(double s1, double s2) {
        double luas = 0.5 * s1 * s2;
        return luas;
    }

    @Override
    public double kelilingSegitiga(double s1, double s2, double s3) {
        double kel = s1 + s2 + s3;
        return kel;
    }

}