package packone;

public class Functionss {

	public static void main(String[] args) {
		
		String a="Kishore Kumar Selenium Mor 9AM";
		String[] b=a.split(" ");
		
		int i;
		
		for(i=0; i<b.length; i++){
			//System.out.println(b[i]);
			if(b[i].length()==5)
				System.out.println(b[i]);
		}
		
	}

}
