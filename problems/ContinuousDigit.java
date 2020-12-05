import java.util.Scanner;


//codeforces -problem96A

class ContinuousDigit{
    public static void p(Object s){
        System.out.println(s);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String g=sc.nextLine();//10111111101100
        char[] arr=g.toCharArray();
        boolean flag=true;

        int cn0=0;
        int cn1=0;

        for(char a:arr){
            if(a=='1'){
                cn1+=1;
                cn0=0;
                if(cn1>7||cn1==7){
                    p("YES");
                    flag=false;
                    break;
                }
            }
            else if(a=='0'){
                cn0+=1;
                cn1=0;
                if(cn0>7||cn0==7){
                    p("YES");
                    flag=false;
                    break;
                }
            }
        }

        if(flag)
            p("NO");
        
    }
}