class Solution {
    public int maximumWealth(int[][] accounts) {
        // Using for loop
        int max = 0;
        // for(int person = 0; person < accounts.length; person ++){
        //     int sum = 0;

        //     for(int account = 0; account < accounts[person].length; account ++){
        //         sum += accounts[person][account];
                
        //     }
        //     if(sum > max){
        //         max = sum;
        //     }
        // }

        // Using For each loop : Because we did not use any indices

        for(int[] person : accounts){
            int sum = 0;
            for(int account : person){
                sum += account;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;


        
    }
}