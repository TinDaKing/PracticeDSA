
import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public int solution(int[] A, int N){
        int result = 0;
        List<Integer> setOfElement = new ArrayList<>(82);
        System.out.println(setOfElement);
        for(int i=0; i<N; i++) {
            if(!setOfElement.add(A[i])){

            }

        }
        return result;
    }
    private int hash(int a){
        int sum=0;
        while(a!=0){
            sum+=a%10;
            a=a/10;
        }
        return sum;
    }

}

