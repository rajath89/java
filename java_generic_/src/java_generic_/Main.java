package java_generic_;

import java.util.Arrays;
import java.util.HashSet;



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
    
    
    public static String removeDuplicatesandSpaces2(String str){
    	String[] arr=str.split(" ");
    	String fin="";
    	for(String out:arr) {
    		fin=fin.concat(out);
    	}
    	String g="";
    	HashSet<Character> hs=new HashSet<Character>();
    	for(char c:fin.toCharArray()) {
    		if(hs.add(c)==false) {
    			continue;
    		}
    		else {
    			g=g.concat(Character.toString(c));
    		}
    	}
    	return g;
    
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
    
    public static int[] selSort(int[] arr) {
        int n = arr.length;
        
        // One by one move boundary of unsorted subarray;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
  
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        
        return arr;
    }
    
    
	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];
		int[] n=new int[Math.abs(num2-num1)];
		int ind=0;
		

	if(num1<num2){
	    int diff=num2-num1;
	    for(int i=0;i<diff;i++){
	       if(i==0) 
	    	   n[i]=num1+1;
	       else {
	    	   n[i]=n[i-1]+1;
	       }
	    }
	    
	    for(int h:n){
	        int sum=0;
	        int ref=h;
	        while(h>0){
	            sum+=(h%10);
	            h/=10;
	        }
	        if(sum%3==0&&ref%5==0){
	            
	        	if(ind==6) {
	        		break;
	        	}
	        	numbers[ind]=ref;
	            
	            //System.out.println(ref);
	            ind++;
	        }
	    }

}

		return numbers;
	}
    
	
	public static void main(String[] args) {
		
		
	      int a = 60;          int b = -60;        int c = 0;
	      System.out.println("60  = " + Integer.toBinaryString(a));
	      System.out.println("-60 = " + Integer.toBinaryString(b));

	      //signed shift
	      c = a >> 1;              
	      System.out.println("60 >> 1  = " + Integer.toBinaryString(c));

	      //unsigned shift
	      c = a >>> 1;            
	      System.out.println("60 >>> 1 = " + Integer.toBinaryString(c) );

	      c = b >> 1;              
	      System.out.println("-60 >> 1  = " + Integer.toBinaryString(c) );

	      c = b >>> 1;            
	      System.out.println("-60 >>> 1 = " + Integer.toBinaryString(c));
	      
	      
			Employee employee = new Employee();
			employee.setEmployeeId("C101");
			employee.setEmployeeName("Steve");
			employee.setSalary(650);
			employee.jobLevel = 4;

			employee.calculateSalary();

			System.out.println("Employee Details");
			System.out.println("Employee Id: " + employee.getEmployeeId());
			System.out.println("Employee Name: " + employee.getEmployeeName());
			System.out.println("Salary: " + employee.getSalary());
			
		
		//boolean number=arNum(1635);
//		String s=moveSpecialCharacters("hE@#$LLO!*&");
//		System.out.println(s);
//		System.out.println(checkPalindrome("radar"));
//		String h=reverseEachWord("Sun rises in the east");
//		Main.findHighestOccurrence("success");
//		String strw=Main.removeDuplicatesandSpaces("object oriented programming");
//		String strw2=Main.removeDuplicatesandSpaces2("object oriented programming");
//		int[] leap=Main.findLeapYears(2000);
//		System.out.println(Arrays.toString(leap));
//		int[] i={1,1,5,100,-20,6,0,0};
//		int[] u=Main.selSort(i);
//		System.out.println(Arrays.toString(u));
//		System.out.println("remDupAndSpace2"+" "+strw2);
		
//		Teacher t1=new Teacher("Alex1","Java Fundamental1s",1200L);
//		Teacher t2=new Teacher("John","RDBMS",800L);
//		Teacher t3=new Teacher("Sam","Networkin",900L);
//		Teacher t4=new Teacher("Maria","Python",900L);
//		Teacher[] tarr= {t1,t2,t3,t4};
//		for(Teacher t:tarr) {
//			System.out.println("Name : "+t.getTeacherName()+","+" "+"Subject : "+t.getSubject()+","+" "+"Salary : "+t.getSalary());
//		}
		
//		int[] marks = { 79, 87, 97, 65, 78, 99, 66 }; 
//		Student student = new Student(marks);
//		student.findGrade();
//        System.out.println("Grades corresponding to the marks are : ");
//		char[] grades = student.getGrade();
//		for (int index = 0; index < grades.length; index++) {
//			System.out.print(grades[index] + " ");
//		}
//		
//		int[] mul=findNumbers(-10,29);
//		System.out.println(Arrays.toString(mul));
		
        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");
        
        //Create more objects and add them to the bills array for testing your code
              
        Bill[] bills = { bill1, bill2 };
              
        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
       }
        
        Author author1=new Author("Joshua Bloch","joshua@email.com",'M');
    	Book book1=new Book("Effective Java",author1,45,15);
    	book1.displayAuthorDetails();
	}
		
}


