import java.util.Scanner;

public class SinifGecmeHesaplayici {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double ortalama;
		System.out.print("T�rk�e notunuzu giriniz : ");
		int turkce = scan.nextInt();
		System.out.print("Matematik notunuzu giriniz: ");
		int matematik = scan.nextInt();
		System.out.print("Fizik dersi notunuzu giriniz: ");
		int fizik = scan.nextInt();
		System.out.print("Kimya dersi notunuzu giriniz: ");
		int kimya = scan.nextInt();
		System.out.print("M�zik dersi notunuzu giriniz: ");
		int muzik = scan.nextInt();
		ortalama = (turkce+matematik+fizik+kimya+muzik) / 5;
		
		if(ortalama < 55) {
			System.out.println("S�n�f� ge�emediniz seneye g�r���r�z! ");
		}else {
			System.out.println("Tebrikler s�n�f� ge�tiniz!");
		}
		System.out.println("Y�l sonu ortalaman�z: " + ortalama);	
		
		if(ortalama >= 85) {
			System.out.println("Takdir belgesi almaya hak kazand�n�z!");
		}else if(ortalama >= 70) {
			System.out.println("Te�ekk�r belgesi almaya hak kazand�n�z!");
		}
			
		
		
		
	}

}
