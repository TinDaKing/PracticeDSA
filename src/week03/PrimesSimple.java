package week03;

public class PrimesSimple {
    private static PrimesSimple instance;
    private PrimesSimple(){};

    public static PrimesSimple getInstance() {
        if (instance == null) {
            instance = new PrimesSimple();
        }
        return instance;
    }

    public int solution(int A, int B){
        int primeAmount=0;
        for(int i=0; i<=B-A;i++){
            if(isPrime(A+i)){
                primeAmount++;
            }
        }
        return primeAmount;
    }
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
