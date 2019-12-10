package com.capgemini.protectedaccess.pckg1;

public class TestStudent  extends Student
{
	protected TestStudent(String name) {
		super(name);
	}
	
	void studentDetails()
	{
		System.out.println("Student name is "+studName);
		
	}
	public static void main(String[] args) 
	{
		TestStudent s1 = new TestStudent("john");
		s1.studentDetails();
		
		
		
	}

}
