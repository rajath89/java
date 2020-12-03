import java.util.Arrays;

class JumpSearch{

    public static void p(Object s){
    System.out.println(s);
}

public static int jumpSearch(int[] arr, int x) { 
        int n = arr.length; 

        int step = (int)Math.floor(Math.sqrt(n));
        p("step"+step);
        int step2=step; 

        //int cn=0;
        int prev = 0; 
        while (arr[step-1] < x) 
        { 
            prev = step; 
            step += step2;
            //cn+=1; 
            if (prev >= n) 
                return -1; 
        } 

       // p("the number of jumps"+cn);
  
        //linear search
        while (arr[prev] < x) 
        { 
            prev++; 
            if (prev == step) 
                return -1; 
        } 
  
        
        if (arr[prev] == x) 
            return prev; 
  
        return -1; 
    } 

    public static void main(String args[]) {
        int[] arr=new int[86];
        for(int i=0;i<arr.length; i++) {
            arr[i]=i*i;
        }

        int js=jumpSearch(arr, (54*54));
        p(js);
}

}
