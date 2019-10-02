import java.util.*;
import java.lang.Math;

public class Counter extends Thread
{
	private String name;
	private int nb;
	private static int pos = 0;
	
	public Counter(String name , int nb)
	{
		this.name = name;
		this.nb = nb;
	}

	public void run()
	{
		Random rand = new Random();	
		int i,tpsSleep;
		
		// 10 sleeps btw 0 and 5 seconds
		for (i = 1 ; i <= this.nb ; i++)
		{
				tpsSleep = rand.nextInt(6); // choix aleatoire d'un entier entre 0 et 5
				tpsSleep = tpsSleep*1000; // ms to sec
				try {
					sleep(tpsSleep);
				}
				catch (InterruptedException e)  {  }
				System.out.println("iteration No " + i + " de " + this.name);
		}
		// incrementation of the position of the player
		try {
			synchronized (this)
			{
				pos++;
				System.out.println("FIN : " + this.name + " est arrivé(e) en position No " + pos + " !");
			}
		}
		catch (Exception e)  {  }
	}
}
