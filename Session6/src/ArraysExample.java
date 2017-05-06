import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		

		double[] myList = {5.9,9.9,3.4,3.3,3.2, 3.1};
		
		//dataType[] arrayRefVar = new dataType[arraySize];
		
		int[] studentScores = new int[100];
		
		int index = 0;
		
		//student1
		
		for (index = 0; index<studentScores.length; index++) {
			//studentScores[index] = 80;
		}
		
		studentScores[0] = 80;
		studentScores[1] = 820;
		
		Arrays.sort(myList);
		
		
		printArray(myList);
		
		
		int position = Arrays.binarySearch(myList, 3.4);
		System.out.println(position);
		
		double sum = 0;
		for (int i=myList.length -1 ; i>=0; i--) {
			sum = sum + myList[i];
		}
		
		
		
		System.out.println("Sum is: " + sum);
		
		System.out.println("Sum of 1 and 5 is: " + sum(1,5));
		
		swapValues(5, 6);
		
		isPalindrom("atoyota");
		isPalindrom("hello");

	} 
	
	private static void printArray(double myList[]) {
		for (int i =0; i<myList.length; i++) {
			System.out.println(myList[i]);
		}
	}
	
	private static int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	private static void swapValues(int a, int b) {
		int c = a;
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	private static void isPalindrom(String value) {
		// atoyota
		
		String reversed = "";
		for (int i=value.length()-1; i>=0; i--) {
			reversed = reversed + value.charAt(i);
		}
		
		if (value.equals(reversed)) {
			System.out.println("Yes palindorm");
		} else {
			System.out.println("Not palindorm");
		}
	}

}
