package packfive;

interface Software {
	public void startdate();
	public void enddate();
	public void t1();
}
class School1 implements Software {
	public void startdate(){System.out.println("June25");}
	public void enddate() {System.out.println("Apr20");}
	public void t1() { System.out.println("130000");}
}

public class School2 implements Software{
	public void startdate(){System.out.println("June15");}
	public void enddate() {System.out.println("Apr24");}
	public void t1() { System.out.println("140000");}
	
	public static void main(String[] args) {
		
		School1 s1=new School1();
		Software s=s1;
		
		Software ss=new School1();
		ss.startdate();ss.enddate();ss.t1();
		
		ss=new School2();
		ss.startdate();ss.enddate();ss.t1();
		
		
		
	}

}
