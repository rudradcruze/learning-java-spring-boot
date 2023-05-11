package ac.dia.cf;

public class Exam implements Comparable<Exam> {
	
	private int id;
	private String name;
	private int marks;
	
	public Exam(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", marks=" + marks + "\n";
	}
	
	@Override
	public int compareTo(Exam o) {
		return id-o.id;
	}
}
