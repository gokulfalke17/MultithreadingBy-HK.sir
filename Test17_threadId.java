package gf.multithreading;


public class Test17_threadId {

	public static void main(String[] args) {
		System.out.println("main start");
		Thread t1 = new Thread("child-1");
		Thread t2 = new Thread("child-2");
		
		System.out.println(t1.getName()+ " "+ t1.getId());
		System.out.println(t2.getName()+ " "+ t2.getId());
		
		System.out.println("main end");


	}

}
