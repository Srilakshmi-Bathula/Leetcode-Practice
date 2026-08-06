class Solution {
    public int reverse(int x) {

        int sign = (x < 0) ? -1: 1;  //for case -2
        x = Math.abs(x);
        long rev = 0;

        while( x > 0){
            long digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        rev = sign * rev;
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;

        return (int) rev;
    }
}