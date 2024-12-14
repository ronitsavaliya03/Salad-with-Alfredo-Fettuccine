import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();

        dfs(0, rooms, visited);

        return visited.size()==rooms.size();
    }

    public void dfs(int currentRoom, List<List<Integer>> rooms, Set<Integer> visited){
        visited.add(currentRoom);

        for(int key: rooms.get(currentRoom)){
            // System.out.println(key);
            if(!visited.contains(key)){
                dfs(key, rooms, visited);
            }
        }

        // System.out.println(visited);
    }
}

public class KeysAndRooms {
    public static void main(String[] args) {
        Solution solution=new Solution();

        List<List<Integer>> rooms1 = new ArrayList<>();
        rooms1.add(Arrays.asList(1));
        rooms1.add(Arrays.asList(2));
        rooms1.add(Arrays.asList(3));
        rooms1.add(new ArrayList<>());
        System.out.println(solution.canVisitAllRooms(rooms1)); // Output: true

        List<List<Integer>> rooms2 = new ArrayList<>();
        rooms2.add(Arrays.asList(1, 3));
        rooms2.add(Arrays.asList(3, 0, 1));
        rooms2.add(Arrays.asList(2));
        rooms2.add(Arrays.asList(3));
        System.out.println(solution.canVisitAllRooms(rooms2)); // Output: false
    }
}
