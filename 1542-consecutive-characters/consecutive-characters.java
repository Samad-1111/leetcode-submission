class Solution {
    public int maxPower(String s) {
        int c = 1, max =1;
        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                c++;
                if(c > max){
                    max =c;
                }
            }
            else{
                c = 1;
            }
        }return max;
    }
}