public class Demo{
    public void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*n-(2*i+1); k++){
                System.out.print("*");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern2(int n){
        for(int i=0; i<2*n+1; i++){
            int star=i;

            if(i>n) star=2*n-i;

            for(int j=0; j<star+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3(int n){
        for(int i=0; i<n; i++){
            int start;

            if(i%2==0) start=1;
            else start=0;

            for(int j=0; j<=i; j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }

    public void pattern4(int n){
        int space=2*(n-1);

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            for(int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }

    public void pattern5(int n){
        int num=1;
        for(int i=0; i<n; i++){
            for(int j=0 ; j<=i; j++){
                System.out.print(" "+num++);
            }
            System.out.println();
        }
    }
    
    public void pattern6(int n){
        for(int i=0; i<n; i++){
            for(char ch='A'; ch<'A'+(n-i); ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public void pattern7(int n){
        for(int i=0; i<n; i++){
            char ch=(char) ('A'+ i);
            for(int j=0; j<=i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public void pattern8(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            char ch='A';
            int breakpoint=(2*i*1)/2;
            for(int k=1; k<=2*i+1; k++){
                System.out.print(ch);
                
                if(k<=breakpoint) ch++;
                else ch--;
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }        

    public void pattern9(int n){
        for(int i=0; i<n; i++){
            //stars
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            //spaces
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            //stars
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=n*2; j>(2*i)+2; j--){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Demo cook=new Demo();

        int n=5;
        // cook.pattern1(n);
        // cook.pattern2(n);
        // cook.pattern3(n);
        // cook.pattern4(n);
        // cook.pattern5(n);
        // cook.pattern6(n);
        // cook.pattern7(n);
        // cook.pattern8(n);
        cook.pattern9(n);
    }
}