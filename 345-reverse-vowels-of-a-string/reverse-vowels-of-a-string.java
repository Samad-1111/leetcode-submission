class Solution {
    public String reverseVowels(String s) {
        int f = 0;
        int b = s.length()-1;
        char[] arr = s.toCharArray();
        String vow = "AEIOUaeiou";

        while(f < b){
            while(f < b && vow.indexOf(arr[f]) == -1){
                f++;
            }
            while(f < b && vow.indexOf(arr[b]) == -1){
                b--;
            }
            char temp = arr[f];
            arr[f] = arr[b];
            arr[b] = temp;
            f++;
            b--;
         }
         return new String(arr);
    }
}