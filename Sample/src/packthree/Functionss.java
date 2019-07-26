package packthree;

public class Functionss {

	public static void main(String[] args) {
		
		String a="Kishore Kumar Selenium java FastTrack 11AM";
		String[] b=a.split(" ");
		
		int i;
		for(i=0; i<b.length; i++){
			//System.out.println(b[i]);
			if(b[i].startsWith("K")==true)
				System.out.println(b[i]);
		}
		
		
		
		
		/*String a="kishore";
		System.out.println(a.indexOf("h"));
		System.out.println(a.charAt(3));*/
		
		
		
		/*String a="   Kis  hore   Kum  ar   ";
		String b="abcklcsisccdfgckclckdcsd";
		
		System.out.println(a.replace(" ", ""));
		
		System.out.println(b.replace("c", "x"));
		
		System.out.println(b.replaceFirst("c", "x"));
		//System.out.println(a.trim());
		*/
		
		
		
		/*String a="kishore kumar";
		String b="KISHORE KUMAR";
		
		System.out.println(a.equals(b));
		if(a.equals(b)==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		if(a.equalsIgnoreCase(b)==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		System.out.println(a.concat(b));
		System.out.println(a+b);
		
		System.out.println(a.contains("k") || a.contains("y"));*/
		
		
		/*System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());*/
		/*System.out.println(a.startsWith("X"));
		if(a.startsWith("x")==true)
			System.out.println("Pass");
		else
			System.out.println("fail");
		if(a.endsWith("r")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(a.length());
		
		/*if(a.length()==10)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		if(a.length()!=15)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		if(a.length()>3 && a.length()<11)
			System.out.println("Pass");
		else
			System.out.println("Fail");*/
		

	}

}
