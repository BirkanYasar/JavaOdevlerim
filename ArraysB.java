
public class ArraysB {

	public static void main(String[] args) {

		String[][] letter = new String[7][4];
		
		for(int i = 0; i < letter.length; i++) {
			for(int u = 0; u < letter[i].length; u++) {
				if(i == 0 || i == 3) {
					letter[i][u] = "* ";
				}else if(i == 0 || i == 6) {
					letter[i][u] = "* ";
				}
				else if(u == 0 || u == 3) {
					letter[i][u] = " * ";					
				}else if(u == 0 || u == 6) {
					letter[i][u] = "* ";
				}else {
					letter[i][u] = "  ";
				}
				
			}
		}
		for(String[] row : letter) {
			for(String col : row) {
				System.out.print(col);
			}
			System.out.println();
		}
		
	}

}
