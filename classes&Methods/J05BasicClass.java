import java.util.Scanner;


public class J05BasicClass {

public static void main(String args[]){

        User user=new User();
        user.name="java";
        System.out.println(user.name);

        String rep=user.repeatStr(50);
        System.out.println(rep);


}

}
