package Com.Ram.Arrays;

public class ArrayDublicatesNumbers {
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) 
			return 0;
		

		int i = 0;
		for ( int j = i; j < nums.length; j++) 
			if (nums[j] != nums[i])
				
				nums[i] = nums[j];
			
		
		return i+1;

	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
		int length1 = removeDuplicates(num);
		System.out.println("Length of the Array: " + length1);
		System.out.println("modified Array:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println();
	}

}
