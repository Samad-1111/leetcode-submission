class Solution {
    public boolean isPalindrome(String s) {
        int count =0;
        int count1 =0;
        s = s.toLowerCase();
        char[] arr1 = new char[s.length()];
        char[] arr2 = new char[s.length()];
        
        for(int i =0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                arr1[count1++] =s.charAt(i);
            }
        }
        for(int j =count1-1;j>=0;j--){
            arr2[count++] = arr1[j];
        }
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
            return false;
    }
}