import java.util.Scanner;

public class dairedealanvecevrehesaplama {

	public static void main(String[] args) {
		int r;
		Scanner scan = new Scanner(System.in);
		System.out.print("Yar��ap� giriniz: ");
		r = scan.nextInt();
		double alan; // pi say�s�ndan dolay� double tan�mlad�k.
		alan = 3.14 * r * r ;
		double cevre; // pi say�s�ndan dolay� double tan�mlad�k.
		cevre = 2 * 3.14 * r;
		System.out.println("Alan: " + alan);
		System.out.println("�evre: " + cevre);

	}

}
