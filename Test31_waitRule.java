package gf.multithreading;

class WaitRule {
	synchronized void m1() {
		System.out.println("m1 start");
		try {
			//wait();
			wait(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m1 end");
	}
}
public class Test31_waitRule {

	public static void main(String[] args) {
		WaitRule wr = new WaitRule();
		wr.m1();

	}

}
