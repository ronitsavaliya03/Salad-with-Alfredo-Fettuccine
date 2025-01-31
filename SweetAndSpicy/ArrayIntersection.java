import java.util.*;

public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count occurrences of elements in nums1
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find intersection by checking nums2
        for (int num : nums2) {
            if (countMap.getOrDefault(num, 0) > 0) {
                result.add(num);
                countMap.put(num, countMap.get(num) - 1); // Decrease count
            }
        }

        // Convert List to sorted array
        // int[] intersection = result.stream().mapToInt(i -> i).toArray();
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i); // Convert List<Integer> to int[]
        }

        Arrays.sort(intersection);
        return intersection;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5, 4 };
        int[] nums2 = { 9, 4, 9, 8, 4 };

        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
