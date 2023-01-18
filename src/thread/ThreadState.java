package thread;


class Thread1 extends Thread
{
	public void run()
	{
		System.out.println ("Thread1 ");
		System.out.println ("i in Thread Thread1 ");
		for(int i=1;i<=5;i++)
		{
			System.out.println("i is=>"+i);

				try
				{
					Thread.sleep(2000);
				}
				catch (InterruptedException e)
				{
					throw new RuntimeException(e);
				}

		}
	}
}


class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("Thread2 ");
		System.out.println("i in Thread Thread2 ");
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("i is=>" + i);
		}
	}
}


public class ThreadState
{
	public static void main(String[] args) throws InterruptedException
	{
		Thread1 thread1= new Thread1();
		Thread2 thread2 = new Thread2();

		thread1.start();
		thread1.yield();
		//thread1.join();

		System.out.println("state of Thread1==>"+thread1.getState());
		Thread.sleep(300);
		thread2.start();

		}
}

