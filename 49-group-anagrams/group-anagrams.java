class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        List<HashMap<Character,Integer>> map =new ArrayList<>();

        for(int i =0;i<strs.length;i++){
            String str = strs[i];
            char[] ch = str.toCharArray();
        
        HashMap<Character,Integer> hm = new HashMap<>();

            for(int j=0;j<ch.length;j++){
                hm.put(ch[j],hm.getOrDefault(ch[j],0)+1);
            }
            boolean found = false;

            for(int k =0;k<map.size();k++){
                if(map.get(k).equals(hm)){
                    result.get(k).add(str);
                    found = true;
                    break;
                }
            }
            if(!found){
                map.add(hm);
                List<String> grp = new ArrayList<>();
                grp.add(str);
                result.add(grp);

            }
        } return result;
    }
}