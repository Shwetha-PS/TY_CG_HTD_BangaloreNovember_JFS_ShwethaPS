package com.caps.thread.irctcthread;

public class IRCTC {

		synchronized void ConfirmTicket() {
			for(int i =0; i<5; i++) {
				System.out.println(i);
				
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
//				
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}	
		}
		synchronized void leavMe() {
			System.out.println("notify called");
			notifyAll();
		}
		
}
