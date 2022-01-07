package com.study.s6.student;

public class StudentDTOSecond extends StudentDTO{
	
	int history;
	
	public int setTotal() {
		total = kor+eng+math+history;
		System.out.println(total);
		return total;
	}
	
}
