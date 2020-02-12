package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
	}

	
	public void keyPressed()
	{

	}	


	public void draw()
	{	
		background(0);		

		/*int i = 0;
		while (i<10)
		{
			i++;
		}*/

	for (int y = 10; y <= 40; y+=10)
		line (200,y,300,y);

	}
}
