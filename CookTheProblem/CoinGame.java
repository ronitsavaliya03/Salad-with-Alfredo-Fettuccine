public class CoinGame {
    // x and y, denoting the number of coins with values 75 and 10 respectively.
    public String winningPlayer(int x, int y) {
        if(x*75+y*10<115){
            return "No one can win!";
        }

        boolean aliceTurn = true;

        while (true) {
            // Check if the current player can make 115
            boolean canMake115 = false;

            for (int a = 0; a <= Math.min(x, 115 / 75); a++) {
                int remainingValue = 115 - a * 75;
                if (remainingValue % 10 == 0 && remainingValue / 10 <= y) {
                    // Current player makes a valid move
                    x -= a;
                    y -= remainingValue / 10;
                    canMake115 = true;
                    break;
                }
            }

            // If the current player cannot make 115, they lose
            if (!canMake115) {
                return aliceTurn ? "Bob" : "Alice";
            }

            // Switch turns
            aliceTurn = !aliceTurn;
        }
    }
    public static void main(String[] args) {
        CoinGame game=new CoinGame();
        int x=1;
        int y=4;

        System.out.println("Winner: "+game.winningPlayer(x, y));
    }
}
