package gf.multithreading;
/*
 * 
 * Develop a project with multiple threads to perform deposite() 
 * and withdrawal() operations concurrently  for multiple custorms
 * 
 * */

//BankAccount.java
class BankAccount {
	private double balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public void deposit(double amt) {
		this.balance = balance+amt;
	}
	
	public void withdraw(double amt) {
		this.balance = balance-amt;
	}
	
	public void currentBalance() {
		System.out.println(balance);
	}
}

//Depositer.java
class Depositer implements Runnable {
	
	private BankAccount acc;
	private double amt;
	
	
	
	public Depositer(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}

	@Override
	public void run() {
		acc.deposit(amt); 
		
	}
}

//Withdrawee.java
class Withdrawee implements Runnable {
	
	private BankAccount acc;
	private double amt;
	
	
	
	public Withdrawee(BankAccount acc, double amt) {
		this.acc = acc;
		this.amt = amt;
	}

	@Override
	public void run() {
		acc.withdraw(amt); 
		
	}
}

//Test12_Bank_Project.java
public class Test12_Bank_Project {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Bank Started...");
		
		BankAccount acc1 = new BankAccount(5000);
		BankAccount acc2 = new BankAccount(10000);
		BankAccount acc3 = new BankAccount(20000);
		
		Depositer d1 = new Depositer(acc1, 3000); //cashier1
		Depositer d2 = new Depositer(acc2, 5000); //cashier2
		Withdrawee w1 = new Withdrawee(acc3, 4000); //cashier3
		Withdrawee w2 = new Withdrawee(acc2, 5105);//cashir4
		
		Thread th1 = new Thread(d1);
		Thread th2 = new Thread(d2);
		Thread th3 = new Thread(w1);
		Thread th4 = new Thread(w2);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		Thread.sleep(5000);
		
		System.out.println("Account1 Balance :: ");acc1.currentBalance();
		
		System.out.println("Account2 Balance :: ");acc2.currentBalance();
		
		System.out.println("Account3 Balance :: ");acc3.currentBalance();
						
		System.out.println("Bank Ended....Thank U Visit Agrain!");

	}

}
