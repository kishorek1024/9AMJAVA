package packfive;

class FirstMonth {
	public void ROI(){
		System.out.println("8.75");
	}
}
class SecondMonth extends FirstMonth {
	public void ROI(){
		System.out.println("8.50");
	}
}
class ThirdMonth extends SecondMonth {
	public void ROI(){
		System.out.println("9.0");
	}
}

public class CurrentMonth extends ThirdMonth{
	public void ROI(){
		System.out.println("8.25");
	}
	
	public static void main(String[] args) {
		CurrentMonth c=new CurrentMonth();
		c.ROI();
		
	}

}
