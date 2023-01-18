package thread;

class MultiThread extends Thread
{
	public void run()
	{
		System.out.println("Current Running Thread is===>"+Thread.currentThread().getName());
//		try
//		{
//			Thread.sleep(1000);
//		}
//		catch (InterruptedException e)
//		{
//			throw new RuntimeException(e);
//		}

	}
}

public class MultiThreadTest
{
	public static void main(String[] args) throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			MultiThread thread = new MultiThread();
			MultiThread thread1 = new MultiThread();
			thread.start();
			Thread.sleep(3000);
			thread1.start();

		}

	}
}
