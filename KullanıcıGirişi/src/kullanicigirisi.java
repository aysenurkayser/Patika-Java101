import java.util.Scanner;

public class kullanicigirisi {

	public static void main(String[] args) {
		String userName, password;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kullan�c� ad�n�z: ");
		userName = scan.nextLine();
		
		System.out.println("�ifreniz: ");
		password = scan.nextLine();
		
		if(userName.equals("patika") && password.equals("java101")) {
			System.out.println("Ba�ar�yla giri� yapt�n�z. ");
		}
		else {
			System.out.println("Bilgileriniz yanl��!");
			System.out.println("�ifrenizi s�f�rlamak ister misiniz? Evet/Hay�r");
			String cevap, newpassword;
			cevap = scan.nextLine();
			if (cevap.equals("Evet")) {
				System.out.println("Yeni �ifrenizi giriniz: ");
				newpassword = scan.nextLine();
					if(newpassword.equals("patika")) {
						System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
					}
					else {
						System.out.println("�ifre olu�turuldu.");
					}
			}
			else { 
				System.out.println("L�tfen yeniden deneyiniz!");
			}
			
		}
		

	}

}
