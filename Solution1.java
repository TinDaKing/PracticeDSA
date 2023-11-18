public class Solution1{
    public void main(String[] args) {
        int A[] = {3,1,5};
        System.out.println("Result: " + solution(A));
    }

    public int solution(int[] A){
        Integer result = 0;
        for (int i=0; i<A.length; i++){
            result= result+A[i]-A[++i];
        }
        return result;
    }

}