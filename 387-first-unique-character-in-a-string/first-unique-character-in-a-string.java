class Solution {
    public int firstUniqChar(String s) {
        int n = -1;
        char[] arr = s.toCharArray();

        for(int i =0;i<s.length();i++){
            boolean uni = true;
            for(int j =0;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j) && i != j){
                    uni = false;
                    break;
                }
            }
            if(uni){
                n = i;
                break;
            }
        }return n;
    }
}