package Com.Ram.Arrays;

public class ArrayDublicates {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 8, 9, 10, 1, 5, 6, 10, 5, 6 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					System.out.print(nums[j] + " ");

			}
		}

	}

}
