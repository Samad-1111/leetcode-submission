class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 1){
            return 0;
        }

        char[] arr = s.toCharArray();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            boolean found = false;
            for(int j =0;j<arr.length;j++){
                if(i == j){
                    continue;
                }
                if(ch != arr[j]){
                    found = true;
                }
                else{
                    found = false;
                    break;
                }
            }
            if(found){
                return i;
            }

        }return -1;
    }
}