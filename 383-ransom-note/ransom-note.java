class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()){
            return false;
        }
        int c1 =0 , c2 =0;
        char[] r = ransomNote.toCharArray();
        char[] s = magazine.toCharArray();

        Arrays.sort(r);
        Arrays.sort(s);
        
        for(int i =0;i<s.length;i++){

            if(r[c1] != s[i]){
                continue;
            }
            else{
                c1++;
            }
            
            if(c1 == r.length) return true;
        }
            return false;
    }
}