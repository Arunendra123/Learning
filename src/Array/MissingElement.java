package Array;

public class MissingElement {
    public static int missingNumber(int[] nums) {  
        for(int i=0;i<nums.length;i++) {
            if(Math.abs(nums[i])<=nums.length-1) {
            	if(nums[Math.abs(nums[i])]==0) {
            		nums[Math.abs(nums[i])]=-nums.length*2;
            	}
                nums[Math.abs(nums[i])]=nums[Math.abs(nums[i])]*-1;
            } 
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) {
                return i;
            }
        }
        return nums.length;
    }
    
    public static void main(String[] args) {
		System.out.println(missingNumber(new int[] {3,0,1}));
	}
}