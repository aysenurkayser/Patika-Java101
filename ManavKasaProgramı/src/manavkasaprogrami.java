import java.util.Scanner;

public class manavkasaprogrami {

	public static void main(String[] args) {
		double armut, elma, domates, muz, patlýcan;
		double armutkg, elmakg, domateskg, muzkg, patlýcankg;
		Scanner scan = new Scanner(System.in);
		System.out.print("Armut kaç kilo? ");
		armutkg = scan.nextDouble();
		System.out.print("Elma kaç kilo? ");
		elmakg = scan.nextDouble();
		System.out.print("Domates kaç kilo? ");
		domateskg = scan.nextDouble();
		System.out.print("Muz kaç kilo? ");
		muzkg = scan.nextDouble();
		System.out.print("Patlýcan kaç kilo? ");
		patlýcankg = scan.nextDouble();
		double ödenecektutar;
		ödenecektutar = (armutkg * 2.14) + (elmakg * 3.67) + (domateskg * 1.11) + (muzkg * 0.95) + (patlýcankg * 5);
		System.out.print("Ödemeniz gereken tutar: " + ödenecektutar + " TL'dir.");
	}

}
