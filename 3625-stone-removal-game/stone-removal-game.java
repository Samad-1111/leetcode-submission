class Solution {
    public boolean canAliceWin(int n) {
        for(int i =10;i>0;i--){   // i refers to stones 
            if(n < i){
                return i % 2 != 0;
            }
            n -= i;
        }return false;
    }
}