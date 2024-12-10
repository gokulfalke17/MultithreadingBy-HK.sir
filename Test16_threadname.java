package gf.multithreading;

class MyThread11 extends Thread {
	
	public MyThread11() {
		
	}
	
	public MyThread11(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println(getName()+": i :"+i);
		}
	}
}
public class Test16_threadname {

	public static void main(String[] args) {
		System.out.println("main start");
		MyThread11 mt1 = new MyThread11();
		MyThread11 mt2 = new MyThread11("child-2");
		
		System.out.println(mt1.getName());
		System.out.println(mt2.getName());
		System.out.println();
		
		mt1.setName("child-1");
		//mt1.setName("child-2"); //no error but programmer will confuse
		
		System.out.println(mt1.getName());
		System.out.println(mt2.getName());
		System.out.println();
		
		mt1.start();
		mt2.start();
		
		System.out.println("main end");


	}

}
