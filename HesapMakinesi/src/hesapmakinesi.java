import java.util.Scanner;

public class hesapmakinesi {

	public static void main(String[] args) {
		int islem;
		double n1, n2;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Sayýyý Giriniz: ");
		n1 = scan.nextDouble();
		System.out.println("2. Sayýyý Giriniz: ");
		n2= scan.nextDouble();
		System.out.println("Toplama = 1\nÇýkarma = 2\nÇarpma = 3\nBölme = 4");
		System.out.print("Lütfen iþlem seçiniz: ");
		islem = scan.nextInt();
		
		switch(islem) {
		case 1 :
			System.out.println("Toplama: " + (n1+n2));
			break;
		case 2: 
			System.out.println("Çýkarma: "+ (n1-n2));
			break;
		case 3:
			System.out.println("Çarpma: "+ (n1*n2));
			break;
		case 4:
			System.out.println("Bölme: " + (n1/n2));
			break;
		default:
			System.out.println("Yanlýþ deðer girdiniz.");
			break;
		}
	}

}
