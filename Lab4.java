public class Lab4 {
	
	public static void main(String[] args) {

	int[] test1 = new int[1,2,3,4];
	int[] ttest1 = new int[test1.whatever()];
	
	int[] test2 = new int[1,2,3];
	int[] ttest2 = new int[test2.whatever()];
	
	int[] test3 = new int[1,2,3,4,5];
	int[] ttest3 = new int[test3.whatever()];
	
	int[] test4 = new int[1,2];
	int[] ttest4 = new int[test4.whatever()];
	
	int[] test5 = new int[1,2,3,4,5,6];
	int[] ttest5 = new int[test5.whatever()];
	


public void whatever(int[] array1) {
	int[] array2 = new array[array1.length()];
	arrayIndex = 0;
	
	for (int i = array1.length() - 1; i >= 0 ; i--) {
		array2[arrayIndex] = array1[i];
		arrayIndex++;
	}
	
	for (int i = 0; i < array2.length() - 1; i++) {
		System.out.print(array2[i]);
		System.out.print(" ");
	}
	System.out.println("");
	
}
}
}