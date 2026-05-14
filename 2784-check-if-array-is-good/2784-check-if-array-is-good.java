import java.util.*;

class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(nums[0] != 1){
            return false;
        }
        if(n < 2) {
            return false;
        }
        if(nums[n - 1] != nums[n - 2]){
                return false;
        }
        for(int i = 0; i < n - 1; i++){
            if(nums[i] != i + 1){
               return false;
            }
        }
        return true;
    }
}