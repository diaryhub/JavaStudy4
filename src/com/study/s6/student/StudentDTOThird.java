package com.study.s6.student;

public class StudentDTOThird extends StudentDTO{
	
	int physics;

	@Override
	public int setTotal() {
		total = kor +eng + math + physics;
		
		return total;
	}
	
	
}
