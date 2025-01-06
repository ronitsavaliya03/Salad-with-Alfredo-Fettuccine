public class ReverseWordsInString {
    public String reverseWords(String s){
        StringBuilder cleaned=new StringBuilder();
        int n=s.length();
        boolean space=true;

        // Remove leading space if present
        for(int i=0; i<n; i++){
            char c=s.charAt(i);
            
            if(c!=' '){
                cleaned.append(c);
                space=false;
            }
            else if(!space){
                cleaned.append(' ');
                space=true;
            }
        }

        // Remove trailing space if present
        if (cleaned.length() > 0 && cleaned.charAt(cleaned.length() - 1) == ' ') {
            cleaned.deleteCharAt(cleaned.length() - 1);
        }
       
        reverse(cleaned, 0, cleaned.length()-1);
        // System.out.println(cleaned);


        int start=0;
        for(int i=0; i<=cleaned.length(); i++){
            if(i==cleaned.length() || cleaned.charAt(i)==' '){
                reverse(cleaned, start, i-1);
                start=i+1;
            }
        }
        // System.out.println(cleaned);

        return cleaned.toString();
    }

    // Helper method to reverse a portion of a StringBuilder
    private static void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        ReverseWordsInString test=new ReverseWordsInString();

        String ans=test.reverseWords("  the sky is pink  ");
        System.out.println(ans);    
    }
}
