import java.util.Scanner;

public class dairedilimininalani {

	public static void main(String[] args) {
		int r;
		Scanner scan = new Scanner(System.in);
		System.out.print("Yarýçapý giriniz: ");
		r = scan.nextInt();
		double merkezaci;
		System.out.print("Merkez açýnýn ölçüsünü giriniz: ");
		merkezaci = scan.nextDouble();
		double dairedilimininalani;
		dairedilimininalani = (3.14 * (r*r) * merkezaci)/360;
		System.out.println("Daire diliminin alaný: " + dairedilimininalani);
	}

}
