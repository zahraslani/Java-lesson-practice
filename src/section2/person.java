package section2;

public abstract class person {
	private String firstname;
	
	abstract String notif();
	
	public person(String firstname) {
		super();
		this.firstname = firstname;
	}

	public void notification() {
		System.out.println("please wake up" + " " + notif());
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
}
