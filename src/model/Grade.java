package model;

public class Grade {
	private long id;
	private int value;
	private Student student;
	private Course course;

	//helper 
	
	private static long gradeCounter =  10;
	
	// getters
	
	public long getId() {
		return id;
	}
	public int getValue() {
		return value;
	}
	public Student getStudent() {
		return student;
	}
	public Course getCourse() {
		return course;
	}
	//Setter
	public void setId() {
		id = gradeCounter;
		gradeCounter++;
	}
	public void setValue(int inputValue){
		if((inputValue > 0)&&(inputValue <= 100)){
			value = inputValue;
		}else {
			value = 5;
		}
	}
	public void setStudent(Student inputStudent) {
		if(inputStudent != null) {
			student = inputStudent;
		}else {
			student = new Student(); 
		}
	}
	public void setCourse(Course inputCourse) {
		if(inputCourse != null) {
			course = inputCourse;
		}else {
			course = new Course();
		}
	}
	//  no arg constr
	public Grade() {
		setId();
		setValue(100);
		setStudent(new Student());
		setCourse(new Course());
	}
	//arg constr
	public Grade(int inputValue, Student inStudent, Course inputCourse){
		setId();
		setValue(inputValue);
		setStudent(inStudent);
		setCourse(inputCourse);
	}
	// 002: A.Coulibaly 2535 Java 95/100
	public String toString() {
		String result =  id + ": "+ student.getName().charAt(0) +" "+ student.getSurname() +" "+student.getMatricularNumber() + " "+course.gettitle()
				+ " (" + value + "/100) ";
		return result;
	}
}
