package gf.multithreading;

class MyThread09 extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			System.out.println(getName()+"run i : "+i);
		}
	}
}

public class Test09_multipleThreadswithSamelogic { 
	public static void main(String[] args) {
		
		MyThread09 mt1 = new MyThread09();
		mt1.start();
		
		MyThread09 mt2 = new MyThread09();
		mt2.start();
		
		MyThread09 mt3 = new MyThread09();
		mt3.start();
		
	}

}
