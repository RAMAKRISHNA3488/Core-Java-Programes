package Com.Ram.Arrays;

public class MaxProfit {
	public static int maxprofit(int []arr) {
		int maxprofit=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				maxprofit +=arr[i]-arr[i-1];
			}
		}
		return maxprofit;
	}
	public static void main(String[] args) {
		int [] arr= {7,1,5,3,6,4};
		System.out.println(maxprofit(arr));
	
		
	}

}
