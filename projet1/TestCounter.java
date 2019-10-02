import java.util.*;
import java.lang.Math;

public class TestCounter 
{
	public static void main(String[] args)
	{
		int nb = 5;
		// creation de 6 objets de la classe counter pour nb iterations 
		Counter c1 = new Counter("zakaria" , nb);		
		Counter c2 = new Counter("adnene" , nb);
		Counter c3 = new Counter("mehdi" , nb);
		Counter c4 = new Counter("francisco" , nb);
		Counter c5 = new Counter("thomas" , nb);
		Counter c6 = new Counter("toto" , nb);
		
		// on lance tous les threads en meme temps
		c1.start();
		c2.start();
		c3.start(); 
		c4.start(); 
		c5.start(); 
		c6.start();  
	}
}
