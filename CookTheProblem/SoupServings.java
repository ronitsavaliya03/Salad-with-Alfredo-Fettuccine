import java.util.*;

public class SoupServings {
    public double SoupServings(int n){
        // For large n, the probability that A becomes empty first approaches 1
        if(n>4800){
            return 1.0;
        }

        n=(n+24)/25;

        Map<String, Double> memo= new HashMap<>();

        return helper(n, n, memo);
    }

    private double helper(int soupA, int soupB, Map<String, Double> memo){
        if(soupA<=0 && soupB>0) return 1.0; // A becomes empty first
        if(soupA<=0 && soupB<=0) return 0.5; // Both become empty at the same time
        if(soupA>0 && soupB<=0) return 0.0; // B becomes empty first

        String key= soupA+","+soupB;
        if(memo.containsKey(key)){
            return memo.get(key);
        }

        double result=0.25*(
            helper(soupA-4, soupB, memo)+
            helper(soupA-3, soupB-1, memo)+
            helper(soupA-2, soupB-2, memo)+
            helper(soupA-1, soupB-3, memo)
        );

        memo.put(key, result);

        return result;
    }
    public static void main(String[] args) {
        SoupServings solver= new SoupServings();

        System.out.println(solver.SoupServings(100));
    }
}
