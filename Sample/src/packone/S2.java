package packone;

interface Software {
	public abstract void startdate();
	public void enddate();
	public void t1();}

class S1 implements Software {
	public void startdate(){System.out.println("June15");}
	public void enddate(){System.out.println("Apr24");}
	public void t1(){System.out.println(90000);	}}

public class S2 implements Software{
	public void startdate(){System.out.println("June24");}
	public void enddate(){System.out.println("Apr30");}
	public void t1(){System.out.println(100000);	}	
	
	public static void main(String[] args) {
		
		S1 s1=new S1();
		Software s=s1;
		
		Software ss;
		ss=new S1();
		ss.startdate();ss.enddate();ss.t1();		
		ss=new S2();
		ss.startdate();ss.enddate();ss.t1();
				
		
		 
		
	}

}
