import java.util.Scanner;

public class HesapMak {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a,b;
		byte process;
		System.out.println("Birinci say� de�erini tu�lay�n�z: ");
	    a = scan.nextInt();
	    System.out.println("�kini say� de�erini tu�lay�n�z :");
	    b = scan.nextInt();
	    System.out.println("L�tfen yapmak isted�iniz i�lemi tu�lay�n�z: \n1)Toplama\n2)��karma\n3)�arpma\n4)B�lme");
	    process = scan.nextByte();
	    
		/*if(process == 1) {
			System.out.println("Toplam :" + (a+b));
		}else if(process == 2 ) {
			System.out.println("Fark : " + (a-b));
		}else if(process == 3) {
			System.out.println("�arp�m :" + (a*b));
		}else if(process == 4) {
			System.out.println("B�l�m :" + (a/b));
		}else {
			System.out.println("Girdi�iniz say� ge�ersizdir!");
		}*/
		
		switch(process) {
		case 1:
			System.out.println("Toplam :" + (a+b));
			break;
		case 2:
			System.out.println("Fark : " + (a-b));
			break;
		case 3:
			System.out.println("�arp�m :" + (a*b));
			break;
		case 4:
			System.out.println("B�l�m :" + (a/b));
		    break;
		default: 
			System.out.println("Hatal� Giri� yapt�n�z!");
}

		}
		
	}
