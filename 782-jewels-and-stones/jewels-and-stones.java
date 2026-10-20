class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int c1 =0,c2 =0;
        char[] j = jewels.toCharArray();
        char[] s = stones.toCharArray();

        Arrays.sort(j);
        Arrays.sort(s);

    while(c1 < j.length){
        for(int i =0;i<s.length;i++){
            if(j[c1] == s[i]){
                c2++;
            }
        }c1++;
    }
        return c2;

    }
}