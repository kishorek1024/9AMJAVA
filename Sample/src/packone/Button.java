package packone;

public class Button {
	
	// Creating Variables
	int a; int b; String c;
	
	// Creating Constructor
	public Button(int height, int width, String name){
		a=height; b=width; c=name;
	}
	// Creating Methods
	public void buttonCreate(){
		System.out.println("Button " + c + " Created Successfully with Height and Width as " + a + "-" + b);
	}
	public void buttonclickable(){
		System.out.println("Button " + c + " is Clickable");
	}
	public void buttonDoubleclickable(){
		System.out.println("Button " + c + " is Double Clickable");
	}
	public void buttonRightclickable(){
		System.out.println("Button " + c + " is Right Clickable");
	}
	public static void main(String[] args) {
		
		Button ok=new Button(70, 80, "OK");
		ok.buttonCreate();ok.buttonclickable();ok.buttonDoubleclickable();ok.buttonRightclickable();
		
		Button cancel=new Button(70, 40, "Cancel");
		cancel.buttonCreate();cancel.buttonclickable();
		
	}
	

}
