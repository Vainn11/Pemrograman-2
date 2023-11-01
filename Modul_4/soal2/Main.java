package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		LinkedList<Negara> negaraList = new LinkedList<>();
		HashMap<Integer, String> bulanmap = new HashMap<>();
		for (int i=1; i<=12; i++) {
			bulanmap.put(i, switch (i) {
			case 1 -> "Januari";
			case 2 -> "Februari";
			case 3 -> "Maret";
			case 4 -> "April";
			case 5 -> "Mei";
			case 6 -> "Juni";
			case 7 -> "Juli";
			case 8 -> "Agustus";
			case 9 -> "September";
			case 10 -> "Oktober";
			case 11 -> "November";
			case 12 -> "Desember";
			default -> "";
			});
		}
		
		for (int i=1; i<=n; i++) {
			String nama = sc.nextLine();
			String jeniskepemimpinan = sc.nextLine();
			String namapemimpin = sc.nextLine();
			int tanggalkemerdekaan = 0;
			int bulankemerdekaan = 0;
			int tahunkemerdekaan = 0;
			
			if (!jeniskepemimpinan.equals("monarki")) {
				tanggalkemerdekaan = sc.nextInt();
				bulankemerdekaan = sc.nextInt();
				tahunkemerdekaan = sc.nextInt();
				sc.nextLine();
			}
			
			Negara negara = new Negara (nama, jeniskepemimpinan, namapemimpin, tanggalkemerdekaan, bulankemerdekaan, tahunkemerdekaan);
			negaraList.add(negara);
		}
		for (Negara negara : negaraList) {
			String nama = negara.getnama();
			String jeniskepemimpinan = negara.getjeniskepemimpinan();
			String namapemimpin = negara.getnamapemimpin();
			int tanggalkemerdekaan = negara.getbulankemerdekaan();
			int bulankemerdekaan = negara.getbulankemerdekaan();
			int tahunkemerdekaan = negara.gettahunkemerdekaan();
			
			if (jeniskepemimpinan.equals("Monarki")) {
				jeniskepemimpinan = "Raja";
				System.out.println("Negara " + nama + " Mempunyai " + jeniskepemimpinan + " Bernama " + namapemimpin + "\n");
			}
			else if (jeniskepemimpinan.equals("Presiden")) {
				jeniskepemimpinan = "Presiden";
				String namabulan = bulanmap.get(bulankemerdekaan);
				System.out.println("Negara " + nama + " Mempunyai " + jeniskepemimpinan + " Bernama " + namapemimpin);
				System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalkemerdekaan + " " + namabulan + " " + tahunkemerdekaan + "\n");
				}
				else {
					jeniskepemimpinan = "perdana Menteri";
					String namabulan = bulanmap.get(bulankemerdekaan);
					System.out.println("Negara " + nama + " Mempunyai " + jeniskepemimpinan + " Bernama " + namapemimpin);
					System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalkemerdekaan + " " + namabulan + " " + tahunkemerdekaan + "\n");
			}
		}
	}
}