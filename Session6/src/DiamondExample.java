
public class DiamondExample {

	public static void main(String[] args) {
		
		int rows = 5;
		
		int space = rows - 1;
		
		for (int i = 1; i < (rows * 2); i=i+2) {
			
			// print space
			for (int n = 0; n<space; n++) {
				System.out.print(n);
				System.out.print(" ");
			}
			
			// print star
			for (int n=0; n<i; n++) {
				System.out.print(n);
				System.out.print("*");
			}
			
			// add new line
			System.out.println();
			
			// decrement spaces
			space--;
		}
		
		

	}

}
