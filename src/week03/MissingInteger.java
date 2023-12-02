package week03;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    private static MissingInteger instance;
    private MissingInteger(){};

    public static MissingInteger getInstance() {
        if (instance == null) {
            instance = new MissingInteger();
        }
        return instance;
    }
    public int solution(int A[]){
        Set<Integer> numberInArray = new HashSet<>();
        int result = 0;
        for(Integer a: A) {
            numberInArray.add(a);
        }
        while(!numberInArray.add(++result));

        return result;
    }
}
