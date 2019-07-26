package packthree;

class GP {
	public void gold(){
		System.out.println("Gold");
	}
}

class Parents extends GP{
	public void lands(){
		System.out.println("Lands");
	}
}

public class Child extends Parents {
	public void buildings(){
		System.out.println("Buildings");
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.buildings();c.lands(); c.gold();
	}

}
