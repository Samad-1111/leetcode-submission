class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm = new HashMap<>();
        HashMap<String,Character> hm2 = new HashMap<>();

        String[] str = s.split(" ");

        if(pattern.length() != str.length){
            return false;
        }
        for(int i =0;i<pattern.length();i++){
            String word = str[i];
            char ch = pattern.charAt(i);
            if(hm.containsKey(ch)){
                if(!hm.get(ch).equals(word)){
                    return false;
                }
            }
            hm.put(ch,word);

            if(hm2.containsKey(word)){
                if(!hm2.get(word).equals(ch)){
                    return false;
                }
            }
            hm2.put(word,ch);
        }return true;
        
    }
}