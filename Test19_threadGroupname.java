package gf.multithreading;

public class Test19_threadGroupname {

	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		ThreadGroup tg1 = t1.getThreadGroup();
		System.out.println(tg1.getName());
		
		Thread t2 = Thread.currentThread();
		ThreadGroup tg2 = t2.getThreadGroup();
		System.out.println(tg2.getName());
		
		ThreadGroup grpA = new ThreadGroup("Group-1");
		Thread t3 = new Thread(grpA, "child-1");
		Thread t4 = new Thread(grpA, "child-2");
		
		System.out.println(t3.getThreadGroup().getName()); 
		System.out.println(t4.getThreadGroup().getName()); 
				
	}

}
