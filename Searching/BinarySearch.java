import java.util.Arrays;

class BinarySearch{

    public static void p(Object s)
{
    System.out.println(s);
}

//recursive binS
public static int binSearch(int arr[], int l, int r, int x) 
{ 
    if (r >= l) { 
        int mid = l + (r - l) / 2; 
        if (arr[mid] == x) 
            return mid; 
        if (arr[mid] > x) 
            return binSearch(arr, l, mid - 1, x);  
        return binSearch(arr, mid + 1, r, x); 
    } 

    return -1; 
}

    public static void main(String args[]) {
        int[] arr=new int[10];
        for(int i=0;i<arr.length; i++) {
            arr[i]=i*i;
        }

        int ret=Arrays.binarySearch(arr,49);
        p(ret);

        int retV=binSearch(arr,0,arr.length-1,49);
        p(retV);

        
    }

}