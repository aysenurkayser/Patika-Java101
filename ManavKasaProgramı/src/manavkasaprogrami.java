import java.util.Scanner;

public class manavkasaprogrami {

	public static void main(String[] args) {
		double armut, elma, domates, muz, patl�can;
		double armutkg, elmakg, domateskg, muzkg, patl�cankg;
		Scanner scan = new Scanner(System.in);
		System.out.print("Armut ka� kilo? ");
		armutkg = scan.nextDouble();
		System.out.print("Elma ka� kilo? ");
		elmakg = scan.nextDouble();
		System.out.print("Domates ka� kilo? ");
		domateskg = scan.nextDouble();
		System.out.print("Muz ka� kilo? ");
		muzkg = scan.nextDouble();
		System.out.print("Patl�can ka� kilo? ");
		patl�cankg = scan.nextDouble();
		double �denecektutar;
		�denecektutar = (armutkg * 2.14) + (elmakg * 3.67) + (domateskg * 1.11) + (muzkg * 0.95) + (patl�cankg * 5);
		System.out.print("�demeniz gereken tutar: " + �denecektutar + " TL'dir.");
	}

}
