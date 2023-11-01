package soal2;

public class Negara {
	private String nama;
	private String jeniskepemimpinan;
	private String namapemimpin;
	private int tanggalkemerdekaan;
	private int bulankemerdekaan;
	private int tahunkemerdekaan;
	
	public Negara(String nama, String jeniskepemimpinan, String namapemimpin, int tanggalkemerdekaan, int bulankemerdekaan, int tahunkemerdekaan) {
		this.nama = nama;
		this.jeniskepemimpinan = jeniskepemimpinan;
		this.namapemimpin = namapemimpin;
		this.tanggalkemerdekaan = tanggalkemerdekaan;
		this.bulankemerdekaan = bulankemerdekaan;
		this.tahunkemerdekaan = tahunkemerdekaan;
	}
	
	public String getnama() {
		return nama;
	}
	
	public String getjeniskepemimpinan() {
		return jeniskepemimpinan;
	}
	
	public String getnamapemimpin() {
		return namapemimpin;
	}
	
	public int gettanggalkemerdekaan() {
		return tanggalkemerdekaan;
	}
	
	public int getbulankemerdekaan() {
		return bulankemerdekaan;
	}
	
	public int gettahunkemerdekaan() {
		return tahunkemerdekaan;
	}
}