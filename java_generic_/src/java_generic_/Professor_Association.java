package java_generic_;

class Cabin {
	public int cabinNumber;

	Cabin(int number) {
		this.cabinNumber = number;
	}
}

public class Professor_Association {
	public String name;
	public Cabin cabin;

	public Professor_Association(String name, Cabin c) {
		this.name = name;
		this.cabin = c;
	}

	public void updateCabin(Cabin c) {
		this.cabin.cabinNumber = c.cabinNumber;
	}

	public static void main(String args[]) {
		Cabin c1 = new Cabin(121);
		Professor_Association p1 = new Professor_Association("Ronald", c1);
		Professor_Association p2 = new Professor_Association("Bonnie", c1);
		Cabin c2 = new Cabin(122);
		p1.updateCabin(c2);
		System.out.println(p1.cabin.cabinNumber); //122
		System.out.println(p2.cabin.cabinNumber); //122
	}

}
