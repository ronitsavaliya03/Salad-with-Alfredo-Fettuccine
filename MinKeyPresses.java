import java.util.*;

public class MinKeyPresses  {
    public int minimumKeypresses(String word) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        List<Integer> frequencies = new ArrayList<>(freqMap.values());

        Collections.sort(frequencies, Collections.reverseOrder());

        int presses = 0;   
        int position = 1;  

        for (int i = 0; i < frequencies.size(); i++) {
            presses += frequencies.get(i) * position;

            if ((i + 2) % 9 == 0) {
                position++;
            }
        }

        return presses;
    }

    public static void main(String[] args) {
        MinKeyPresses  solution = new MinKeyPresses ();

        System.out.println(solution.minimumKeypresses("abcdefghijkl")); // Output: 5

        System.out.println(solution.minimumKeypresses("xyzxyzxyzxyz")); // Output: 12

        System.out.println(solution.minimumKeypresses("aabbccddeeffgghhiiiiii")); // Output: 24
    }
}
