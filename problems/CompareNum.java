import java.util.Scanner;


class CompareNum{
    public static void p(Object s){
        System.out.println(s);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=1010100;
        //sc.nextLine();
        int m=0100101;
        String n1=Integer.toString(n);
        String m1=Integer.toString(m);

        
        char[] s1=n1.toCharArray();
        char[] s2=m1.toCharArray();
        p(n1+" "+m1);

        char[] s3=new char[n1.length()];

        for(int i=0;i<n1.length();i++){
            // if(Character.compare(s1[i], s2[i])==0){
            //     s3[i]='0';
            // }else{
            //     s3[i]='1';
            // }
            p(n1.charAt(i));
            p(m1.charAt(i));
            break;
        }

        // for(char w:s3){
        //     p(w);
        // }

                
    }
}