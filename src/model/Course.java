package model;

public class Course {
	private long id;
	private String title;
	private int creditPoint;
	private Professor professor;
	
	private static long coursecounter = 1;
		
	
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
		
	}
