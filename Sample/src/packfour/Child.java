package packfour;

class GrandParents {
	public void lands(){
		System.out.println("Lands");
	}
}
class Parents extends GrandParents {
	public void gold(){
		System.out.println("Gold");
	}
}
public class Child extends Parents{
	public void buildings(){
		System.out.println("Buildings");
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.lands();c.buildings();c.gold();
	}

}
