package Array;

import java.util.Arrays;

public class MaxProductOfTwoNumber {
	public int getMaxProduct(int nums[]) {
		
		Arrays.sort(nums);
		int prod1=nums[0]*nums[1];
		int prod2=nums[nums.length-1]*nums[nums.length-2];
		if(prod1>prod2) {
			return prod1;
		} else {
			return prod2;
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}
