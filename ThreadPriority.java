class MyThread implements Runnable{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("child Thread");
	}
}
public class ThreadPriority
{
	public static void main(String[] args) 
	{
		Thread t =new Thread(new MyThread());
		t.setPriority(10);
		Thread.currentThread().setPriority(1);
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("Parent Thread");

	}
}