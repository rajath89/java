import java.util.Scanner;


public class WordCap{
    public static void p(Object s){
        System.out.println(s);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        String str2="";
        char c=str.charAt(0);
        if(Character.isLowerCase(c)){
            char t=Character.toUpperCase(c);
            char[] carr=str.toCharArray();
            str2=str2+t;
            for(int i=0;i<carr.length;i++){
                if(i==0)
                    continue;
                str2=str2+carr[i];
}
        }
        p(str2);
    }
}