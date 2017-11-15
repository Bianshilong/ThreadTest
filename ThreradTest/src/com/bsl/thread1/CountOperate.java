package com.bsl.thread1;
//测试Thread.currentThread()与this的区别
public class CountOperate extends Thread {
	
	public CountOperate() {
		System.out.println("CountOperate---begin");
		System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive():"+Thread.currentThread().isAlive());
		System.out.println("this.getName():"+this.getName());
		System.out.println("this.isAlive():"+this.isAlive());
		System.out.println("CountOperate---end");
		System.out.println("Thread.currentThread()==this:"+(Thread.currentThread()==this));
	}
	
	public void run() {
		System.out.println("run---begin");
		System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive():"+Thread.currentThread().isAlive());
		System.out.println("Thread.currentThread()==this:"+(Thread.currentThread()==this));
		System.out.println("this.getName():"+this.getName());
		System.out.println("this.isAlive():"+this.isAlive());
		System.out.println("run---end");
	}
}
