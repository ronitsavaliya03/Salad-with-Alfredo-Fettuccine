public class ChocolateProblem {
    // x = rupees you have
    // y = rupees for buy 1 chocolate 
    // z = number of chocolate wrappers for buy 1 chocolate
    public int buyTheChocolate(int x, int y, int z){
        int chocolate=x/y;
        int wrappers=chocolate;

        while (wrappers>=z) {
            int freeChocolate=wrappers/z;
            chocolate+=freeChocolate;
            wrappers=freeChocolate+(wrappers%z);
        }
        
        return chocolate;
    }
    public static void main(String[] args) {
        ChocolateProblem shop=new ChocolateProblem();

        System.out.println(shop.buyTheChocolate(15, 1, 3));
    }
}
