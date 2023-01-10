package sychronization;

public class DataTest
{

	public static void main(String[] args)
	{
		Data d = new Data();
		Data1 d1 = new Data1(d);
		Data2 d2 = new Data2(d);
		d1.start();
		d2.start();

	}

}

class Data
{
	private String packet;

	// True if receiver should wait
	// False if sender should wait
	private boolean transfer = true;

	public synchronized String receive() {
		while (transfer) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.err.println("Thread Interrupted");
			}
		}
		transfer = true;

		String returnPacket = packet;
		notifyAll();
		return returnPacket;
	}

	public synchronized void send(String packet) {
		while (!transfer) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.err.println("Thread Interrupted");
			}
		}
		transfer = false;

		this.packet = packet;
		notifyAll();
	}
}

class Data1 extends Thread
{
	Data data;
	Data1(Data d)
	{
		this.data=d;
	}
	public void run()
	{

		data.receive();

	}
}class Data2 extends Thread
{
	Data data;
	Data2(Data d)
	{
		this.data=d;
	}
	public void run()
	{

		data.send("nscjassackjsac");
	}
}






