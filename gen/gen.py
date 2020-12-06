import fire

def mkfile(name):
	str="""
public class"""+" "+name+"""{


	public static void p(Object s){
	   System.out.println(s);
	}

	public static void main(String[] args){

	}
}
	"""

	with open(name+".java","w") as p:
		p.write(str)
	return "File created"
def info():
	print("cmd tool to generate java template file")
 

def main():
	fire.Fire()

if __name__ == '__main__':
  main()
