class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count ++;
            }
        }
        return count;
        
    }
    boolean even(int num){
        int numOfDigits = digits(num);
        // if(numOfDigits % 2 == 0){
        //     return true;
        // }else {
        //     return false;
        // }
        // [OR]
        return numOfDigits % 2 == 0;
    }
    int digits(int num){
        //int count = 0;
        if(num < 0) return num * -1;
        if(num == 0) return 1;

        return (int) Math.log10(num) +  1;

        // while(num > 0){
        //     count ++;
        //     num = num /  10;
        // }
       //  return count;
    }
}