package executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo
{
	public static void main(String[] args)
	{
		ExecutorService executorService = Executors.newFixedThreadPool(1);

			executorService.execute(new ThreadCreation());
			executorService.execute(new ThreadCreation1());

		for(int i=1;i<=5;i++)
		{
			System.out.println("main is =>"+i+"with current thread"+ Thread.currentThread().getName());
		}

	}


	}

class ThreadCreation extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("i is =>"+i+"with current thread"+ currentThread().getName());
		}
	}

}

class ThreadCreation1 extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("k is =>"+k+"with current thread"+ currentThread().getName());
		}
	}

}

class ThreadCreation2 extends Thread
{
	int count=0;
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			if(j==3)
				for(int l=1;l<=50000;l++)
				{
						count=count+1;
				}
			System.out.println("j is =>"+j+"with current thread"+ currentThread().getName());
		}
	}

}
