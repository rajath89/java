import java.util.Arrays;
import java.util.Scanner;

//https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html


public class J06Arrays {

public static void main(String args[]){

int[] arr=new int[10];
int[] arr2={10,20,30};

int[][] arr3={{10,20},{30,40},{50,60}};

//print arr
//import java.util.Arrays;
System.out.println(Arrays.toString(arr2));
 
//print 2d arr
System.out.println(Arrays.deepToString(arr3));

//get len
System.out.println(arr.length);

//sort arr
int[] arrSort={78,45,67,89,2};
Arrays.sort(arrSort);
System.out.println(Arrays.toString(arrSort));

//fill()
int[] a=new int[10];
Arrays.fill(a, 10);
System.out.println(Arrays.toString(a));

//hashcode()
/*
     int hashCode = 1;
     for (E e : list)
         hashCode = 31*hashCode + (e==null ? 0 : e.hashCode());

*/
System.out.println(Arrays.hashCode(a));

//deepHashCode()
System.out.println(Arrays.deepHashCode(arr3));


//copyOf()
int[] b=Arrays.copyOf(a,20);
System.out.println(Arrays.toString(a));
System.out.println(b.length); //20
System.out.println(Arrays.toString(b));

//equals()
int[] g1={10,20};
int[] g2={10,20};
boolean g3=Arrays.equals(g1,g2);
System.out.println(g3);








}

}
