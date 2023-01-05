package multithreading;

public class Test1 {
	public static void main(String[] args) {
		Test1 t=new Test1();
		Runnable r=()->t.m();
		Thread t1=new Thread(r);
		t1.start();
		t.m();
	}
	public void m() {
		for(int i=0;i<=5;i++) {
		System.out.println(Thread.currentThread().getName()+"child : "+i);
		}
	}

}
