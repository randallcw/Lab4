import java.util.Arrays;
public class Lab4 {

	public static void main(String[] args) {

		int[] test1 = {1,2,7,4};
		whatever(test1);

		int[] test2 = {1,9,3};
		whatever(test2);

		int[] test3 = {7,2,3,4,5};
		whatever(test3);

		int[] test4 = {3,2};
		whatever(test4);

		int[] test5 = {1,2,7,4,5,6};
		whatever(test5);

	}

	public static void whatever(int[] array1) {
		int[] copy = new int[array1.length];
		int[] array2 = new int[array1.length];
		int arrayIndex = 0;
		
		for (int i = 0; i < array1.length; i++) {
			copy[i] = array1[i];
			
		}
		
		Arrays.sort(copy);
		
		for (int i = array1.length - 1; i >= 0 ; i--) {
			array2[arrayIndex] = copy[i];
			arrayIndex++;
		}

		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]);
			System.out.print(" ");
		}
		System.out.println("");

	}

}
