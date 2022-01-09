
public class HarmonikOrt {

	public static void main(String[] args) {

		 int[] numbers = {1, 2, 3, 4, 5};
	        int sum = 0;
	        double divide = 1;
	        for (int i = 0; i < numbers.length; i++) {
	             divide /= numbers[i];
	        }
	       double avarage = divide + 1;
	       
	       double total = (numbers.length)/avarage;
	       System.out.println("Sonuç :" + total);
	    
	       
	       
	}

}
