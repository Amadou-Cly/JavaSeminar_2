package model;

import java.security.PublicKey;

public class Student {
	private String matriculaNumber;
	private String name;
	private String surname;
	private String faculty;
	private int birthYear;
	private String passportNumber;
	private String country; 
	
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
	public String getCountry() {
		return country;
	}
	//Setters 
	
	public void setMatricularNUmber(String inputMatricularNumber) {
		if((inputMatricularNumber != null)&&(!inputMatricularNumber.isEmpty()) && (inputMatricularNumber.matches("[A-Z]{2}[0-9]{6}"))) {
	
		matriculaNumber = inputMatricularNumber;
		}
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
	public void setFaculty(String inputFaculty) {
		if((inputFaculty != null)&&(!inputFaculty.isEmpty()) && (inputFaculty.matches("[A-Z]{2,30}"))) {
			faculty = inputFaculty;
		}else {
			faculty= "Unkwon";
			}
	}
	public void setBirthYear(int inputBirthYear) {
		if((inputBirthYear >= 1950) && (inputBirthYear <= 2020)) {
			birthYear = inputBirthYear;
		}else {
			inputBirthYear = 2008;
			}
	}
	public void setPassportNumber(String inputPassportNumber){
		if((inputPassportNumber != null) && (!inputPassportNumber.isEmpty()) && (inputPassportNumber.matches("[A-Z]{2}[0-9]{7}"))) {
			passportNumber = inputPassportNumber;
		}else {
			passportNumber= "Unkwon";
			}
	}
	public void setCountry(String inputCountry) {
		if((inputCountry != null) && (!inputCountry.isEmpty()) && (inputCountry.matches("[A-Z]{1}[a-z]{2,15}"))){
			country =  inputCountry; 
		}else {
			country= "Unkwon";}
		}
	// no arg constractor 
	public Student() {
		setMatricularNUmber("AB123456");
		setName("Amadou");
		setsurname("Coulibaly");
		setFaculty("IT");
		setBirthYear(2000);
		setPassportNumber("AA1450876");
		setCountry("Mali");
	} 
	// arg constractor
	public Student( String inputMatricularNUmber, String inputName, String inputSurname, String inputFaculty, int inputBirthYear, String inputPassportNumber, String inputCountry) {
		setMatricularNUmber(inputMatricularNUmber);
		setName(inputName);
		setsurname(inputSurname);
		setCountry(inputCountry);
		setBirthYear(inputBirthYear);
		setPassportNumber(inputPassportNumber);
		setCountry(inputCountry);
	}
public String toString() {
		
		//Aref Hosseini (AB123456) ITF, 2006 [Spain], SP092345
		String result = name + " " + surname 
				+ " (" + matriculaNumber + ") " + faculty
				+ ", " + birthYear + " [" + country + "], "
				+ passportNumber;
		return result;
	}
}
		
	
	

	
