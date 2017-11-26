package com.bsl.thread.test3.wait;

public class ThreadSubtract extends Thread{

	private Subtract subtract;
	public ThreadSubtract(Subtract subtract){
		this.subtract=subtract;
	}
	public void run(){
		subtract.substract();
	}
}
