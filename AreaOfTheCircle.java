import java.util.Scanner;

public class AreaOfTheCircle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float pi =3.14f;
		System.out.print("Please write the radius value: ");
		int rad = scan.nextInt();
		System.out.print("Please write down the center angle value: ");
		int angle = scan.nextInt();
		
		double area = (pi*(rad*rad)* angle)/360;
		System.out.println("Area of the circle segment: " +area);				
		
	}//BirkanYasar

}
