package section1;

public class student {
	public student(String name, String lastname, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}
	private String name;
	private String lastname;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void printmyage() {
		System.out.println("my age is" + this.age);
	}
	public boolean isgreaterthenme (int age) {
		if (this.age> age)
			return true;
		else 
			return false;
	}
	
}
