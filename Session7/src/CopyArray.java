import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int [] old_Array = {1, 2, 3, 4, 5};
		int [] new_Array = new int [old_Array.length];
		
		System.out.println("Old Array values: " + Arrays.toString(old_Array));
		
		for(int i = 0; i < old_Array.length; i++){
			new_Array [i] = old_Array[i];			
			
		}
		
		System.out.println("New Array copied from Old Array: " + Arrays.toString(new_Array));
		

	}

}
