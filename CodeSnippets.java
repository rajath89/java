import java.util.Scanner;


class CodeSnippets{
    public static void p(Object s){
        System.out.println(s);
    }

    public static void main(String[] args){

        //convert +ve int to -ve int
        int pos=300;
        int neg = (~(pos - 1));
        p(neg);

        //split digits
        int dig=1234;
        while(dig>0){
            p(dig%10);
            dig=dig/10;
        }

                
    }
}