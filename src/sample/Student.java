package sample;



public class Student extends Human {
	private String group;
	private String faculty;
	private long id;
	
	public Student(String name, String lastName, HumanSex sex, int age, String group, String faculty, long id) {
		super(name, lastName, sex, age);
		this.group = group;
		this.faculty = faculty;
		this.id = id;
	}

	public Student() {
		super();
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Override
	public void inform() {
		System.out.println(toString());
	}
	

	@Override
	public String toString() {
		return "Student [group=" + group + ", faculty=" + faculty + ", id=" + id + ", Name " + getName()
				+ ", LastName " + getLastName() + ", Sex " + getSex() + ", Age " + getAge() + "]";
	}
	
	
}
