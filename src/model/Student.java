package model;

import java.security.PublicKey;

public class Student {
	private String matriculaNumber;
	private String name;
	private String surname;
	private String faculty;
	private int birthYear;
	private String passportNumber;
	
	//2. getters
	
	public String getMatricularNumber() {
		return matriculaNumber;
	}
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return  surname;
	}
	public String getFaculty() {
		return faculty;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	//Setters 
	
	public void setMatricularNUmber()
	
	public void setName(String inputName) {
		if((inputName != null)&&(!inputName.isEmpty()) && (inputName.matches("[A-Z]{1}[a-z]{15}[ ]{1}[A-Z]{1}[a-z]{15}"))) {
		name = inputName;
	}else {
		name= "Unkwon";
	}
	
	public void 
	
}
