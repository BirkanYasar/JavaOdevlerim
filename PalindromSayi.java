
public class PalindromSayi {

	static boolean isPalindrom(int number) {
		
		int temp = number, reverseNumber = 0, lastNumber;
		while (temp != 0) {		
			lastNumber = temp % 10;		//burada say�n�n birler basama��ndaki de�er bulunuyor.
			System.out.println("birler basamag� :" + lastNumber);
			
			reverseNumber = (reverseNumber * 10) + lastNumber;	//bir basamak eklemek i�in
			System.out.println(reverseNumber);
			temp /= 10;
		}
		
		if(number == reverseNumber) // e�er if ten sonra tek sat�rl�k  bir kod yaz�lacaksa if in s�sl� parantezlerini yazmaya gerek yoktur. 
			return true;
		else
			return false;
		
	}
	
	
	public static void main(String[] args) {

	System.out.println(isPalindrom(505));	
		
	}

}
