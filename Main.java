import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
//        MUHAMMAD RAKA SATRIA
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
        }
        while (ulang != 't');

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
                System.out.print("Masukan sisi persegi: ");
                double sisi = input.nextDouble();
                System.out.print("Luas persegi adalah: " + luasPersegi(sisi));
                System.out.println("\n\n");
            } else if (menuPersegi == 2) {
                System.out.print("Masukan sisi persegi : ");
                double sisi = input.nextDouble();
                System.out.print("Keliling persegi adalah : " + kelilingPersegi(sisi));
                System.out.println("\n\n");
            } else if (menuPersegi == 3) {
                mainMenu();

            }
        }

    }

    public static double luasPersegi(double s) {
        return s * s;
    }

    public static double kelilingPersegi(double s) {
        return 4 * s;
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
                System.out.print("Masukan panjang : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan lebar : ");
                double s2 = input.nextDouble();
                System.out.print("Luas persegi panjang adalah : " + luasPersegiPanjang(s1, s2));
                System.out.println("\n\n");
            } else if (menuPersegiPanjang == 2) {
                System.out.print("Masukan panjang : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan lebar : ");
                double s2 = input.nextDouble();
                System.out.print("Keliling persegi panjang adalah : " + kelilingPersegiPanjang(s1, s2));
                System.out.println("\n\n");
            } else if (menuPersegiPanjang == 3) {
                mainMenu();
            }
        }
    }

    public static double luasPersegiPanjang(double s1, double s2) {
        return (s1 * s2);
    }

    public static double kelilingPersegiPanjang(double s1, double s2) {
        return (2 * (s1 + s2));
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
                System.out.print("Masukan alas : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan tinggi : ");
                double s2 = input.nextDouble();
                System.out.print("Luas segitiga adalah : " + luasSegitiga(s1, s2));
                System.out.println("\n\n");
            } else if (menuSegitiga == 2) {
                System.out.print("Masukan alas : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan tinggi : ");
                double s2 = input.nextDouble();
                System.out.print("Masukan sisi miring : ");
                double s3 = input.nextDouble();
                System.out.print("Keliling segitiga adalah : " + kelilingSegitiga(s1, s2, s3));
                System.out.println("\n\n");
            } else if (menuSegitiga == 3) {
                mainMenu();
            }
        }
    }

    public static double luasSegitiga(double s1, double s2) {
        return (0.5 * s1 * s2);
    }

    public static double kelilingSegitiga(double s1, double s2, double s3) {
        return (s1 + s2 + s3);
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
                System.out.print("Masukan jari-jari : ");
                double r = input.nextDouble();
                double pi = 3.14;
                System.out.print("Luas lingkaran adalah : " + luasLingkaran(r, pi));
                System.out.println("\n\n");
            } else if (menuLingkaran == 2) {
                System.out.print("Masukan jari-jari : ");
                double r = input.nextDouble();
                double pi = 3.14;
                System.out.print("Keliling lingkaran adalah : " + kelilingLingkaran(r, pi));
                System.out.println("\n\n");
            } else if (menuLingkaran == 3) {
                mainMenu();
            }
        }
    }

    public static double luasLingkaran(double r, double pi) {
        return (pi * r * r);
    }

    public static double kelilingLingkaran(double r, double pi) {
        return (2 * pi * r);
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
                System.out.print("Masukan alas : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan alas : ");
                double s2 = input.nextDouble();
                System.out.print("Luas Jajar Genjang adalah : " + luasJajarGenjang(s1, s2));
                System.out.println("\n\n");
            } else if (menujajarGenjang == 2) {
                System.out.print("Masukan alas : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan sisi miring : ");
                double s2 = input.nextDouble();
                System.out.print("Keliling Jajar Genjang adalah : " + kelilingJajarGenjang(s1, s2));
                System.out.println("\n\n");
            } else if (menujajarGenjang == 3) {
                mainMenu();
            }
        }
    }

    public static double luasJajarGenjang(double s1, double s2) {
        return (s1 * s2);
    }

    public static double kelilingJajarGenjang(double s1, double s2) {
        return (2 * (s1 + s2));
    }
}

