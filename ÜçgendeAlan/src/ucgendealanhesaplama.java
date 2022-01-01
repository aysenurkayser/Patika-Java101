import java.util.Scanner;

public class ucgendealanhesaplama {

	public static void main(String[] args) {
		int akenari, bkenari, ckenari, cevre, u;
		double alan;
		Scanner scan = new Scanner(System.in);
		System.out.println("A kenarýný giriniz: ");
		akenari = scan.nextInt();
		System.out.println("B kenarýný giriniz: ");
		bkenari = scan.nextInt();
		System.out.println("C kenarýný giriniz: ");
		ckenari = scan.nextInt();
		cevre = (akenari + bkenari + ckenari);
		u = (cevre/2);
		alan = Math.sqrt((u)*(u-akenari)*(u-bkenari)*(u-ckenari));
		
		System.out.println("Alan: " + alan);

	}

}
