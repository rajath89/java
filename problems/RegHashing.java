import java.util.Scanner;
import java.util.HashMap;

public class RegHashing {
    public static void p(Object s){
        System.out.println(s);
    }
 
    
    public static void main(String[] args){
	HashMap<String, String> hsh = new HashMap<String, String>();
	HashMap<String, Integer> ch = new HashMap<String, Integer>();
    Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();
	sc.nextLine();


	String[] str=new String[n];

	for(int j=0;j<n;j++){
		str[j]=sc.nextLine();
	}

	for(int i=0;i<n;i++){
	
	
	if(hsh.get(str[i])==null){
	hsh.put(str[i],"OK");
	ch.put(str[i],0);
	p("OK");
}else{

	int num=ch.get(str[i]);
	num=num+1;
	hsh.put(str[i].concat(Integer.toString(num)),"OK" );
	ch.put(str[i],1);
	p(str[i].concat(Integer.toString(num)));
	}
}

 }
}
