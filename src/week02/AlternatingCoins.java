package week02;

public class AlternatingCoins {
    public static int solution(int[] A) {
        int maxStreak = 1;
        int curStreak = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                curStreak++;
            } else {
                if (curStreak > maxStreak) {
                    maxStreak = curStreak;
                }
                curStreak = 1;
            }
        }
        if (curStreak > maxStreak) {
            return A.length - curStreak;
        }
        return A.length - maxStreak;
    }
}
