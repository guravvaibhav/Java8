package predicate;

public class Employee {
	private String name;
	private int sallary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int sallary) {
		super();
		this.name = name;
		this.sallary = sallary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSallary() {
		return sallary;
	}

	public void setSallary(int sallary) {
		this.sallary = sallary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", sallary=" + sallary + "]";
	}

}
