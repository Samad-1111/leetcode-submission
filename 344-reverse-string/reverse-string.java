class Solution {
    public void reverseString(char[] s) {
        int count = 0;
        char[] arr = new char[s.length];
        for(int i =s.length-1;i>=0;i--){
            arr[count++] = s[i];
        }
        for(int i =0;i<s.length;i++){
            s[i] = arr[i];
        }System.out.println(Arrays.toString(s));
    }
}