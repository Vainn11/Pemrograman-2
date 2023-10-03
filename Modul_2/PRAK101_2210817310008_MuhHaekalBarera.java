package Modul_2;
import java.util.Scanner;
public class PRAK101_2210817310008_MuhHaekalBarera {
    public static void main(String[] args) {
        String nama, tempatlahir;
        int tanggallhr, bulanlhr, tahunlhr, tinggibadan;
        float beratbadan;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        tempatlahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        tanggallhr = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Bulan Lahir (dalam angka): ");
        bulanlhr = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Tahun Lahir: ");
        tahunlhr = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Tinggi Badan: ");
        tinggibadan = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Berat Badan: ");
        beratbadan = Float.parseFloat(input.nextLine());

        String bulan = "";
        switch (bulanlhr) {
            case 1 -> bulan = "Januari";
            case 2 -> bulan = "Februari";
            case 3 -> bulan = "Maret";
            case 4 -> bulan = "April";
            case 5 -> bulan = "Mei";
            case 6 -> bulan = "Juni";
            case 7 -> bulan = "Juli";
            case 8 -> bulan = "Agustus";
            case 9 -> bulan = "September";
            case 10 -> bulan = "Oktober";
            case 11 -> bulan = "November";
            case 12 -> bulan = "Desember";
            default -> System.out.println("Pilihan tidak tersedia");
        }

        System.out.print("Nama Lengkap " + nama + ",");
        System.out.print(" Lahir di " + tempatlahir);
        System.out.print(" pada Tanggal " + tanggallhr);
        System.out.print(" " + bulan + " ");
        System.out.println(tahunlhr + " ");
        System.out.print("Tinggi Badan " + tinggibadan + " cm ");
        System.out.print("dan berat badan " + beratbadan + " kilogram");
    }
}
