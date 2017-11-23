package com.bsl.thread2.test2;

public class Task {
	private String getData1;
	private String getData2;
	//synchronized同步方法，执行占有时间较长，可以只同步代码块
	public void doLongTimeTask() {
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			String privategetData1="长时间处理任务后从远程返回的值1 threadName="+Thread.currentThread().getName();
			String privategetData2="长时间处理任务后从远程返回的值2 threadName="+Thread.currentThread().getName();
			synchronized(this) {
				getData1=privategetData1;
				getData2=privategetData2;
			}
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
