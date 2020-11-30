import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;


class Meth{
        public int x;

        //method overloading
        //return type should be same for all overloaded functtions
        public  double func(){
                return Math.random();
        }

        public  double func(int x,int y){
                return Math.pow(x, y);
        }

        @Override
        public String toString(){
                return "from toString override method";
        }
}


public class J08method {

public static void main(String args[]){

        PrintStream p = System.out;
        Meth test=new Meth();
        p.println(test.func());
        p.println(test.func(10, 2));
        p.println(test.toString());

}

}
