public static int largestOddNumber(int L, int R, int k){
        int max = Math.max(L, R);
        if(k>max/2){
            return 0;
        }else{
            if((max & 1) >0){
                return max-2*k+2;
            }else{
                return max-2*k+1;
            }
        }
  public static void main(String[]args){
        System.out.println("max odd at kth = "+largestOddNumber(-3, 3, 1));
        
    }
