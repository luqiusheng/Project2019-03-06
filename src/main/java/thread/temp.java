package thread;

public class temp {
	
	
	
	public static void main(String[] args) {
		
		
		ThreadRunable p=new ThreadRunable();
		Thread p1=new Thread(p,"1");
		Thread p2=new Thread(p,"2");
		Thread p3=new Thread(p,"3");
		p1.start();
		p2.start();
		p3.start();
		
	}

	
	public static void main1(String[] args) {
		
		
		ThreadPerson p1=new ThreadPerson("1");
		ThreadPerson p2=new ThreadPerson("2");
		ThreadPerson p3=new ThreadPerson("3");
		p1.start();
		p2.start();
		p3.start();
		
	}

}
