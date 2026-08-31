int numWaterBottles(int numBottles, int numExchange) {
     int total = numBottles;
    
    while (numBottles >= numExchange) {
        int new = numBottles / numExchange;
        total += new;
        numBottles = new + (numBottles % numExchange);
    } return total;


  /* int div=0,sum=0;
  div=numBottles/numExchange;
  sum=numBottles+div;
  if(sum%numExchange==0) return sum+1;
  else return sum;*/
}