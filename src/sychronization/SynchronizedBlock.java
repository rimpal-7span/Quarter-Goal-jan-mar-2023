package sychronization;

public class SynchronizedBlock
{
	public static void main(String[] args)
	{
		PowerBlock p= new PowerBlock();
		ThreadBlock1 t1= new ThreadBlock1(p);
		ThreadBlock2 t2= new ThreadBlock2(p);
		t2.start();
		t1.start();

	}
}

class PowerBlock
{
 synchronized void printPower(int n)
	{
		synchronized (this)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.println("this is thread called"+j);
			}
	;
		}
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

class ThreadBlock1 extends Thread{

	PowerBlock p;
	ThreadBlock1 (PowerBlock p)
	{
		this.p=p;
	}
	public void run()
	{
		p.printPower(5);
	}
}

class ThreadBlock2 extends Thread{
	PowerBlock p;
	ThreadBlock2(PowerBlock p){
		this.p=p;
	}
	public void run(){
		p.printPower(8);
	}
}

