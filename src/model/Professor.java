package model;

public class Professor {
	private long id;
	private String name;
	private String surname;
	private Degree degree;
	// Helper
	private static long counter=0;
	//getter
	public long getId(){
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public Degree getDegree(){
		return degree;
	}
	//Setter
	public void setId() {
		id = counter;
		counter++;
	}
	public void setName(String inputName) {
		if((inputName != null)&&(!inputName.isEmpty()) && (inputName.matches("[A-Z]{1}[a-z]{15}[ ]{1}[A-Z]{1}[a-z]{15}"))) {
		name = inputName;
	}else {
		name= "Unkwon";
		}
	}
	
	public void setsurname(String inputSurname) {
		if((inputSurname != null)&&(!inputSurname.isEmpty()) && (inputSurname.matches("[A-Z]{1}[a-z]{15}[ ]{1}[A-Z]{1}[a-z]{15}"))) {
			surname = inputSurname;
		}else {
			surname= "Unkwon";
			}
	}
	public void setDegree(Degree inputDegree) {
		if (inputDegree != null) {
			degree = inputDegree;
		}else {
			degree = Degree.unkwon;
			}
	}
	//no arg 
}
