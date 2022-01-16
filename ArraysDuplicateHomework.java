
public class ArraysDuplicateHomework {
	
	static boolean isFind(int[] array, int value) {
		for(int i : array) {
			if(i == value) {
				return true;				
			}			
		}
		return false;
	}

	public static void main(String[] args) {

		int[] arr = {7,2,6,6,11,13,2,40,7};
		int[] duplicate = new int[arr.length];
		int startIndex = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if((i != j) && (i % 2 != 0) && (arr[i] == arr[j])) {
					if(!isFind(duplicate, arr[i])) {
						duplicate[startIndex++] = arr[i];						
					}
					break;				
				}				
			}			
		}
		
		for (int value : duplicate) {
			if (value != 0) {
				System.out.println(value);
			}
			
		}
		
	}

}
