package LeetCode;

public class Sort {
   public static int[] sort(int[] nums){
       int temp =0;
       for(int i=0;i<nums.length-1;i++){
           for(int j=i+1;j<nums.length;j++){
             if(nums[i] < nums[j]){
                 temp = nums[i];
                 nums[i] = nums[j];
                 nums[j] = temp;
             }
           }
       }
       return nums;
   }
}
