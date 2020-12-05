//https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html

//https://www.javatpoint.com/post/java-character#:~:text=The%20Character%20class%20generally%20wraps,field%20whose%20type%20is%20char.&text=The%20Java%20language%20generally%20uses,in%20String%20or%20String%20Buffer.


public class J10CharacterClass{

    public static void p(Object s){
        System.out.println(s);
    }
    public static void main(String[] args){
        char a='A';
        char b='B';
        char c='3';

        //compare(x,y) -> the value 0 if x == y; a value less than 0 if x < y; and a value greater than 0 if x > y
        p(Character.compare(a, b));

        //hashCode() -> Returns a hash code for this Character; equal to the result of invoking charValue()
        p(Character.hashCode(a));

        //isAlhabetic()
        p(Character.isAlphabetic(c));

        //isDigit()
        p(Character.isDigit(a));

        //isSpaceChar()
        char sp=' ';
        p(Character.isSpaceChar(sp));

        //toLowerCase()
        //toUpperCase()
        //isLowerCase() -> ret boolean
        //isUpperCase() -> ret boolean

    }
}