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
		if((inputName != null)&&(!inputName.isEmpty()) && (inputName.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
		name = inputName;
	}else {
		name= "Unkwon";
		}
	}
	
	public void setsurname(String inputSurname) {
		if((inputSurname != null)&&(!inputSurname.isEmpty()) && (inputSurname.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
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
	public  Professor() {
		setId();
		setName("Karina");
		setsurname("Skirmante");
		setDegree(Degree.Dr);
	}
	public Professor(String inputName, String inputSurname, Degree inputDegree) {
		setId();
		setName(inputName);
		setsurname(inputSurname);
		setDegree(inputDegree);
	}
public String toString() {
		
		//Amadou Coulibaly (0) Dr
		String result = name + " " + surname 
				+ " (" + id + " )" + degree;
		return result;
	}
}
