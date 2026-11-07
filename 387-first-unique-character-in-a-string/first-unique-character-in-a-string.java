class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        ArrayList<Character> al = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            if(entry.getValue() == 1){
                al.add(entry.getKey());
            }

        }
        for(int i =0;i<s.length();i++){
            if(al.contains(s.charAt(i))){
                return i;
            }
        }
        
        return -1;
    }
}