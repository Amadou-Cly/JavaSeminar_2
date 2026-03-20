package service;
import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.Degree;
import model.Professor;
import model.Student;
import model.Grade;

public class Main {
	private static ArrayList<Student> studentList = new ArrayList<Student>();
	private static ArrayList<Professor> professorsList = new ArrayList<Professor>();
	private static ArrayList<Course> courseList = new ArrayList<Course>();
	private static ArrayList<Grade> GradeList = new ArrayList<Grade>();
	
	
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
			System.out.println("******STUDENTS*****");
		Student  stud1 = new Student();
		Student  stud2 = new Student("AC125487", "Abdul", "Aziz","ECONOMIE", 2002, "TR4783257", "Latvia");
		Student stud3 = new Student("AS234567", "Burak", "Sen","IT", 2001, "LV1223456", "Latvia");
		studentList.add(stud1);
		studentList.add(stud2);
		System.out.println(studentList);
		
		
		System.out.println("******PROFESSOR*****");
		Professor prof1 = new Professor();
		Professor prof2 = new Professor("John", "Green", Degree.master,"AA1458549");
		Professor prof3 = new Professor("Estere", "Vitola", Degree.Dr,"LV1586235");
		professorsList.add(prof1);
		professorsList.add(prof2);
		professorsList.add(prof3);
		System.out.println(professorsList);
		
		System.out.println("******COURSE*****");
		
		Course course1 = new Course("Java",6,prof2);
		Course course2 = new Course();
		courseList.add(course1);
		courseList.add(course2);
		System.out.println(courseList);
		
		System.out.println("***************GRADE***********");
		
		Grade grade1 = new Grade ();
		Grade grade2 = new Grade (60, stud2,course2);
		GradeList.addAll(Arrays.asList(grade1, grade2));
		
		System.out.println("----------PROFESSORS WITH MASTER DEGREE------");
		filterAllProfessorsWithSpecificDegree(Degree.master);
		System.out.println("----------PROFESSORS WITH PHD DEGREE------");
		filterAllProfessorsWithSpecificDegree(Degree.Dr);
		System.out.println("----------STUDENT BIRTH YEAR >= 2000------");
		try
		{
		ArrayList<Student> result 
		= filterAllStudentsWhichBirtyearIsLargerThan(2000);
		System.out.println(result);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("**********Couses with filtered by professorId***********");
		try {
		ArrayList<Course> result = filterCourseByProfessorId(1);
		System.out.println(result);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		System.out.println("********CRUD FOR PROFESSOR********");
		try {
			createNewProfessor("Karlis", "Immers", Degree.Dr, "LV1586235");
		System.out.println(professorsList);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	
	}
	public static void filterAllProfessorsWithSpecificDegree(Degree degree) {
		//TODO check input param
		//tempP - professor object. In every iteration it is different
		for(Professor tempP : professorsList) {
			if(tempP.getDegree().equals(degree)) {
				System.out.println(tempP);
			}
		}
	}
	//TODO create filtering function for Students which birthyear is 
	//larger than 2005
	public static ArrayList<Student> 
	filterAllStudentsWhichBirtyearIsLargerThan(int inputBirthyearThreshold) throws Exception
	{
		//TODO check input param
		
		ArrayList<Student> filteredStudents = new ArrayList<Student>();
		for(Student tempS : studentList) {
			if(tempS.getBirthYear() >= inputBirthyearThreshold) {
				filteredStudents.add(tempS);
			}
		}
		
		
		if(filteredStudents.isEmpty()) {
			Exception myExc = new Exception
				("There is no student which birth year is larger than " + inputBirthyearThreshold);
			throw myExc;
		}
		else
		{
			return filteredStudents;
		}
		
		//John, Sarah, Anne
		
				//1. iteration -> tempS = John
				//2. iteration -> tempS = Sarah
				//3. iteration -> tempS = Anne
	}
	public static ArrayList<Course> filterCourseByProfessorId(long inputId)throws Exception{
		ArrayList<Course> filteredCourse = new ArrayList<Course>();
		for (Course tempC : courseList) {
			if(tempC.getProfessor().getId() == inputId) {
				filteredCourse.add(tempC);
			}
		}
		
		if(filteredCourse.isEmpty()) {
			Exception myExc = new Exception
				("There is no course which "
						+ "leading professor is with id " + inputId);
			throw myExc;
		}
		else
		{
			return filteredCourse;
		}
	}
	//For Filtered grade
	
	//Create new professor
	public static void createNewProfessor(String inputName, String inputSurname, Degree inputDegree,String inputPassportNumber)throws Exception {
		for(Professor tempP : professorsList) {
			if(tempP.getPassportNumber().equals(inputPassportNumber)) {
				Exception myEx = new Exception("Oups there is Professor already enrolled with this ID !");
				throw myEx;
			}
		}
		Professor newProfessor = new Professor(inputName, inputSurname, inputDegree, inputPassportNumber);
		professorsList.add(newProfessor);
	}
}
