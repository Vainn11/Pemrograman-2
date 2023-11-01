package soal1;
import java.util.LinkedList;

public class Dadu {
	public int input;
	int total;
	
	public void setInput(int input) {
		this.input = input;
	}
	
	void acakNilai() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i=1 ; i<=6; i++) {
			ll.add(i);
		}
		for (int i=1; i<=input; i++) {
			if (ll.isEmpty()) {
				System.out.println ("Dadu ke-" + i + "tidak memiliki nilai.");
			}
			else {
				int randomIndex = (int) (Math.random() * ll.size());
				int random_int = ll.remove(randomIndex);
				System.out.println("Dadu ke-" + i + " bernilai " + random_int);
				total += random_int;
			}
		}
		System.out.println("Total nilai dadu keseluruhan " + total);
	}
}