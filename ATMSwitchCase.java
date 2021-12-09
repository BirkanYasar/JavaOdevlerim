import java.util.Scanner;

public class ATMSwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String userName,password;
		int balance = 1500;
		int select,price;
		byte right = 3;
		while (right > 0) {
			System.out.println("Kullanýcý Adýnýz :");
			userName = scan.nextLine();
			System.out.println("Þifreniz :");
			password = scan.nextLine();
			
			if(userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba! Kodluyoruz bankasýna hoþgeldiniz!");
			
			do {
				System.out.println("1-Para yatýrma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çýkýþ Yap");
                System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
                select = scan.nextInt();
                switch (select) {
                case 1: 
                	System.out.print("Para miktarý : ");
                	price = scan.nextInt();
                	balance += price;
                	break;
                case 2:
                	  System.out.print("Para miktarý : ");
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
			System.out.println("Tekrar görüþmek üzere.");
            break;	
			}else {
                right--;
                System.out.println("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
		}
			if (right == 0) {
                System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
            } else {
                System.out.println("Kalan Hakkýnýz : " + right);
            }
			
			
	}
}
}	
