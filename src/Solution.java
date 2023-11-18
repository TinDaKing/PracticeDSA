public class Solution{
    public int test1(int[] A){
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

    public int solution1(int[]A){
        Integer result=0;
        Integer tempResult=0;
        int loop=0;
        int minusTime = 0;
        while (loop<A.length){
            for (int i=loop; i<A.length;i++){
                int storageA[]= new int[A.length];
                tempResult += A[i];
                System.out.print(A[i]+" ");
                for (int j=i+1; j<A.length; j++){
                    if(A[i] > A[j]) {
                        tempResult -= A[j];
                        System.out.println(A[j]+" ");
                        minusTime++;
                        i = j;
                        break;
                    }
                }
                if (minusTime==0){
                    tempResult-=A[i];
                    tempResult+=A[A.length-1];
                    i = A.length;
                }
                minusTime = 0;
            }
            if (tempResult > result){
                result = tempResult;
                System.out.println("End of loop " + loop);
            }
            tempResult = 0;
            loop++;
        }
        return result % 1000000000;
    }

}