
import java.util.Scanner;

//Problem - 282A
public class BitPP {
    public static void p(Object s){
        System.out.println(s);
    }
    public static void main(String[] args){

        
        Scanner sc=new Scanner(System.in);
        

        int n=sc.nextInt();
        
        String[] str=new String[n];

        //consuming the <enter> from input above  
        sc.nextLine();
        
        for (int i = 0; i < str.length; i++){
            str[i]=sc.nextLine();
            
        }

        int gc=0;
        int ic=0;
        int dc=0;

        for(String h:str){
            char[] ch=h.toCharArray();
            for(char c:ch){
                if(c=='+'){
                    
                    ic=ic+1;
                }
                    

                else if(c=='-'){
                    
                    dc=dc+1;
                    }
            }

            if(ic==2){
                gc=gc+1;
            }else if(dc==2){
                gc=gc-1;
            }
            
            
            ic=0;
            dc=0;
        }
        p(gc);
        
    }
}