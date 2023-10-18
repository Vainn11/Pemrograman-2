package PRAK203_2210817310008_MuhHaekalBarera;
//Pada baris ini terjadi error karena nama class harus sama dengan nama file
//public class Employee {	
public class Pegawai {
	public String nama;
    // Pada baris ini membuat error di file Main karena value nya bukan karakter
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    // Pada baris ini terjadi error karena tipe data harus sama dengan deklarasi variabel asal
    // public char getAsal() {
    public String getAsal() {
        return asal;
    }
    // Pada baris ini terjadi error karena variabel j harus didekalarsikan terlebih dahulu menjadi parameter
    // public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
