package Com.Ram.Arrays;

public class RotateArray {
	public void rotate(int[] nums,int k) {
		if(nums==null||nums.length==0) {
			return;
		}
		/*int [] a=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			a[(i+k)%nums.length]=nums[i];
		}
		for(int i=0;i<nums.length;i++) {
			nums[i]=a[i];
			System.out.print(nums[i]);
		}*/
		int offset=k%nums.length;
		System.out.println(offset);
		reverse(nums,0,nums.length-1);
		reverse(nums, 0, offset-1);
		reverse(nums,  offset,nums.length-1);
		
	}
	private void reverse(int[] nums, int start, int end) {
		while(start<end) {
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		
	}
	public static void main(String[] args) {
		int []nums= {1,2,3,4,5,6,7};
		int k=3;
		RotateArray ra=new RotateArray();
		ra.rotate(nums, k);
	}

}
