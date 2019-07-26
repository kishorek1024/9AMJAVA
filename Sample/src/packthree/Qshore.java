package packthree;

abstract class FirstRelease {
	public void CR(){
		System.out.println("ClassRoom");
	}
	public abstract void Online();
	public abstract void Corporate();
}
abstract class Secondrelease extends FirstRelease {
	public void Online(){
		System.out.println("Online");
	}	
}
public class Qshore extends Secondrelease {
	public void Corporate(){
		System.out.println("Corporate");
	}
	public static void main(String[] args) {
		Qshore q=new Qshore();
		q.CR();q.Online();q.Corporate();
	}

}
