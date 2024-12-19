public class ClimbStairs {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        
        int a=1;
        int b=2;

        for(int i=3; i<n+1; i++){
            int temp=a+b;
            a=b;
            b=temp;
        }
        return b;
    }

    public int climbStairsAnotherApproach(int n){
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        
        return climbStairsAnotherApproach(n-1) + climbStairsAnotherApproach(n-2);
    }
    public static void main(String[] args) {
        ClimbStairs ways= new ClimbStairs();

        System.out.println(ways.climbStairsAnotherApproach(5));
        System.out.println(ways.climbStairs(8));

    }
}
