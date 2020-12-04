import java.util.Scanner;

class RetVal{
    int h;
    String ch;

    RetVal(int h,String ch)
    {
        this.h=h;
        this.ch=ch;
    }
}


public class DistinctChar {
    public static void p(Object s){
        System.out.println(s);
    }


    //custom function
    public static RetVal distinctChar(String string1){
        //Converts given string into character array  
        char string[] = string1.toCharArray();
        boolean conf=false;
        String str2="";  
          
        int count;
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  {
                conf=true;
                str2=str2+string[i];

            }  
        }
        
        if(conf){
            RetVal ret=new RetVal(1,str2);
            return ret;
        }
            

        else{
            RetVal ret2=new RetVal(-1, "");
            return ret2;
        }
    }


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

       
        p(distinctChar(str).h+distinctChar(str).ch);
    }
}