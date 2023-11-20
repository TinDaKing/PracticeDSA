import week02.AlternatingCoins;

public class Main {
    public static void main(String[] args) {

        // week 2 alternating coins
        int A[] = {1,0,1,0,1,1};
        int A1[] ={1,1,0,1,1};
        int A2[] ={0,1,0};
        int A3[] ={0,1,1,0};
        AlternatingCoins alternatingCoins = new AlternatingCoins();
        System.out.println(alternatingCoins.solution(A));
    }

}