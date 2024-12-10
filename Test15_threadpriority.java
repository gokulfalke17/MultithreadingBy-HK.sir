package gf.multithreading;

class MyThread10 extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println(getName()+": i :"+i);
		}
	}
}
public class Test15_threadpriority {

	public static void main(String[] args) {
		System.out.println("main start");
		MyThread10 mt1 = new MyThread10();
		MyThread10 mt2 = new MyThread10();
		
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		System.out.println();
		
		mt1.setPriority(7);
		mt2.setPriority(8);
		
		System.out.println(mt1.getPriority());
		System.out.println(mt2.getPriority());
		System.out.println();
		
		//mt1.setPriority(0);//IllegalArgumentException 
		//mt2.setPriority(11);//IllegalArgumentException
						//priority rang must be in 1 to 10 only
		
		mt1.start();
		mt2.start();
		
		System.out.println("main end");


	}

}
