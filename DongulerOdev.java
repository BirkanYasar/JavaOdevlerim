import java.util.Scanner;

public class DongulerOdev2 {

	public static void main(String[] args) {
		/*Java d�ng�ler ile girilen say�ya kadar olan 4 ve 5'in kuvvetlerini ekrana 
		 * yazd�ran program� yaz�yoruz.*/

		Scanner scan = new Scanner(System.in);
		
		int n;
		System.out.println("S�n�r say�s�n� giriniz :");
		n =scan.nextInt();
		
		for(int i =20; i<=n; i+=20) {
			System.out.println(i);
		}

	}
}
			
			
		
		
		
	

