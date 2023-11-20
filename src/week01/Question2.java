package week01;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public int solution(String S) {
        List<Integer> sizeOfBlocks = new ArrayList<>();
        int maxSizeBlock = 0;
        int countSizeBlock = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                countSizeBlock++;
            } else {
                if (countSizeBlock > maxSizeBlock) {
                    maxSizeBlock = countSizeBlock;
                }
                sizeOfBlocks.add(countSizeBlock);
                countSizeBlock = 1;
            }
        }

        sizeOfBlocks.add(countSizeBlock);
        if (countSizeBlock > maxSizeBlock) {
            maxSizeBlock = countSizeBlock;
        }
        int result = 0;
        for (int block : sizeOfBlocks) {
            result += (maxSizeBlock - block);
        }
        return result;
    }
}
