package packfive;

public class Enca {
	
	String name;
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18 || age>60)
			throw new RuntimeException("Age should be inbetween 18-60");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()<4 || name.length()>10)
			throw new RuntimeException("Name should accept only 4-10 characters");
	}

}
