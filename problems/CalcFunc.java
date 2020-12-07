import java.util.Scanner;


class CalcFunc{
    public static void p(Object s){
        System.out.println(s);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int g=sc.nextInt();
        int sum=0;

        //bruteforce
        // for(int i=1;i<g+1;i++){
        //     if(i%2==0){
        //         sum=sum+i;
        //     }else{
        //         sum=sum-i;
        //     }
        // }

        //optimized method
        if(g%2==0){
            p(g/2);
        }else{
            int res=(int)g/2;
            res=res+1;
            int negativeVal = (~(res - 1));
            p(negativeVal);
        }

       // p(sum);
                
    }
}