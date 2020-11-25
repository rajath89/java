import java.util.Scanner;

public class J04String{

public static void main(String args[]){

String h="hello world";

System.out.println(h.charAt(0));//charAt(index)

System.out.println(h.length());

String form="string";
System.out.println(String.format("example %s",form));

//concat
System.out.println(h.concat("\n"+form));

//contains
System.out.println(h.contains("h"));

//indexOf
System.out.println(h.indexOf("world"));

//toUpperCase,toLowerCase
System.out.println(h.toUpperCase());
String h1=h.toUpperCase();
System.out.println(h1.toLowerCase());

//substring
System.out.println(h.substring(2,6));//substring(start,end)

//repeat
System.out.println(h.repeat(100));

//equals
System.out.println(h.equals(form));

}

}
