import java.util.Scanner;

public class ATMSwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String userName,password;
		int balance = 1500;
		int select,price;
		byte right = 3;
		while (right > 0) {
			System.out.println("Kullan�c� Ad�n�z :");
			userName = scan.nextLine();
			System.out.println("�ifreniz :");
			password = scan.nextLine();
			
			if(userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba! Kodluyoruz bankas�na ho�geldiniz!");
			
			do {
				System.out.println("1-Para yat�rma\n" +
                        "2-Para �ekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-��k�� Yap");
                System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
                select = scan.nextInt();
                switch (select) {
                case 1: 
                	System.out.print("Para miktar� : ");
                	price = scan.nextInt();
                	balance += price;
                	break;
                case 2:
                	  System.out.print("Para miktar� : ");
                      price = scan.nextInt();
                      if (price > balance) {
                          System.out.println("Bakiye yetersiz.");
                      } else {
                          balance -= price;
                      }	
                      break;
                case 3:
                	System.out.println("Bakiyeniz : " + balance);
                
                }
                	  break;
                
			} while (select != 4);
			System.out.println("Tekrar g�r��mek �zere.");
            break;	
			}else {
                right--;
                System.out.println("Hatal� kullan�c� ad� veya �ifre. Tekrar deneyiniz.");
		}
			if (right == 0) {
                System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz.");
            } else {
                System.out.println("Kalan Hakk�n�z : " + right);
            }
			
			
	}
}
}	
