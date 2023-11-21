package Modul_5.Soal2;

public class Anjing extends Peliharaan {
    private final String warnaBulu, kemampuan;

    public Anjing(String r, String n, String warnaBulu, String kemampuan) {
        super(r, n);
        this.warnaBulu = warnaBulu;
        this.kemampuan = kemampuan;
    }
    public void displayDetailAnjing() {
        super.display();
        System.out.println("Warna Bulu: " + warnaBulu);
        System.out.println("Kemampuan: " + kemampuan);
    }
}
