package week02;

public class TestCaseWeek02 {
    public void checkResult(){
        int A[] = {1,0,1,0,1,1};
        int A1[] ={1,1,0,1,1};
        int A2[] ={0,1,0};
        int A3[] ={0,1,1,0};
        System.out.println(AlternatingCoins.solution(A));

        // week 02 max profit
        int B[] = {23171,21011,21123,21366,21013,21367};
        int B1[] = {25,17,16,21,14,10,4,2,1};
        System.out.println(MaxProfit.solution(B));

        // week 03 balanced string
        String C = "azABaabza";
        String C1= "TacoCat";
        String C2= "AcZCbaBz";
        BalancedString balancedString = new BalancedString();
        System.out.println(balancedString.solution(C1));
    }
}
