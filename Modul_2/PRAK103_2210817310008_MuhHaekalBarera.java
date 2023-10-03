package Modul_2;
import java.util.Scanner;
public class PRAK103_2210817310008_MuhHaekalBarera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int j = 0; j < 3; j++) { 
            System.out.print(" ");
            int jumlahDeret = input.nextInt();
            System.out.print(" ");
            int nilaiAwal = input.nextInt();

            int i = 0;
            do {
                if (nilaiAwal % 2 == 1) {
                    System.out.print(nilaiAwal);
                    if (i < jumlahDeret - 1) {
                        System.out.print(", ");
                    }
                    i++;
                }
                nilaiAwal++;
            } while (i < jumlahDeret);
            System.out.println();
        }
    }
}
