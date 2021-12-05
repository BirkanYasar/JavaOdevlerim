import java.util.Scanner;

public class DongulerOdev2 {

	public static void main(String[] args) {
		/*Java döngüler ile girilen sayýya kadar olan 4 ve 5'in kuvvetlerini ekrana 
		 * yazdýran programý yazýyoruz.*/

		Scanner scan = new Scanner(System.in);
		
		int n;
		System.out.println("Sýnýr sayýsýný giriniz :");
		n =scan.nextInt();
		
		for(int i =20; i<=n; i+=20) {
			System.out.println(i);
		}

	}
}
			
			
		
		
		
	

