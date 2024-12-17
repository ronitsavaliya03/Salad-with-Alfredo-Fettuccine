import java.util.*;
public class LicenseKeyFormat {
    public String licenseKeyFormatting(String s, int k) {
        ArrayList<Character> cleaned = new ArrayList<>();
        
        for(char ch: s.toCharArray()){
            if(ch!='-'){
                cleaned.add(Character.toUpperCase(ch));
            }
        }

        int length=cleaned.size();
        int firstGroupSize = length % k == 0 ? k : length % k;

        StringBuilder result = new StringBuilder();

        //Append first group
        for (int i = 0; i < firstGroupSize; i++) {
            result.append(cleaned.get(i));
        }

        for (int i = firstGroupSize; i < length; i += k) {
            if (result.length() > 0) {
                result.append('-'); // Add dash before each group
            }
            for (int j = i; j < i + k && j < length; j++) {
                // System.out.println(cleaned.get(j));
                result.append(cleaned.get(j));
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        LicenseKeyFormat lkf=new LicenseKeyFormat();

        String result=lkf.licenseKeyFormatting("5F3Z-2e-9-w", 4);
        System.out.println(result);
    }
    
}