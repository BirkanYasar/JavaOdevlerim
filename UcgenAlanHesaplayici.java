import java.util.Scanner;

public class UcgenAlanHesaplayici {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Birinci kenar deðeri :");
		int a = scan.nextInt();
		System.out.print("Ýkinci kenar deðeri : ");
		int b = scan.nextInt();
		System.out.print("Üçüncü kenar deðeri : ");
		int c = scan.nextInt();
		
	int cevre = (a+b+c);
	int u = ((cevre)/2);
	int alanKare = u*(u-a)*(u-b)*(u-c);
	double alan = Math.sqrt(alanKare);
	System.out.println("Alan :"+ alan);
		
	}

}
