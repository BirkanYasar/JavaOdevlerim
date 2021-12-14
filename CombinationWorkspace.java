import java.util.Scanner;

public class CombinationWorkspace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//C(n,r) = n! / (r! * (n-r)!)
		int nTotal = 1;
		int rTotal = 1;
		int p1 = 1;
		
		System.out.print("n deðerini giriniz :");
		int n = scan.nextInt();
		System.out.print("r deðerini giriniz :");
		int r = scan.nextInt();
		
		int p = (n-r);		
		
		for(int i = 1; i<=p; i++) {
			p1 *= i;
		}
		
		for(int i =1; i<=r; i++) {
			rTotal *= i;
		}
		for(int i =1; i<=n; i++) {
			nTotal *= i;
		}
		int firstProcess = (p1 * rTotal);
		
		int finalProcess = (nTotal / firstProcess);
		System.out.println("C(n,r): " + finalProcess);
		
		
		
		
		

		
		
	}

}
