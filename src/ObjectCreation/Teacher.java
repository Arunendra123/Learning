package ObjectCreation;

public class Teacher implements ClassRoom {
	
    private String name;

	private Teacher() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
