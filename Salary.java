
public class Salary {

	String name;
	int salary;
	int workHours;
	int hireYear;

	Salary(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	int taxable;
	int tax() {
		if(this.salary < 1000) {
			taxable = 0;
		}else if(this.salary >= 1000) {
			taxable = (this.salary * 3)/100;	
		}return taxable;
				
	}
	
	int bonusTotal;
	int bonus() {
		if(this.workHours > 40) {
			int a = this.workHours - 40;
			bonusTotal = a * 30;
		}return bonusTotal;
	}
	
	int b;	
	int raiseSalary () {
		if(this.hireYear < 10) {
			b = (this.salary * 5) /100;
		}else if(this.hireYear > 10 && this.hireYear < 20) {
			b = (this.salary *10) /100;
		}else if(this.hireYear >= 20) {
			b = (this.salary *15) /100;
		
	}return b;
	}
			
	void ToString () {
		System.out.println("Ad� : " + this.name);
		System.out.println("Maa�� : " + this.salary);
		System.out.println("�al��ma saati : " + this.workHours);
		System.out.println("Vergi : " + tax());
		System.out.println("Bonus : " + bonus());
		System.out.println("Maa� art��� : " + (raiseSalary()+bonus() ));
		System.out.println("Vergi ve bonuslar ile birlikte maa� : " + (this.salary+bonus()-tax()) );
		System.out.println("Toplam maa� : " + (this.salary+raiseSalary()+bonus()-tax()));
		
	}
	
}

