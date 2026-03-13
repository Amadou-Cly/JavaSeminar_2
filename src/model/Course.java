package model;

public class Course {
	private long id;
	private String title;
	private int creditPoint;
	private Professor professor;
	
	private static long coursecounter = 1000;
		
	
	//Getters
	public long getId(){
		return id;
	}
	public String gettitle(){
		return title;
	}
	public int getCreditPoint() {
		return creditPoint;
	}
	public Professor getProfessor() {
		return professor;
	}
		//Setters
	
	public void setId() {
		id= coursecounter;
		coursecounter++;
	}
	public void setTitle(String inpuTitle) {
		if((inpuTitle != null)&&(!inpuTitle.isEmpty()) && (inpuTitle.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			title = inpuTitle;
		}else {
			title= "Unkwon";
			}
	}
	public void setCreditPoint(int inputCreditPoint) {
		if((inputCreditPoint > 0)&&(inputCreditPoint <= 10)) {
			creditPoint = inputCreditPoint;
		}else {
			creditPoint = 1;
			}
	}
	public void setProfessor(Professor inputProfessor) {
		if(inputProfessor!= null) {
		professor = inputProfessor;
	}else {
		professor = new Professor();
		}
	}
	// no arg constractor
	
	public Course() {
		setId();
		setTitle("Java Programming");
		setCreditPoint(6);
		setProfessor(new Professor());
	}
	// arg cons
	
	public Course(String inputTitle, int inputCreditPoint, Professor inputProfessor) {
		setId();
		setTitle(inputTitle);
		setCreditPoint(inputCreditPoint);
		setProfessor(inputProfessor);
	}
	//to string
	public String toString() {
		String result = id + ": "+ title + " ("+ creditPoint + ")," + professor.getName().charAt(0) + "." + professor.getSurname();
		return result;
	}
	
}
