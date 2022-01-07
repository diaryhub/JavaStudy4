package com.study.s6.student;

public class StudentMain {

	public static void main(String[] args) {
		StudentDTOSecond ss = new StudentDTOSecond();
		
		ss.kor =30;
		ss.eng =30;
		ss.math=30;
		ss.history=50;
		ss.setTotal();
	}

}
