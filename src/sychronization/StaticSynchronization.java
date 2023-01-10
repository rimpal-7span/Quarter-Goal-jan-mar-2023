package sychronization;

public class StaticSynchronization
{
	public static void main(String[] args)
	{
		PowerStatic p= new PowerStatic();
		PowerStatic p1= new PowerStatic();
		ThreadStatic1 t1= new ThreadStatic1(p);
		ThreadStatic2 t2= new ThreadStatic2(p1);
		ThreadStatic1 t3=new ThreadStatic1(p);
		ThreadStatic2 t4 = new ThreadStatic2(p1);

		t2.start();
		t1.start();
		t3.start();
		t4.start();

	}
}

class PowerStatic
{
	synchronized static void printPower(int n)
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

class ThreadStatic1 extends Thread{

	PowerStatic p;
	ThreadStatic1 (PowerStatic p)
	{
		this.p=p;
	}
	public void run()
	{
		p.printPower(5);
	}
}

class ThreadStatic2 extends Thread{
	PowerStatic p;
	ThreadStatic2(PowerStatic p){
		this.p=p;
	}
	public void run(){
		p.printPower(8);
	}
}

