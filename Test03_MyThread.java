package gf.multithreading;
/*
   Approach #1 : executing from thread class 
    1. create class deriving from Thread class 
    2. overriding run() method and place logic to execute in custom thread
    3.create this sub class object and class start method
    
 */
public class Test03_MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("run() method");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		Test03_MyThread mt = new Test03_MyThread();
		mt.start();
		//1. request to JVM create custom thread for mt object
		//2. request JVM to call run() method from mt object class in this CT
		System.out.println("main end");
	}

}
