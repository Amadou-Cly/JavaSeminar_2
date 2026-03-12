package service;
import model.Degree;
import model.Professor;
import model.Student;

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
		
		

	}

}
