import java.util.Scanner;

public class vkihesaplama {

	public static void main(String[] args) {
		double boy, kilo, vki;
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
		boy = scan.nextDouble();
		System.out.print("Lütfen kilonuzu kg cinsinden giriniz: ");
		kilo = scan.nextDouble();
		vki = kilo / (boy*boy);
		System.out.print("VKÝ: " + vki);

	}

}
