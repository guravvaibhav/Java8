package multithreading;

public class Test2 {
	
	public static void main(String[] args) {
		Test2 t2=new Test2();
		Runnable r=()->t2.call();
		Thread t=new Thread(r);
		t.start();
		t2.call();
	}
	public synchronized void call() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" : " +i);
		}
	}

}
