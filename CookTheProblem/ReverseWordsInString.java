public class ReverseWordsInString {
    public void reverseWords(String s){
        StringBuilder cleaned=new StringBuilder();
        int n=s.length();
        boolean space=true;

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
        // System.out.println(cleaned);
        // Not completed
    }
    public static void main(String[] args) {
        ReverseWordsInString test=new ReverseWordsInString();

        test.reverseWords("  the sky is pink  ");
    }
}
