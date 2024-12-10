package gf.multithreading;

public class JoinDemo extends Thread {
	
	@Override
	public synchronized  void run() {
		for(int i=1;i<=20;i++) {
			System.out.println(getName()+" : i "+i);
			if(i==5 && getName().equals("child-1"));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		JoinDemo jd1 = new JoinDemo();
		jd1.setName("child-1");
		jd1.start();
		
		JoinDemo jd2 = new JoinDemo();
		jd2.setName("child-2");
		jd2.start();
		
		jd1.join();
		//jd2.join();
		
		System.out.println("main end");
		
	}

}
