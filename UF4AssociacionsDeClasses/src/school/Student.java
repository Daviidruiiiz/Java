package school;

public class Student {
	private String cycle;
	private int course;
	
	public Student() {
		super();
		this.course = 1;
		this.cycle = "DAW";
	}
	public String getCycle() {
		return cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
}
