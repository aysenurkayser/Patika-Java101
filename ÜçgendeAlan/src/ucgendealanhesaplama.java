import java.util.Scanner;

public class ucgendealanhesaplama {

	public static void main(String[] args) {
		int akenari, bkenari, ckenari, cevre, u;
		double alan;
		Scanner scan = new Scanner(System.in);
		System.out.println("A kenar�n� giriniz: ");
		akenari = scan.nextInt();
		System.out.println("B kenar�n� giriniz: ");
		bkenari = scan.nextInt();
		System.out.println("C kenar�n� giriniz: ");
		ckenari = scan.nextInt();
		cevre = (akenari + bkenari + ckenari);
		u = (cevre/2);
		alan = Math.sqrt((u)*(u-akenari)*(u-bkenari)*(u-ckenari));
		
		System.out.println("Alan: " + alan);

	}

}
