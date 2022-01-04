import java.util.Scanner;

public class kullanicigirisi {

	public static void main(String[] args) {
		String userName, password;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kullanýcý adýnýz: ");
		userName = scan.nextLine();
		
		System.out.println("Þifreniz: ");
		password = scan.nextLine();
		
		if(userName.equals("patika") && password.equals("java101")) {
			System.out.println("Baþarýyla giriþ yaptýnýz. ");
		}
		else {
			System.out.println("Bilgileriniz yanlýþ!");
			System.out.println("Þifrenizi sýfýrlamak ister misiniz? Evet/Hayýr");
			String cevap, newpassword;
			cevap = scan.nextLine();
			if (cevap.equals("Evet")) {
				System.out.println("Yeni þifrenizi giriniz: ");
				newpassword = scan.nextLine();
					if(newpassword.equals("patika")) {
						System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
					}
					else {
						System.out.println("Þifre oluþturuldu.");
					}
			}
			else { 
				System.out.println("Lütfen yeniden deneyiniz!");
			}
			
		}
		

	}

}
