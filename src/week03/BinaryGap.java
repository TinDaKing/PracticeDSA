package week03;

public class BinaryGap {
    private static BinaryGap instance;
    private BinaryGap(){};

    public static BinaryGap getInstance() {
        if (instance == null) {
            instance = new BinaryGap();
        }
        return instance;
    }
    public int solution(int N) {
        System.out.println(N+" to binary: "+ Integer.toBinaryString(N));

        int maxBinaryGap = 0;
        int count = 0;
        for (char c : Integer.toBinaryString(N).toCharArray()) {
            if (c == '1') {
                maxBinaryGap = Math.max(maxBinaryGap, count);
                count = 0;
            } else {
                count++;
            }
        }
        return maxBinaryGap;
    }
}
