import java.util.Scanner;

public class HesapMak {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a,b;
		byte process;
		System.out.println("Birinci sayý deðerini tuþlayýnýz: ");
	    a = scan.nextInt();
	    System.out.println("Ýkini sayý deðerini tuþlayýnýz :");
	    b = scan.nextInt();
	    System.out.println("Lütfen yapmak istedðiniz iþlemi tuþlayýnýz: \n1)Toplama\n2)Çýkarma\n3)Çarpma\n4)Bölme");
	    process = scan.nextByte();
	    
		/*if(process == 1) {
			System.out.println("Toplam :" + (a+b));
		}else if(process == 2 ) {
			System.out.println("Fark : " + (a-b));
		}else if(process == 3) {
			System.out.println("Çarpým :" + (a*b));
		}else if(process == 4) {
			System.out.println("Bölüm :" + (a/b));
		}else {
			System.out.println("Girdiðiniz sayý geçersizdir!");
		}*/
		
		switch(process) {
		case 1:
			System.out.println("Toplam :" + (a+b));
			break;
		case 2:
			System.out.println("Fark : " + (a-b));
			break;
		case 3:
			System.out.println("Çarpým :" + (a*b));
			break;
		case 4:
			System.out.println("Bölüm :" + (a/b));
		    break;
		default: 
			System.out.println("Hatalý Giriþ yaptýnýz!");
}

		}
		
	}
