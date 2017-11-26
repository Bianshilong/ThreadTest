package com.bsl.thread.test3.cs1;

public class ThreadP extends Thread {

	private P p;
	public ThreadP(P p){
		this.p=p;
	}
	
	public void run(){
		while (true) {
			p.setValue();
		}
	}
}
