int reverse(int x){
    long sum=0;
    while(x>0 || x<0){
        int a=x%10;
         sum=sum*10+a;
        x/=10;
    }
if(sum<2147483647 && sum> -2147483648) return sum;
else return 0; 
}