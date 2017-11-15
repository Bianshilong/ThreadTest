package com.bsl.thread1;
//CountOperate的测试类
public class TestCo {

	public static void main(String[] args) {

		/*this指向的还是new CountOperate()创建的那个线程实例，
		而不是new Thread(thread)创建的那个实例即t1
		*实际上new Thread(thread)会将thread应用的对象绑定到一个pravite变量target上，
		*在t1被执行的时候即t1.run()被调用的时候，它会调用target.run()方法，也就是说它是直接调用thread对象的run方法，
		*再确切的说，在run方法被执行的时候，this.getName()实际上返回的是target.getName()，
		而Thread.currentThread().getName()实际上是t1.getName()。
		*/
		CountOperate c = new CountOperate();
//		c.start();   			//Thread.currentThread()==this:true
		Thread t1 = new Thread(c);
		System.out.println("main begin t1 isAlive="+t1.isAlive());
		t1.setName("A");
		t1.start();				//Thread.currentThread()==this:false
		System.out.println("main end t1 isAlive="+t1.isAlive());
		
	}

}
