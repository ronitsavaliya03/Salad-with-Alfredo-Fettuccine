public class StringToIntegerAtoi {
    public int myAtoi(String s){
        //Step 1: Remove whitespace
        s=s.trim();

        //Step 2: Check Empty String
        if(s.isEmpty()){
            return 0;
        }

        //Step 3: Determine the sign
        int sign=1;
        int index=0;

        if(s.charAt(0)=='-'){
            sign=-1;
            index++;
        }else if(s.charAt(0)=='+'){
            index++;
        }

        //Step 4: Convert to int
        int result=0;
        int limit=Integer.MAX_VALUE/10;

        while(index<s.length() && Character.isDigit(s.charAt(index))){
            int digit=s.charAt(index)-'0';
            // System.out.println(digit);

            if(result>limit || (result==limit && digit>7)){
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result=result*10+digit;
            index++;
        }

        return result*sign;
    }
    public static void main(String[] args) {
        StringToIntegerAtoi atoi=new StringToIntegerAtoi();

        System.out.println(atoi.myAtoi("41hy"));
        System.out.println(atoi.myAtoi("   -42"));
        System.out.println(atoi.myAtoi("asdf 963"));
        System.out.println(atoi.myAtoi("-9861862641"));
        System.out.println(atoi.myAtoi("0-1"));

    }
}
