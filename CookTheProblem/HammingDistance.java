public class HammingDistance {
    public int findHammingDistance(int n1, int n2){
        int distance=0;
        int xor=n1^n2;

        while (xor>0) {
            distance+=(xor&1);
            xor>>=1;
        }

        return distance;
    }
    public static void main(String[] args) {
        // System.out.println(9^14); //0111
        // System.out.println(7&1);  //0001

        HammingDistance pair=new HammingDistance();
        System.out.println(pair.findHammingDistance(4, 8));
    }
}
