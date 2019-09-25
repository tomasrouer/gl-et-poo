import java.util.*;
import java.lang.Math;

public class TestCounter 
{
	public static void main(String[] args)
	{
		Counter c1 = new Counter("zakaria" , 10);
		//creation d'un obj de la classe counter pour 10 iterations 
		Counter c2 = new Counter("adnene" , 10);
		Counter c3 = new Counter("mehdi" , 10);
		Counter c4 = new Counter("francisco" , 10);
		Counter c5 = new Counter("thomas" , 10);
		Counter c6 = new Counter("toto" , 10);
		
		c1.start();
		c2.start();
		c3.start(); 
		c4.start(); 
		c5.start(); 
		c6.start();  
	}
}
