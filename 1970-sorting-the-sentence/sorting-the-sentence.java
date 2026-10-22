class Solution {
    public String sortSentence(String s) {
        String[] arr = new String[9];
        int count = 0;

        for(int i =0;i<s.length();){
            
            int start = i;
            
            while(i < s.length() && s.charAt(i) != ' '){
                i++;
            }
            int end = i-1;
            int position = s.charAt(end) - '0';

            arr[position -1] = s.substring(start,end);
            count++;
            i++; 
        }
        StringBuilder result = new StringBuilder();

        for(int i=0;i<count;i++){
            if(i > 0){
                result.append(' ');
            }
            result.append(arr[i]);
        }
        return result.toString();
    }
}