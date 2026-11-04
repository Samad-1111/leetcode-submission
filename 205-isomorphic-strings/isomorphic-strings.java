class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Character> maps = new HashMap<>();
        HashMap<Character,Character> mapt = new HashMap<>();

        for(int i =0;i<t.length();i++){
           
           char a = s.charAt(i);
           char b = t.charAt(i);

            if(maps.containsKey(a)){
                if(maps.get(a) != b){
                    return false;
                }
            }
            else{
                maps.put(a,b);
            }
            if(mapt.containsKey(b)){
                if(mapt.get(b) != a) return false;
            }
            else{
                mapt.put(b,a);
            }
           
        }return true;
    }
}