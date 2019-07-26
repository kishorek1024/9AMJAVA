package packfive;

class P {
	public void lands(){
		System.out.println("Lands");
	}
}
class Child1 extends P {
	public void buildings(){
		System.out.println("Buildings");
	}
}

public class Child2 extends P{
	public void shares(){
		System.out.println("Shares");
	}
	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.lands();c1.buildings();
		
		Child2 c11=new Child2();
		
	}

}
