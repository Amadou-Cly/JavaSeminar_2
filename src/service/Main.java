package service;
import model.Course;
import model.Degree;
import model.Professor;
import model.Student;
import model.Grade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("******1*****");
		Student  stud1 = new Student();
		System.out.println(stud1);
		System.out.println("******2*****");
		Professor prof1 = new Professor();
		System.out.println(prof1);
		
	
		
		Professor prof2 = new Professor("John", "Green", Degree.Dr);
		System.out.println(prof2);
		
		System.out.println("******COURSE*****");
		
		Course course1 = new Course("Java",6,prof2);
		System.out.println(course1);
		
		Course course2 = new Course();
		System.out.println(course2);
		
		System.out.println("***************GRADE***********");
		
		Grade grade1 = new Grade (95,stud1,course1);
		System.out.println(grade1);
		
		

	}

}
