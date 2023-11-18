import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Solution{
    public int test1(int[] A){
        Integer result = 0;
        int n= A.length;
        if((n&1)==1){
            n--;
            result+=A[n];
        }
        for (int i=0; i<n; i++){
            result = result + A[i] - A[++i];
        }
        return result;
    }

    public int solution1(int[]A){
        Integer result=0;
        Integer tempResult=0;
        Integer minusElement=0;
        int loop=0;
        int minusTime = 0;
        while (loop<A.length){
            for (int i=loop; i<A.length;i++){
                int storageA[]= new int[A.length];
                tempResult += A[i];
                System.out.print(A[i]+" ");
                for (int j=i+1; j<A.length; j++){
                    if(A[i] > A[j]) {
                        minusElement = A[j];
                        System.out.println(A[j]+" ");
                        minusTime++;
                        i = j;
                    }
                }
                if (minusTime == 0){
                    tempResult -= A[i];
                    tempResult += A[A.length-1];
                    i = A.length;
                }
                minusTime = 0;
            }
            if (tempResult > result){
                result = tempResult;
                System.out.println("End of loop " + loop);
            }
            tempResult = 0;
            loop++;
        }
        return result % 1000000000;
    }

    public int solution2(int[] A){
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
                System.out.println("Up streak "+countContinuousStreak+": "+newA.get(i));
            } else if (newA.get(i) < newA.get(i-1) && countContinuousStreak <= 0) {
                countContinuousStreak--;
                System.out.println("Down streak "+countContinuousStreak+": "+newA.get(i));
            } else {
                System.out.println("Change streak "+countContinuousStreak+": "+newA.get(i));
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
                    break;

                } else if(i==newA.size()-1 && countContinuousStreak <0){
                    System.out.println(i);
                    result = result.add(BigInteger.valueOf(descendingPart(newA.subList(startStreakIndex,i))));
                    System.out.println(descendingPart(newA.subList(startStreakIndex,i))+" "+newA.get(i-1)+" "+newA.get(i));
                    result = result.subtract(BigInteger.valueOf(newA.get(i-1)));
                    result = result.add(BigInteger.valueOf(newA.get(i)));
                    countContinuousStreak = 0;
                }
                System.out.println("Current result: "+result.intValue()+"\n");
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