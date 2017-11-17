package com.bsl.thread1.stop;

//判断线程是否是停止状态
public class Test2 {

	public static void main(String[] args) {
		
		try {
			MyThread td = new MyThread();
			td.start();
			Thread.sleep(10);
			td.interrupt();
//			Thread.currentThread().interrupt();
//			System.out.println("是否停止1？="+td.interrupted());
//			System.out.println("是否停止2？="+td.interrupted());
			System.out.println("是否停止1？="+td.isInterrupted());
			System.out.println("是否停止2？="+td.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}
