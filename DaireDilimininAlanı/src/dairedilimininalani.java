import java.util.Scanner;

public class dairedilimininalani {

	public static void main(String[] args) {
		int r;
		Scanner scan = new Scanner(System.in);
		System.out.print("Yar��ap� giriniz: ");
		r = scan.nextInt();
		double merkezaci;
		System.out.print("Merkez a��n�n �l��s�n� giriniz: ");
		merkezaci = scan.nextDouble();
		double dairedilimininalani;
		dairedilimininalani = (3.14 * (r*r) * merkezaci)/360;
		System.out.println("Daire diliminin alan�: " + dairedilimininalani);
	}

}
