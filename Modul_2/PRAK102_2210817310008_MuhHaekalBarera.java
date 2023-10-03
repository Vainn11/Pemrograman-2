package Modul_2;
import java.util.Scanner;
public class PRAK102_2210817310008_MuhHaekalBarera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print(" ");
            int nilaiAwal = input.nextInt();

            int i = 0;
            while (i <= 10) {
                int nilaiSaatIni;
                if (nilaiAwal % 5 == 0) {
                    nilaiSaatIni = nilaiAwal / 5 - 1;
                    System.out.print(nilaiSaatIni);
                    if (i < 10) System.out.print(", ");
                } else {
                    nilaiSaatIni = nilaiAwal;
                    System.out.print(nilaiSaatIni);
                    if (i < 10) System.out.print(", ");
                }
                nilaiAwal++;
                i++;
            }
            System.out.println();
    }
}
