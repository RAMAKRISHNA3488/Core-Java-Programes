package Com.Ram.Arrays;

public class ArrayDublicatesNumbers1 {
	public static int removeDuplicates(int[] nums, int n) {
		if (n == 0 || n == 1)
			return n;

		int j = 0;
		for (int i = 0; i < n - 1; i++)
			if (nums[i] != nums[i + 1])
				nums[j++] = nums[i];

		nums[j++] = nums[n - 1];

		return j;

	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int n = nums.length;
		n = removeDuplicates(nums, n);

		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
