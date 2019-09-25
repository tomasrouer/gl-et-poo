import java.util.*;
import java.lang.Math;

public class Counter extends Thread
{
	private String mName;
	private int n;
	private static int j=0;
	
	public Counter(String Name , int m)
	{
		this.mName = Name;
		this.n = m;
	}

	public void run()
	{
		Random rand = new Random();	
		int i,nb_al;
		
		// 10 sleeps btw 0 and 5 seconds
		for (i = 1 ; i <= this.n ; i++)
		{
				nb_al = rand.nextInt(6);
				nb_al=nb_al*1000;
				try { sleep(nb_al); }
				catch (InterruptedException e)  {  }
				System.out.println(i + " " + this.mName);
		}
		// incrementation of the position of the player
		j++;
		System.out.println("EndGame : " + this.mName + " est arrivé(e) " + j);
		
	}
}
