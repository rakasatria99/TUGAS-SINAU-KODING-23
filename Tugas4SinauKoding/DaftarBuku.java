import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;
import dataBuku.Buku;
import bukuenum.StatusBuku;

public class DaftarBuku {
    static Scanner input = new Scanner(System.in);
    static Buku buku;

    public static void main(String[] args) {
        boolean confirm = true;
        Scanner scan = new Scanner(System.in);

        List<Buku> daftarBuku = new ArrayList<>();
        System.out.println("=============Masukkan Daftar Buku=============");

        while (confirm) {
            buku = new Buku();

            System.out.print("Masukkan Judul                  : ");
            buku.setJudul(input.next());
            System.out.print("Masukkan Penerbit               : ");
            buku.setPenerbit(input.next());
            System.out.print("Masukkan Tahun Terbit           : ");
            buku.setTahunTerbit(input.next());
            System.out.print("Masukkan Pengarang              : ");
            buku.setPengarang(input.next());
            System.out.print("Masukkan ISBN                   : ");
            buku.setIsbn(input.next());
            System.out.print("Masukkan tanggal kembali        : ");
            Date parsed = parser.stringToDate(scan.nextLine());
            buku.setTglKembali(parsed);

            if (parsed == null) {
                buku.setStatus(StatusBuku.Status.BELUM_DIKEMBALIKAN);
            } else {
                buku.setStatus(StatusBuku.Status.SUDAH_DIKEMBALIKAN);
            }

            daftarBuku.add(buku);

            System.out.print("Ingin menambahkan data lagi? (y/n) ? ");
            String conf = scan.next();

            if (conf.toLowerCase().equals("n")) {
                confirm = false;
            }
        }

        System.out.println("\n======== Daftar Buku ========");
        for (Buku buku : daftarBuku) {
            System.out.println("Judul                  :" + buku.getJudul() + "\n" + "Penerbit               :"
                    + buku.getPenerbit() + "\n"
                    + "Tahun Terbit           :" + buku.getTahunTerbit() + "\n" + "Pengarang              :"
                    + buku.getPengarang() + "\n"
                    + "ISBN                   :" + buku.getIsbn() + "\n" + "Status                 :"
                    + buku.getStatus() + "\n" + "Tanggal Kembali        : "
                    + buku.getTglKembali() + "\n");

        }
    }
}