import java.util.Scanner;

public class hesapmakinesi {

	public static void main(String[] args) {
		int islem;
		double n1, n2;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Say�y� Giriniz: ");
		n1 = scan.nextDouble();
		System.out.println("2. Say�y� Giriniz: ");
		n2= scan.nextDouble();
		System.out.println("Toplama = 1\n��karma = 2\n�arpma = 3\nB�lme = 4");
		System.out.print("L�tfen i�lem se�iniz: ");
		islem = scan.nextInt();
		
		switch(islem) {
		case 1 :
			System.out.println("Toplama: " + (n1+n2));
			break;
		case 2: 
			System.out.println("��karma: "+ (n1-n2));
			break;
		case 3:
			System.out.println("�arpma: "+ (n1*n2));
			break;
		case 4:
			System.out.println("B�lme: " + (n1/n2));
			break;
		default:
			System.out.println("Yanl�� de�er girdiniz.");
			break;
		}
	}

}
