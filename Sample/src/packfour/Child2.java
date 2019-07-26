package packfour;

class Parent {
	public void shares(){
		System.out.println("Shares");
	}
}

class C1 extends Parent {
	public void lands(){
		System.out.println("Lands");
	}
}

public class Child2 extends Parent{
	public void buildings(){
		System.out.println("Buildings");
	}
	public static void main(String[] args) {
		Child2 c2=new Child2();
		c2.shares();c2.buildings();
		
		
	}

}
