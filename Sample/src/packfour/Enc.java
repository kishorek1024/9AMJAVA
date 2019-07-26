package packfour;

public class Enc {
	
	int age;
	String name;
    int number;
	private int getNumber() {
		return number;
	}

	private void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		if(name.length()<4 || name.length()>10)
			throw new RuntimeException("Name should be in between 4-10");
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18 || age>120)
			throw new RuntimeException("Age should be in between 18-120");
		else
		System.out.println(age);
	}

}
