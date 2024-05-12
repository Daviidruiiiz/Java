package school;

import java.util.HashSet;

public class Teacher {
	private HashSet<String> subjects;
	
	public Teacher() {
		super();
		this.subjects = new HashSet<String>();
		
	}
	public boolean addSubject(String subject) {
		return this.subjects.add(subject);
	}
	public boolean removeSubject(String subject) {
		return this.subjects.remove(subject);
	}
}
