package packfive;

class Sample1 {
	public void m1(){
		System.out.println("Method1");
	}
}

public class C extends Sample1{
	public void m2(){
		System.out.println("Method2");
	}
	
	public static void main(String[] args) {
		
		Sample1 s=new C();
		s.m1();
		
	}

}
