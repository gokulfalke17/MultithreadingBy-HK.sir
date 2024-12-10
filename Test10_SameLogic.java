package gf.multithreading;

class MyThread010 extends Thread {
	private int x;
	public MyThread010() {
		x = 5;
	}	
	
	public MyThread010(int x) {
		this.x = x;
	}
	@Override
	public void run() {
		for(int i=1;i<=x;i++) {
			System.out.println(getName()+"run i : "+i);
		}
	}
}
	
public class Test10_SameLogic {
	
	public static void main(String[] args) {
		
		MyThread010 mt1 = new MyThread010();
		mt1.start();
		
		MyThread010 mt2 = new MyThread010(10);
		mt2.start();
		
		MyThread010 mt3 = new MyThread010(20);
		mt3.start();
		
		for(int i=1;i<=20;i++) {
			System.out.println("in main i : "+i);
		}
		
	}

}
