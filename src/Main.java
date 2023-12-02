import week02.AlternatingCoins;
import week02.BalancedString;
import week02.MaxProfit;
import week03.BinaryGap;
import week03.MissingInteger;
import week03.PrimesSimple;

public class Main {
    public static void main(String[] args) {

        // week 3 binary gap
        int N = 9;
        int N1 = 529;
        int N2 = 15;
        int N3 = 32;

        System.out.println("Binary gap: " + BinaryGap.getInstance().solution(N1));

        // week 3 primes simples
        System.out.println("Prime amount: " + PrimesSimple.getInstance().solution(11, 19));

        // week 3 missing integer
        int A[] = {1, 3, 6, 4, 1, 2};
        int A1[] = {1, 2, 3};
        int A2[] = {-1, -3};
        System.out.println("Missing integer: " + MissingInteger.getInstance().solution(A));

    }

}