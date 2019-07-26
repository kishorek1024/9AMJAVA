package packone;

interface Software1 {
	public abstract void startdate();
	public void enddate();
	public void t1();}
class School1 implements Software1 {
	public void startdate(){System.out.println("June15");}
	public void enddate(){System.out.println("Apr24");}
	public void t1(){System.out.println("100000");}}

public class School2 implements Software1{
	public void startdate(){System.out.println("June25");}
	public void enddate(){System.out.println("Apr30");}
	public void t1(){System.out.println("150000");}

	public static void main(String[] args) {		
		
		Software1 s2;
		s2=new School1();
		s2.startdate();s2.enddate();s2.t1();
		
		s2=new School2();
		s2.startdate();s2.enddate();s2.t1();
	}
		
}


