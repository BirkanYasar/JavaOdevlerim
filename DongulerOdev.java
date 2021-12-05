import java.util.Scanner;

public class DongulerOdev {

	public static void main(String[] args) {

		/*Ödev
Java döngüler ile tek bir sayý girilene kadar 
kullanýcýdan giriþleri kabul eden ve girilen deðerlerden
çift ve 4'ün katlarý olan sayýlarý toplayýp ekrana basan 
programý yazýyoruz.*/
		
		int n;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		
		do {
			System.out.println("Bir sayý giriniz :");
			n = scan.nextInt();
			
				if(n % 4 == 0) {
					total += n;
				}
		}while (n % 2 == 0);
		System.out.println("Program bitti!\n Toplam :" + total);
					
					
				}

		}
		
			
			
			
		
		
		
	

