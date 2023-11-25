package week02;

public class MaxProfit {
    public static int solution(int[] A) {
        int minPrice = A[0];
        int maxProfit = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < minPrice) {
                minPrice = A[i];
            } else if (A[i] - minPrice > maxProfit) {
                maxProfit = A[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
