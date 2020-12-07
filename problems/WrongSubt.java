import java.util.Scanner;


public class WrongSubt {
    public static void p(Object s){
        System.out.println(s);
    }
 
    //problem-977A
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int str=sc.nextInt();
        int str2=sc.nextInt();


        for(int i=0;i<str2;i++){
            if(str%10==0){
                str=str/10;
            }else{
                str=str-1;
            }
        }

        p(str);

    }
}