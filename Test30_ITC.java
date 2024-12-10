package gf.multithreading;

class Factory {
	private int items;
	private boolean itemsAvailable;
	
	synchronized void produce(int items) {
		if(itemsAvailable) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.items = items + items;
		System.out.println("Items Produced :: "+items);
		itemsAvailable = true;
		
		this.notify();
	}
	
	synchronized void consume(int items) {
		if(!itemsAvailable) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.items = items - items;
		System.out.println("Items Consumed :: "+items);
		itemsAvailable = false;
		
		this.notifyAll();
	}
}

class Producer implements Runnable {
	private Factory factory;
	public Producer(Factory factory) {
		this.factory = factory;
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			factory.produce(i);
		}
		
	}
}

class Consumer implements Runnable {
	private Factory factory;
	public Consumer(Factory factory) {
		this.factory = factory;
	}	
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.factory.consume(i);
		}
		
	}
}


public class Test30_ITC {

	public static void main(String[] args) {
		System.out.println("main start");
		Factory fact = new Factory();
		
		Producer p = new Producer(fact);
		Consumer c = new Consumer(fact);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();	
		System.out.println("main end");
	}

}
