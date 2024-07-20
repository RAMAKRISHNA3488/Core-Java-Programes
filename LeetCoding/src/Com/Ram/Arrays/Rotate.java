package Com.Ram.Arrays;

public class Rotate {
	public static void rotate1(int [] nums,int k) {
		for(int i=0;i<k;i++) {
			int j=nums.length-1;
			int temp=nums[j];
			for(;j>0;j--) {
				nums[j]=nums[j-1];
			}
			nums[0]=temp;
		}
		
		
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7};
		int k=3;
		rotate1(arr, k);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
