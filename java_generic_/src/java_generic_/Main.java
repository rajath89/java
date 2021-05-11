package java_generic_;

import java.util.Arrays;

public class Main {

	
	public static boolean arNum(int n) {
		String s=Integer.toString(n);
		
		int l=s.length();
		int sum=0;
		
		while(n>0) {
			int dig=(n%10);
			sum+=Math.pow(dig, s.length());
			
			n/=10;
		}
		System.out.println(sum);
		if(Integer.compare(sum, n)==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
    public static String moveSpecialCharacters(String str){
    	char[] arr=str.toCharArray();
    	String nw="";
    	String nw2="";
    	for(char t:arr) {
    		if(Character.isAlphabetic(t)) {
    			nw=nw.concat(Character.toString(t));
    		}else {
    			nw2=nw2.concat(Character.toString(t));
    		}
    	}
    	
    	String nw3=nw.concat(nw2);
    	return nw3;
	}
    
    public static boolean checkPalindrome(String str){
    	StringBuffer sb=new StringBuffer(str);
    	if((sb.reverse().toString()).equals(str)) {
    		return true;
    	}else {
    		return false;
    	}
	}
    
    public static String reverseEachWord(String str){
    	String rev="";
    	char[] arr=str.toCharArray();
    	for(int i=arr.length-1;i>=0;i--) {
    		rev=rev.concat(Character.toString(arr[i]));
    	}
    	String[] test=rev.split(" ");
    	String rev2="";
    	for(int i=test.length-1;i>=0;i--) {
    	    if(i==0){
    	        rev2=rev2.concat(test[i]);
    	    }else{
    	        rev2=rev2.concat(test[i]+" ");
    	    }
    	 }
    	return rev2;
    	
	}
    
	public static void findHighestOccurrence(String str){
		char[] array=str.toCharArray();
		   int count=0;
		   int reg=0;
		   int[] carr=new int[array.length];

		   char ch;
		    for(int i=0;i<array.length-1;i++)
		    {
		        ch=array[i];
		        count=1;
		        if(ch!='#'){

		            for(int j=i+1;j<array.length;j++)
		            {
		                if(ch==array[j]){
		                    count++;
		                    array[j]='#';
		                }

		            }
		            if(count>1)
		            {
		                carr[reg]=count;
		                reg++;
		            }
		        }


		    }
		    
		    //find max in an array
		    
		    int i;
	         int max = carr[0]; 
	         for (i = 1; i < carr.length; i++)
	             if (carr[i] > max)
	                 max = carr[i];
	        
	         
		    
		    System.out.println(max);
		
		
	}
	
	
    public static String removeDuplicatesandSpaces(String str){
    	String[] arr=str.split(" ");
    	String fin="";
    	for(String out:arr) {
    		fin=fin.concat(out);
    	}
    	
    	char[] arr1=fin.toCharArray();
     	
    	for(int i=0;i<arr1.length-1;i++) {
    		for(int j=i+1;j<arr1.length;j++) {
    			if(Character.compare(arr1[i],arr1[j])==0) {
    				arr1[j]='#';
    			}
    		}
    	}
    	
    	String finStr="";
    	for(char ch:arr1) {
    		if(ch=='#') {
    			continue;
    		}else {
    			finStr=finStr.concat(Character.toString(ch));
    		}
    	}
    	
    	return finStr;
	}
    
    
    public static double[] findDetails(double[] salary) {
        //Implement your code here and change the return value accordingly
       double avg=0;
       int sum=0;
       int l=salary.length;
       for(double a:salary) {
    	   sum+=a;
       }
       
       avg=sum/l;
       double gs=0;
       double ls=0;
       for(double a:salary) {
    	   if(a>avg) {
    		   gs++;
    	   }else {
    		   ls++;
    	   }
       }
       
       double[] finArr= {avg,gs,ls};
       return finArr;

    }
    
    public static int[] findLeapYears(int year){
    	
    	
    	int[] arr=new int[15];
    	int c=0;
    	boolean flag=false;
    	while(true) {
    		
        	if(year % 400 == 0)
        	{
        	flag = true;
        	}
        	else if (year % 100 == 0)
        	{
        	flag = false;
        	}
        	else if(year % 4 == 0)
        	{
        	flag = true;
        	}
        	else
        	{
        	flag = false;
        	}
        	if(flag)
        	{
        	//System.out.println("Year "+year+" is a Leap Year");
        	arr[c]=year;
        	
        	c++;
        	}
        	year++;
        	flag=false;
        	if(c==15) {
        		break;
        	}

    	}
    	
    	return arr;

    }
	
	public static void main(String[] args) {
		
		//boolean number=arNum(1635);
		String s=moveSpecialCharacters("hE@#$LLO!*&");
		System.out.println(s);
		System.out.println(checkPalindrome("radar"));
		String h=reverseEachWord("Sun rises in the east");
		Main.findHighestOccurrence("success");
		String strw=Main.removeDuplicatesandSpaces("object oriented programming");
		int[] leap=Main.findLeapYears(2000);
		System.out.println(Arrays.toString(leap));
	}

}
