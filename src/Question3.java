import java.util.Arrays;
import java.util.List;

public class Question3 {
    public int solution(int[] A, int N) {
        int result = -1;
        List<Integer> setOfElement = Arrays.asList(new Integer[82]);
        System.out.println(setOfElement);

        for (int i = 0; i < N; i++) {
            try {
                int preElementInPair = setOfElement.get(hash(A[i]));
                if (A[i] + preElementInPair > result) {
                    result = A[i] + preElementInPair;
                }
            } catch (Exception e) {
                setOfElement.set(hash(A[i]), A[i]);
            }
        }
        return result;
    }

    private int hash(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a = a / 10;
        }
        return sum;
    }

}

