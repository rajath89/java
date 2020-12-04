

/*
StringBuffer represents growable and writeable character sequences. StringBuffer may have
characters and substrings inserted in the middle or appended to the end. StringBuffer will
automatically grow to make room for such additions and often has more characters preallocated
than are actually needed, to allow room for growth
*/

//https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html

public class J09StringBuffer{

    public static void p(Object s){
    System.out.println(s);
}

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        //capacity()
        p(sb.capacity());

        //insert()
        sb.insert(5, " world ");


        //delete() and deleteCharAt()
        sb.delete(4, 7); //delete(start,end)
        p("After delete: " + sb);
        sb.deleteCharAt(0);
        p("After deleteCharAt: " + sb);

        //reverse()
        sb.reverse();

        //toString
        String str=sb.toString();
        p(str);
    }
}