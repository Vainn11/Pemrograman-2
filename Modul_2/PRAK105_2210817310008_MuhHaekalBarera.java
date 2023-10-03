package Modul_2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class PRAK105_2210817310008_MuhHaekalBarera {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double phi = 3.14;

            System.out.print("Masukkan jari-jari: ");
            double r = keyboard.nextDouble();

            System.out.print("Masukkan tinggi: ");
            double t = keyboard.nextDouble();
            
            double volume = phi * r * r * t;
            DecimalFormat df = new DecimalFormat("#.###");
            System.out.print("Volume tabung dengan jari-jari " + r + " cm dan ");
            System.out.print("tinggi " + t + " cm adalah " + df.format(volume) + " m3 ");
            System.out.println();
    }
}