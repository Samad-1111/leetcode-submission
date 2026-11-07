class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int hmsize = hm.size();
        for(int i =0;i<hmsize;i++){
            int max = 0;
            char maxKey = '\0';
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            
            if(entry.getValue() > max){
                max = entry.getValue();
                maxKey = entry.getKey();
            }
            }
        for(int j=0;j<max;j++){
            sb.append(maxKey);
        }
        hm.remove(maxKey);
        }
        return sb.toString();
    }
}