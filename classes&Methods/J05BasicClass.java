import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class J05BasicClass {

public static void main(String args[]){

        PrintStream p = System.out;

        User user=new User();
        user.name="java";
        System.out.println(user.name);

        String rep=user.repeatStr(50);
        System.out.println(rep);

        User user2=new User();
        user2.setAge(10);

        p.println(user2.getAge());



        //custom arraylist type
        List<User> numOfUsers=new ArrayList<User>();
        numOfUsers.add(user);
        numOfUsers.add(user2);

        //invoking static User method
        User.statMethod(user2);



}

}
