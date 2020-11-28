

public class User{


        public String name;
        private int age;

        public String repeatStr(int num){
            String h="hello";
            return h.repeat(num);
        }

        //getter
        public int getAge(){
            return age;
        }

        //setter
        public void setAge(int ag){
            age=ag;
        }

        //static method
        public static void statMethod(User u){
            System.out.println(u.getAge());
        }

}
