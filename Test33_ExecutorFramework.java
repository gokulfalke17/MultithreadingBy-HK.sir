package gf.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SaRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("SaRunnable : run executed...");
		
	}
}

class SaCallable implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		System.out.println("Call executed in \""+Thread.currentThread().getName()+"\"");
		if(true) {
			//throw new ArithmeticException("Just For Fun...");
		}
		return 5;
		
	}
}
public class Test33_ExecutorFramework {

	public static void main(String[] args) {
		System.out.println("main start");
		//creating thread pool
		//ExecutorService service1 = Executors.newSingleThreadExecutor();
		//ExecutorService service1 = Executors.newFixedThreadPool(3);
		ExecutorService service1 = Executors.newCachedThreadPool();
		
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
//		service1.submit(new SaCallable());
		
		for(int i=1;i<=100;i++) {
			service1.submit(new SaCallable());
		}
		service1.shutdown();
		service1.shutdownNow();
		System.out.println();
		
		ExecutorService service2 = Executors.newSingleThreadExecutor();
		Future<Integer> future = service2.submit(new SaCallable());
		
		
		try {
			Integer result = future.get();	
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		service2.shutdown();
		
		System.out.println("main end");
	}

}
