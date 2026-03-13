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
		Student  stud2 = new Student("AC125487", "Abdul", "Aziz","Economie", 2002, "TR4783257", "Latvia");
		Student stud3 = new Student("AS234567", "Burak", "Sen","IT", 2001, "LV1223456", "Latvia");
		studentList.add(stud1);
		studentList.add(stud2);
		System.out.println(studentList);
		
		
		System.out.println("******PROFESSOR*****");
		Professor prof1 = new Professor();
		Professor prof2 = new Professor("John", "Green", Degree.Dr);
		professorsList.add(prof1);
		professorsList.add(prof2);
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
		
		
		
		
	
	}

	
	
}
