package sychronization;

public class WaitMethodExample
{
	public static void main(String[] args) throws InterruptedException
	{
		PowerWait p= new PowerWait();
		ThreadWait1 t2= new ThreadWait1(p);
		ThreadWait2 t1= new ThreadWait2(p);
		t2.start();
		t1.start();

	}
}

class PowerWait
{
	synchronized void printPower(int n) throws InterruptedException
	{
		int temp = 1;
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName() + ":- " +n + "^"+ i + " value: " + n*temp);
			temp = n*temp;
			try{
				Thread.sleep(500);



			}catch(Exception e){System.out.println(e);}
		}
	}

}

class ThreadWait1 extends Thread{

	PowerWait p;
	ThreadWait1 (PowerWait p) throws InterruptedException
	{
		this.p=p;

	}
	public void run()
	{
		try
		{
			p.printPower(5);

		}
		catch (InterruptedException e)
		{
			throw new RuntimeException(e);
		}
	}
}

class ThreadWait2 extends Thread{
	PowerWait p;
	ThreadWait2(PowerWait p){
		this.p=p;

	}
	public void run(){
		try
		{
			p.printPower(8);


		}
		catch (InterruptedException e)
		{
			throw new RuntimeException(e);
		}
	}
}