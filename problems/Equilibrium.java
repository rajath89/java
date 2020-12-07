import java.util.Scanner;

public class Equilibrium {
    public static void p(Object s){
        System.out.println(s);
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int mat[][]=new int[n][3];

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                int num=sc.nextInt();
                mat[i][j]=num;
            }
        }

        int sum=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                sum=sum+mat[i][j];
            }
        }

        if(sum==0){
            p("YES");

        }
        else{
            p("NO");
        }

        p(sum);
    }
}