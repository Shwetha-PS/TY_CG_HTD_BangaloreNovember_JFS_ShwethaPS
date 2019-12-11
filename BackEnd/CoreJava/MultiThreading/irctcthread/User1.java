package com.caps.thread.irctcthread;

public class User1 extends Thread
{
	IRCTC i;

	public User1(IRCTC i) {
		super();
		this.i = i;
	}

	@Override
	public void run() {
		i.ConfirmTicket();
	}
}
