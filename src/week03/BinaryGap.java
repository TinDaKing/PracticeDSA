package week03;

public class BinaryGap {
    public static int solution(int N) {
        int maxBinaryGap = 0;
        int count = 0;
        String binaryN = Integer.toBinaryString(N);
        System.out.println(N+" to String: "+binaryN);
        for (int i = 0; i < binaryN.length(); i++) {
            if (binaryN.charAt(i) == '1') {
                if (count > maxBinaryGap) {
                    maxBinaryGap=count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return maxBinaryGap;
    }
}
