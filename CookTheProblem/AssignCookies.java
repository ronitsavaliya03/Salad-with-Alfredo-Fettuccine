import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count=0;
        int i=0; //Pointer for child
        int j=0; //Pointer for cookie

        while (i<g.length && j<s.length) {
            if(g[i]<=s[j]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        AssignCookies parent=new AssignCookies();

        int[] g = {2,1};
        int[] s = {1,2,3};

        System.out.println(parent.findContentChildren(g, s));
    }
}
