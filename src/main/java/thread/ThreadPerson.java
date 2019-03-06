package thread;

public class ThreadPerson extends Thread {

	public static  int total = 100;
	
	public static boolean flag=true;
	
	static int num=0;


	@Override
	public void run() {
		
//		synchronized(this){
			while (flag) {
				show();
		   }
	}

	private synchronized static void show() {
		if (total > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "号窗口卖出" + total + "座"+"---->"+num++);
			total--;
		} else {
			System.err.println(Thread.currentThread().getName() + "号窗口售完");
			flag=false;
		    return;
		}
	}

	public ThreadPerson(String name) {
		super(name);
	}

	public ThreadPerson() {
	}
}
