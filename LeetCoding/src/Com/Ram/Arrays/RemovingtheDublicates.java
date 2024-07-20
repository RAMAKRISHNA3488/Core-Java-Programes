package Com.Ram.Arrays;

import java.nio.file.attribute.AclEntry;

//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
public class RemovingtheDublicates {
	public static int remove(int []arr) {
		int length=arr.length;
		if(length==0) {
			return 0;
		}
		int i=0;
		for(int j=1;j<length;j++) {
			if(arr[j]!=arr[i]) {
				i++;
				arr[i]=arr[j];
			}
		}
		return i+1;
	}
	
	public static void main(String[] args) {
		int [] arr= {0,0,1,1,1,2,2,3,3,4};
		int num=remove(arr);
		for(int i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}
			}

}
