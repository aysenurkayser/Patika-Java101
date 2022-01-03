import java.util.Scanner;

public class dairedealanvecevrehesaplama {

	public static void main(String[] args) {
		int r;
		Scanner scan = new Scanner(System.in);
		System.out.print("Yarýçapý giriniz: ");
		r = scan.nextInt();
		double alan; // pi sayýsýndan dolayý double tanýmladýk.
		alan = 3.14 * r * r ;
		double cevre; // pi sayýsýndan dolayý double tanýmladýk.
		cevre = 2 * 3.14 * r;
		System.out.println("Alan: " + alan);
		System.out.println("Çevre: " + cevre);

	}

}
