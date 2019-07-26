package packone;

public class Enca {
	
	int age;

	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()<4 || name.length()>10)
			throw new RuntimeException("Name should be 4-10");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18 || age>60)
			throw new RuntimeException("Age Should be in between 18-60");
	}
	

}
