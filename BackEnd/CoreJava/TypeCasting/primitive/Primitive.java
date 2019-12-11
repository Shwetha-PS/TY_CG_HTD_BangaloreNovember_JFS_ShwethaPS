package com.cap.typecasting.primitive;

public class Primitive
{
	//implicit type casting / widening
	byte b = 4;
	short s = b;
	float f = b;
	int i = b;
	double d = b;
	
	void values()
	{
		System.out.println("byte value is "+b);
		System.out.println("short value is "+s);
		System.out.println("float value is "+f);
		System.out.println("int value is "+i);
		System.out.println("double value is "+d);
		

	}
	
	//explicit type casting/ Narrowing
	double pi = 3.142;
	int i1 =(int)pi;
	
	void details()
	{
		System.out.println("int value is "+i1);
		System.out.println("double value is "+pi);
	}
	

}
