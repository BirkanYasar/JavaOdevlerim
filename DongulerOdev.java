import java.util.Scanner;

public class DongulerOdev {

	public static void main(String[] args) {

		/*�dev
Java d�ng�ler ile tek bir say� girilene kadar 
kullan�c�dan giri�leri kabul eden ve girilen de�erlerden
�ift ve 4'�n katlar� olan say�lar� toplay�p ekrana basan 
program� yaz�yoruz.*/
		
		int n;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		
		do {
			System.out.println("Bir say� giriniz :");
			n = scan.nextInt();
			
				if(n % 4 == 0) {
					total += n;
				}
		}while (n % 2 == 0);
		System.out.println("Program bitti!\n Toplam :" + total);
					
					
				}

		}
		
			
			
			
		
		
		
	

