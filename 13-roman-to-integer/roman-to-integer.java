class Solution {
    public int romanToInt(String s) {

        char[] arr = s.toCharArray();
        int I = 1,V = 5, X = 10, L = 50, C = 100, D =500, M=1000;
        int curr =0,res = 0;

        for(int i=0;i<s.length();i++){
            int next = 0;
            if(s.charAt(i) == 'I'){
                curr = I;
            }
            if(s.charAt(i) == 'V'){
                curr = V;
            }
            if(s.charAt(i) == 'X'){
                curr = X;
            }
            if(s.charAt(i) == 'L'){
                curr = L;
            }
            if(s.charAt(i) == 'C'){
                curr = C;
            }
            if(s.charAt(i) == 'D'){
                curr = D;
            }
            if(s.charAt(i) == 'M'){
                curr = M;
            }

            //next

        if(i < s.length()-1){
            if(s.charAt(i + 1) == 'I'){
                next = I;
            }
            if(s.charAt(i + 1) == 'V'){
                next = V;
            }
            if(s.charAt(i + 1) == 'X'){
                next = X;
            }
            if(s.charAt(i + 1) == 'L'){
                next = L;
            }
            if(s.charAt(i + 1) == 'C'){
                next = C;
            }
            if(s.charAt(i + 1) == 'D'){
                next = D;
            }
            if(s.charAt(i + 1) == 'M'){
                next = M;
            }
        }
            if (curr < next) {
                res += next - curr;
                i++; 
            } 
            else {
                res += curr;
            }
        } 
    return res;
    }
}


// res += charAt(i);
//res += charAt(i+1) - charAt(i);