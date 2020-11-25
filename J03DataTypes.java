import java.util.Scanner;

public class J03DataTypes{


public static final double PI=3.14; //declaring global const

public static void main(String args[]){

int x=5; //primitive dataType (32bits or 4 byte)
Integer y=5; //object autoboxing dataTYpe


final int z=10; //declaring constant

boolean t=true;
byte b='B';
char g='A';

float f=20.6f; //32 bit
double d=20.8;//64 bit

Scanner scanner=new Scanner(System.in);
int cast= (int) scanner.nextDouble(); //type casting
System.out.println(cast);

System.out.println(Integer.MAX_VALUE);

System.out.println(Integer.max(10,20));
System.out.println(Integer.compare(10,20));; //.compare(x,y)  -1->x<y,1->x>y,0->x==y


//convert string to int
String str="100";
int a = Integer.parseInt(str);
System.out.println(a);


}

}
