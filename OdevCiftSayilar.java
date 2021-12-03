import java.util.Scanner;

public class OdevCiftSayilar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Sayý Giriniz: ");
		int number = scan.nextInt();
		
		if(number % 12 != 0) {
			System.out.println();
		}
		
		for(int i=1; i<=number; i++) {
			if(i % 12 == 0) {
				System.out.println(i);

			}
		}

	}

}
