package executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo
{
	public static void main(String[] args)
	{
		Runnable runnable = ()->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("i is =>"+i);
			}
		};
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(runnable);
		executorService.execute(runnable);
		executorService.execute(runnable);
		executorService.execute(runnable);
		executorService.execute(runnable);
	}
}
