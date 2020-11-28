
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html


class p{
    
    public static <T> void pl (T obj){
        System.out.println(obj);
    }
    //work for all objects
    public static void out(Object o){
        System.out.println(o.toString());
    }
    // Only accepts strings
    public static void print(String s) {
        System.out.println(s);
    }
}




public class J07ArrayList {

public static void main(String args[]){

//import java.util.ArrayList;
//import java.util.List;

List<Integer> lst=new ArrayList<Integer>();

lst.add(5);
lst.add(1,78);//add(index,val)

System.out.println(lst.get(1));

//indexOf()
System.out.println(lst.indexOf(78));

//contains() -> ret boolean
//isEmpty()  -> ret boolean


System.out.println(lst.contains(78));

//clear()
lst.clear();

//convert Arrays to list
List<Integer> arrList =Arrays.asList(10,20,30);

//hashcode()
System.out.println(arrList.hashCode());



//toArray() -> converts list to array
System.out.println(Arrays.toString(arrList.toArray()));

//size()
System.out.println(arrList.size());

p.pl("dd");



//for-each loop
for(int d:arrList){
    p.pl(d);
}

//2d arrayLIst
List<List<Integer>> tlist=new ArrayList<List<Integer>>();
tlist.add(Arrays.asList(2,3,4));
tlist.add(Arrays.asList(2,6,4));
tlist.add(Arrays.asList(2,9,4));

for(List<Integer> lst1 : tlist){
    for(int lst2:lst1){
        p.pl(lst2);
    }
}


//sort Arraylist
List<Integer> srt=new ArrayList<Integer>();
srt.add(5);
srt.add(7);
srt.add(1);
//import java.util.Collections;
Collections.sort(srt);
//Collections.reverse()
p.pl(srt.toString());




}

}
