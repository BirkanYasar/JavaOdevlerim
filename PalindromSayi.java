
public class PalindromSayi {

	static boolean isPalindrom(int number) {
		
		int temp = number, reverseNumber = 0, lastNumber;
		while (temp != 0) {		
			lastNumber = temp % 10;		//burada sayının birler basamağındaki değer bulunuyor.
			System.out.println("birler basamagı :" + lastNumber);
			
			reverseNumber = (reverseNumber * 10) + lastNumber;	//bir basamak eklemek için
			System.out.println(reverseNumber);
			temp /= 10;
		}
		
		if(number == reverseNumber) // eğer if ten sonra tek satırlık  bir kod yazılacaksa if in süslü parantezlerini yazmaya gerek yoktur. 
			return true;
		else
			return false;
		
	}
	
	
	public static void main(String[] args) {

	System.out.println(isPalindrom(505));	
		
	}

}
