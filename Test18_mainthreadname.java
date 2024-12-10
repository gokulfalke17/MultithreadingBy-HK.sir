package gf.multithreading;


public class Test18_mainthreadname {

	public static void main(String[] args) {
		System.out.println("main start");
		Thread t1 = Thread.currentThread(); //retrieving current running thread object reference
		
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println();
		
		t1.setName("xxyy");
		t1.setPriority(9);
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println();
		
		System.out.println("main end");


	}

}
