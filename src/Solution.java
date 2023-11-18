import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Solution{

    public int solution1(int[] A){
        List<Integer> newA = cleanArray(A);
        if(newA.size() == 1){
            return newA.get(0);
        }
        BigInteger result = BigInteger.valueOf(0);
        int countContinuousStreak = 0;
        // 3 continuous ascending numbers: 3
        // 3 continuous descending numbers: -3

        int startStreakIndex = 0;
        System.out.println(newA);

        for(int i=1; i< newA.size(); i++){
            if(newA.get(i) > newA.get(i-1) && countContinuousStreak >= 0){
                countContinuousStreak++;
                // System.out.println("Up streak "+countContinuousStreak+": "+newA.get(i));
            } else if (newA.get(i) < newA.get(i-1) && countContinuousStreak <= 0) {
                countContinuousStreak--;
                // System.out.println("Down streak "+countContinuousStreak+": "+newA.get(i));
            } else {
                // System.out.println("Change streak "+countContinuousStreak+": "+newA.get(i));
                if (i < newA.size()-1 && countContinuousStreak >0){
                    countContinuousStreak = -1;
                }
                else if (i < newA.size()-1 && countContinuousStreak <0) {
                    result = result.add(BigInteger.valueOf(descendingPart(newA.subList(startStreakIndex,i))));
                    result = result.subtract(BigInteger.valueOf(newA.get(i-1)));
                    countContinuousStreak = 1;

                } else if (i==newA.size()-1 && countContinuousStreak >0) {
                    result = result.add(BigInteger.valueOf(ascendingPart(newA.subList(startStreakIndex,i))));
                    countContinuousStreak = 0;

                } else if(i==newA.size()-1 && countContinuousStreak <0){
                    result = result.add(BigInteger.valueOf(descendingPart(newA.subList(startStreakIndex,i))));
                    result = result.subtract(BigInteger.valueOf(newA.get(i-1)));
                    result = result.add(BigInteger.valueOf(newA.get(i)));
                    countContinuousStreak = 0;
                }
                startStreakIndex = i-1;
            }

        }

        if(countContinuousStreak >0){
            result = result.add(BigInteger.valueOf(ascendingPart(newA.subList(startStreakIndex, newA.size()))));
        } else if(countContinuousStreak <0){
            result = result.add(BigInteger.valueOf(descendingPart(newA.subList(startStreakIndex,newA.size()))));
        }

        return result.mod(BigInteger.valueOf(1000000000)).intValue();
    }
    public List<Integer> cleanArray(int[] A){ //eliminate the nearby same number
        List<Integer> newA = new ArrayList<>();
        newA.add(A[0]);
        for(int i=1; i<A.length; i++){
            if(A[i] != A[i-1]){
                newA.add(A[i]);
            }
        }
        return newA;
    }
    public int ascendingPart(List<Integer> A) {
        return A.get(A.size()-1);
    }

    public int descendingPart(List<Integer> A){
        return A.get(0);
    }
}