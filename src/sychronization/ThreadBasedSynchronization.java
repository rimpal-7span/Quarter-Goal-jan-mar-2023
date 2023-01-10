package sychronization;

public class ThreadBasedSynchronization
{
	public static void main(String[] args)
	{
		Power p= new Power();
		Thread2 t2= new Thread2(p);
		Thread1 t1= new Thread1(p);
		t2.start();
		t1.start();

	}
}

class Power
{
	synchronized void printPower(int n)
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

class Thread1 extends Thread{

	Power p;
	Thread1 (Power p)
	{
		this.p=p;
	}
	public void run()
	{
		p.printPower(5);
	}
}

class Thread2 extends Thread{
	Power p;
	Thread2(Power p){
		this.p=p;
	}
	public void run(){
		p.printPower(8);
	}
}

