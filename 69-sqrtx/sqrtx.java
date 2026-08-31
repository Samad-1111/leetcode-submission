class Solution {
    public int mySqrt(int x) {
        for(int i=0;i<=x;i++){
            long res =(long)i * i;

            if(res == x) return i;
            if(res > x) return i-1;
        }return 0;
    }
}