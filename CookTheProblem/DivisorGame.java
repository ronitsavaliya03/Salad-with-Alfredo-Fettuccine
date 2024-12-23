public class DivisorGame {
    public boolean divisorGame(int n) {
        return n%2==0;
    }
    public static void main(String[] args) {
        DivisorGame game=new DivisorGame();

        int n=21;
        if(game.divisorGame(n)){
            System.out.println("Alice wins!");
        }
        else{
            System.out.println("Bob wins.");
        }
    }
}
