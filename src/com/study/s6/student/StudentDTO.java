package com.study.s6.student;

public abstract class StudentDTO {
	
	String name;
	
	int num;
	int kor;
	int eng;
	int math;
	int total;
	public abstract int setTotal() ;
	
	public StudentDTO(){this.name = "diary";}
	public StudentDTO(String name){this.name = name;}
}
