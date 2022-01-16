import java.util.Scanner;

public class SinifGecmeHesaplayici {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double ortalama;
		System.out.print("Türkçe notunuzu giriniz : ");
		int turkce = scan.nextInt();
		System.out.print("Matematik notunuzu giriniz: ");
		int matematik = scan.nextInt();
		System.out.print("Fizik dersi notunuzu giriniz: ");
		int fizik = scan.nextInt();
		System.out.print("Kimya dersi notunuzu giriniz: ");
		int kimya = scan.nextInt();
		System.out.print("Müzik dersi notunuzu giriniz: ");
		int muzik = scan.nextInt();
		ortalama = (turkce+matematik+fizik+kimya+muzik) / 5;
		
		if(ortalama < 55) {
			System.out.println("Sýnýfý geçemediniz seneye görüþürüz! ");
		}else {
			System.out.println("Tebrikler sýnýfý geçtiniz!");
		}
		System.out.println("Yýl sonu ortalamanýz: " + ortalama);	
		
		if(ortalama >= 85) {
			System.out.println("Takdir belgesi almaya hak kazandýnýz!");
		}else if(ortalama >= 70) {
			System.out.println("Teþekkür belgesi almaya hak kazandýnýz!");
		}
			
		
		
		
	}

}
