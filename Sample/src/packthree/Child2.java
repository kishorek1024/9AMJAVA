package packthree;

class P {
	public void gold(){
		System.out.println("Gold");
	}
}

class Child1 extends P {
	public void shares(){
		System.out.println("Shares");
	}
}

public class Child2 extends P {
	public void lands(){
		System.out.println("Lands");
	}
	public static void main(String[] args) {
		Child2 c2=new Child2();
		c2.lands();c2.gold();
		
		Child1 c1=new Child1();
		c1.gold();c1.shares();
		
		String a="abcd";
		
	}

}
