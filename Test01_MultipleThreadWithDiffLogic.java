package gf.multithreading;

//AddThread.java
class AddThread extends Thread {
	@Override
	public void run() {
		System.out.println("Addition thread executed...");
	}
}

//AddThread.java
class SubThread extends Thread {
	@Override
	public void run() {
		System.out.println("Substraction thread executed...");
	}
}

public class Test01_MultipleThreadWithDiffLogic {
	public static void main(String[] args) {
		System.out.println("main start");
		AddThread at = new AddThread();
		at.start();
		
		SubThread st = new SubThread();
		st.start();
		
		System.out.println("main end");
	}
}
