package com.capgemini.thread.creatingthread;

public class Thread2 implements Runnable {
//Runnable is functional interface(only one method is present inside the class)
	@Override
	public void run() {
		for(int i=0; i<4;i++) {
			System.out.println(i);
		}
}
}
