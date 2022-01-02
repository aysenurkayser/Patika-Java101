import java.util.Scanner;

public class taksimetreprogrami {

	public static void main(String[] args) {
		double mesafe, tutar;
		Scanner scan = new Scanner(System.in);
		System.out.println("Kilometre cinsinden mesafeyi yazınız: ");
		mesafe = scan.nextDouble();
		tutar = (10 + 2.20 * mesafe) >= 20 ? (10 + 2.20 * mesafe) : 20 ; 
		System.out.println("Tutar TL: " + tutar);
		
	}

}
