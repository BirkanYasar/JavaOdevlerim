import java.util.Scanner;

public class PratikUsluSayilar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Taban de�eri giriniz: ");
		int n = scan.nextInt();
		System.out.println("�s de�erini giriniz: ");
		int k = scan.nextInt();
		int total = 1;
		
		for(int i = 1; i <=k; i++) {
			total *= n;
		}
		System.out.println(total);
		
	}

}
