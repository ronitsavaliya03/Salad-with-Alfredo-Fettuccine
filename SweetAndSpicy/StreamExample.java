import java.util.*;
// import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 9, 5);

        // Convert List<Integer> to int[]
        int[] array = list.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(array));  // Output: [4, 9, 5]
    }
}
