package gf.multithreading;

public class test20_toString {

	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		System.out.println(t1); //Thread[id, name, priority, groupname]
								//toString() method return value is printed 
								//it may be printing object state or 
								//classname@hashcode in hexa starting format
		
		Thread t2 = new Thread("child-1");
		System.out.println(t2);
		
		Thread t3 = Thread.currentThread();
		System.out.println(t3);
		
		t3.setPriority(9);
		
		Thread t4 = new Thread();
		System.out.println(t4);

	}
}
