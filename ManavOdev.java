import java.util.Scanner;

public class ManavOdev {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	double armut = 2.14;
	double elma = 3.67;
	double domates = 1.11;
	double muz = 0.95;
	double patlican = 5;
	double kiloArmut,kiloElma,kiloDomates,kiloMuz,kiloPatlican;
	
		System.out.print("Armut kaç kilo ? ");
		kiloArmut = scan.nextDouble();
		System.out.print("Elma kaç kilo ? ");
		kiloElma = scan.nextDouble();
		System.out.print("Domates kaç kilo ? ");
		kiloDomates = scan.nextDouble();
		System.out.print("Muz kaç kilo ? ");
		kiloMuz = scan.nextDouble();
		System.out.print("Patlýcan kaç kilo ? ");
		kiloPatlican = scan.nextDouble();
		
		double result = ((kiloArmut*armut)+(kiloElma*elma)+(kiloDomates*domates)+(kiloMuz*muz)+(kiloPatlican*patlican));
		
		System.out.println("Alýþveriþ tutarý : "+ result+" TL");
	
	}

}
