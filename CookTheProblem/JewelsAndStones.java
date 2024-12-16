import java.util.HashSet;

public class JewelsAndStones{
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet= new HashSet<>();

        for(char jewel: jewels.toCharArray()){
            jewelSet.add(jewel);
        }

        int count=0;

        for(char stone: stones.toCharArray()){
            if(jewelSet.contains(stone)){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        // String jewels = "z";
        // String stones = "ZZ";

        JewelsAndStones Krisn=new JewelsAndStones();

        int result = Krisn.numJewelsInStones(jewels, stones);
        System.out.println("Number of jewels in stones: " + result); // Output: 3
    }
}