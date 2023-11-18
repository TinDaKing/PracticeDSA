public class Solution{
    public int solution1(int[] A){
        Integer result = 0;
        int n= A.length;
        if((n&1)==1){
            n--;
            result+=A[n];
        }
        for (int i=0; i<n; i++){
            result = result + A[i] - A[++i];
        }
        return result;
    }

}