package gf.multithreading;

class MyThread15 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("run end");
	}
}

public class Test24_join {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		MyThread15 mt1 = new MyThread15();
		mt1.start();
		
		mt1.join(); //Forcing to thread scheduler to pause
		mt1.join(3000); //Forcing to thread scheduler to pause
		mt1.join(5000); //Forcing to thread scheduler to pause
		mt1.sleep(7000); //Forcing to thread scheduler to pause
		
		System.out.println("main end");
	}	

}
