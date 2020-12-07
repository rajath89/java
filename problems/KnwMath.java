import java.util.Scanner;

//problem - 546A
public class KnwMath {
    public static void p(Object s){
        System.out.println(s);
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int k=0;
        int n=0;
        int w=0;

        
        k=sc.nextInt();
        n=sc.nextInt();
        w=sc.nextInt();
        
        int sum=0;
        for(int j=1;j<w+1;j++){
            sum=sum+(k*j);
        }

        if(sum>n){
            int amt=sum-n;
            p(amt);
        }else if(sum<n||sum==n){
            int num=0;
            p(num);
        }
        
    }
}