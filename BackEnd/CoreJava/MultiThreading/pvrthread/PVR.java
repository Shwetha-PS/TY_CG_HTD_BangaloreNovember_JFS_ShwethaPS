package com.caps.thread.pvrthread;

public class PVR {
	synchronized void ConfirmTicket() {
		for(int i=0;i<4;i++) {
			System.out.println(i);
			//		try {
			//			Thread.sleep(1000);
			//		} catch (InterruptedException e) {
			//			// TODO Auto-generated catch block
			//			e.printStackTrace();
			//		}
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	synchronized  void leavMe() {
		System.out.println("notify called");
		notify();
	}
}
