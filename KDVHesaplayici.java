import java.util.Scanner;

public class KDVHesaplayici {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("*******************************************");
	System.out.println("	KDV hesaplay�c�ya ho�geldiniz....");
	System.out.println("*******************************************");
	int tutar = 0;
	do {
		System.out.print("L�tfen hesaplatmak istedi�iniz tutar� giriniz :");
		tutar = scan.nextInt();
		int matrah;
		
	if(tutar >= 1000) {
		
		matrah = ((tutar * 18) / (100));
		System.out.println("KDV'li yeni fiyat�: " + (matrah + tutar));
		System.out.println("KDV matrah� :" + matrah);			
	}else if(tutar < 1000) {
		matrah = ((tutar * 8) / (100));
		System.out.println("KDV'li yeni fiyat�: " + (matrah + tutar));
		System.out.println("KDV matrah� :" + matrah);			
	}
	
	}while(tutar >= 1);
	
	}
	
}
