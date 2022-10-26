import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        // MUHAMMAD RAKA SATRIA
        int menu;
        char ulang;

        do {
            System.out.println("\n");
            System.out.println("=============MENU UTAMA=============");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");

            System.out.print("Masukan pilihan menu : ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    persegi();
                case 2:
                    persegiPanjang();
                case 3:
                    segitiga();
                case 4:
                    lingkaran();
                case 5:
                    jajarGenjang();
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
            System.out.println();

            System.out.print("Ingin memilih menu lain (y/t)? ");
            ulang = input.next().charAt(0);

            System.out.println();
        } while (ulang != 't');

        System.out.println("Terimakasih!");
    }

    public static void persegi() {

        int menuPersegi = 0;

        while (menuPersegi != 3) {

            System.out.println("\n\n============= Menu Persegi=============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan Pilihan : ");
            menuPersegi = input.nextInt();

            if (menuPersegi == 1) {
                menghitungLuasPersegi();
            } else if (menuPersegi == 2) {
                menghitungKelilingPersegi();
            } else if (menuPersegi == 3) {
                mainMenu();
            }
        }
    }

    static void menghitungLuasPersegi() {
        System.out.print("\nMasukan sisi : ");
        double sisi = input.nextDouble();

        Persegi persegi = new Persegi();
        double luas = persegi.luasPersegi(sisi);

        System.out.println("Luas persegi dengan sisi " + sisi + " adalah " + luas);
    }

    static void menghitungKelilingPersegi() {
        System.out.print("Masukan sisi : ");
        double sisi = input.nextDouble();

        Persegi persegi = new Persegi();
        double luas = persegi.kelilingPersegi(sisi);

        System.out.println("Keliling persegi dengan sisi " + sisi + " adalah " + luas);
    }

    public static void persegiPanjang() {

        int menuPersegiPanjang = 0;

        while (menuPersegiPanjang != 3) {

            System.out.println("\n\n =============Menu Persegi Panjang=============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan Pilihan : ");
            menuPersegiPanjang = input.nextInt();

            if (menuPersegiPanjang == 1) {
                menghitungLuasPersegiPanjang();
            } else if (menuPersegiPanjang == 2) {
                menghitungKelilingPersegiPanjang();
            } else if (menuPersegiPanjang == 3) {
                mainMenu();
            }
        }
    }

    static void menghitungLuasPersegiPanjang() {
        System.out.print("\nMasukan Panjang : ");
        double s1 = input.nextDouble();
        System.out.print("\nMasukan Lebar: ");
        double s2 = input.nextDouble();

        PersegiPanjang persegipanjang = new PersegiPanjang();
        double luas = persegipanjang.luasPersegiPanjang(s1, s2);

        System.out.println("Luas persegi panjang adalah " + luas);
    }

    static void menghitungKelilingPersegiPanjang() {
        System.out.print("\nMasukan Panjang : ");
        double s1 = input.nextDouble();
        System.out.print("\nMasukan Lebar: ");
        double s2 = input.nextDouble();

        PersegiPanjang persegipanjang = new PersegiPanjang();
        double kel = persegipanjang.kelilingPersegiPanjang(s1, s2);

        System.out.println("Keliling persegi panjang adalah " + kel);
    }

    public static void segitiga() {
        int menuSegitiga = 0;

        while (menuSegitiga != 3) {

            System.out.println("\n\n ============== Menu Segitiga=============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuSegitiga = input.nextInt();

            if (menuSegitiga == 1) {
                menghitungLuasSegitiga();
            } else if (menuSegitiga == 2) {
                menghitungKelilingSegitiga();
            } else if (menuSegitiga == 3) {
                mainMenu();
            }
        }
    }

    static void menghitungLuasSegitiga() {
        System.out.print("\nMasukan Alas: ");
        double s1 = input.nextDouble();
        System.out.print("\nMasukan Tinggi: ");
        double s2 = input.nextDouble();

        Segitiga segitiga = new Segitiga();
        double luas = segitiga.luasSegitiga(s1, s2);

        System.out.println("Luas segitiga adalah " + luas);
    }

    static void menghitungKelilingSegitiga() {
        System.out.print("\nMasukan Alas: ");
        double s1 = input.nextDouble();
        System.out.print("\nMasukan Tinggi: ");
        double s2 = input.nextDouble();
        System.out.print("\nMasukan Sisi Miring: ");
        double s3 = input.nextDouble();

        Segitiga segitiga = new Segitiga();
        double kel = segitiga.kelilingSegitiga(s1, s2, s3);

        System.out.println("Keliling segitiga adalah " + kel);
    }

    public static void lingkaran() {
        int menuLingkaran = 0;

        while (menuLingkaran != 3) {

            System.out.println("\n\n ============== Menu Lingkaran=============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuLingkaran = input.nextInt();

            if (menuLingkaran == 1) {
                menghitungLuasLingkaran();
            } else if (menuLingkaran == 2) {
                menghitungKelilingLingkaran();
            } else if (menuLingkaran == 3) {
                mainMenu();
            }
        }
    }

    static void menghitungLuasLingkaran() {
        System.out.print("\nMasukan Jari-Jari: ");
        double r = input.nextDouble();
        double phi = 3.14;

        Lingkaran lingkaran = new Lingkaran();
        double luas = lingkaran.luasLingkaran(r, phi);

        System.out.println("Luas lingkaran adalah " + luas);
    }

    static void menghitungKelilingLingkaran() {
        System.out.print("\nMasukan Jari-Jari: ");
        double r = input.nextDouble();
        double phi = 3.14;

        Lingkaran lingkaran = new Lingkaran();
        double kel = lingkaran.kelilingLingkaran(r, phi);

        System.out.println("Keliling lingkaran adalah " + kel);
    }

    public static void jajarGenjang() {
        int menujajarGenjang = 0;

        while (menujajarGenjang != 3) {

            System.out.println("\n\n ============== Menu jajarGenjang=============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menujajarGenjang = input.nextInt();

            if (menujajarGenjang == 1) {
                menghitungLuasjajarGenjang();
            } else if (menujajarGenjang == 2) {
                menghitungKelilingjajarGenjang();
            } else if (menujajarGenjang == 3) {
                mainMenu();
            }
        }
    }

    static void menghitungLuasjajarGenjang() {
        System.out.print("Masukan alas 1 : ");
        double s1 = input.nextDouble();
        System.out.print("Masukan alas 2 : ");
        double s2 = input.nextDouble();

        JajarGenjang jajargenjang = new JajarGenjang();
        double luas = jajargenjang.luasJajarGenjang(s1, s2);

        System.out.println("Luas jajar genjang adalah " + luas);
    }

    static void menghitungKelilingjajarGenjang() {
        System.out.print("Masukan alas : ");
        double s1 = input.nextDouble();
        System.out.print("Masukan sisi miring : ");
        double s2 = input.nextDouble();

        JajarGenjang jajargenjang = new JajarGenjang();
        double kel = jajargenjang.kelilingJajarGenjang(s1, s2);

        System.out.println("Keliling jajar genjang adalah " + kel);

    }
}