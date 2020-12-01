import java.util.Scanner;


//https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#String(byte[],%20java.nio.charset.Charset)

//https://www.w3schools.com/java/java_ref_string.asp

/*
charAt
length
format
concat
contains
indexOf
toUppercase
toLowercase
substring
repeat
equals
getBytes
hashCode
replace
getChars
toCharArray
split
copyValueOf

*/

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

//getBytes : Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
System.out.println(h.getBytes());

//hashcode
/*

Returns a hash code for this string. The hash code for a String object is computed as
 s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
 
using int arithmetic, where s[i] is the ith character of the string, n is the length of the string, and ^ indicates exponentiation. (The hash value of the empty string is zero.)

*/
System.out.println(h.hashCode());


//replace
String rep="hello world";
String rep2=rep.replace("world", "java");
System.out.println(rep2);



//convert string to character array
String gstr="hello";
char[] array = new char[gstr.length()];
gstr.getChars(0, gstr.length()-1, array,0);

for(char ch:array){
    System.out.println(ch);
}

//or

char[] array2=gstr.toCharArray();
for(char ch2:array2){
    System.out.println(ch2);
}


//split string based on space between words
String sp="hello world";
String[] arr=sp.split(" ");
for(String ar:arr)
    System.out.println(ar);



//copyValueOf()
char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
String myStr2 = "";
myStr2 = String.copyValueOf(myStr1, 0, 5);
System.out.println("Returned String: " + myStr2);

}

}
