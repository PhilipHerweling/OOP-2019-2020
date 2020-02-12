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
		if (key == ' ')
		{
			
		}
	}	


	/*public void draw()
	{	
		background(85, 85, 85);		


		//int i = 0;
		//while (i<10)
		//{
		//	i++;
		//}

	for (int y = 10; y <= 40; y+=10)
		line (200,y,300,y);


		stroke(0);
		line(10, 10, 100, 10);
		line(10, 20, 100, 20);
		line(10, 30, 100, 30);
		line(10, 40, 100, 40);

		for(int y = 10 ; y <= 40 ; y += 10)
		{
			line(200, y, 300, y);
		}

		int yy = 10;
		while(yy <= 40)
		{
			line(300, yy, 400, yy);
			yy += 10;
		}
		
	

	}*/


	public void draw()
	{	
		seventhExercise();


	}//end of draw

	public void firstExercise(){
		

		background(85, 85, 85);

		stroke(0);
		
		//line(10, 10, 100, 10);

		//Top
		for(int x = 0; x <= 500; x += 26){

			line(x, 0, 255, 255);
		}

		//Bottom
		for(int x = 0; x <= 500; x += 26){

			line(x, 500, 255, 255);
		}

		//Left
		for(int x = 0; x <= 500; x += 26){

			line(0, x, 255, 255);
		}

		//Right
		for(int x = 0; x <= 500; x += 26){

			line(500, x, 255, 255);
		}
	}//end of first



	public void secondExercise()
	{
		background(85, 85, 85);

		stroke(0);

		fill(255, 0,0);

		for(int x = 25; x <= 500; x+=50){

		ellipse(x,50,50,50);
		}

	}


	public void thirdExercise()
	{
		colorMode(HSB);

		for(int x= 0; x <= 500; x+=50){

		fill((x/3), 300, 300);
		rect(x, 0, 50, 500);
		}

	}

	public void fourthExercise()
	{
		colorMode(HSB);

		for(int x = 25; x <= 500; x+=50){
		fill((x/3), 300, 300);
		ellipse(x,50,50,50);
		}

	}

	public void fifthExercise()
	{

		colorMode(HSB);
		background(0);

		stroke(90, 300, 300);
		
		//line(10, 10, 100, 10);

		
		for(int x = 50; x <= 450; x += 40){

			line(50, x, 450, x);
		}

		for(int x=50; x<= 450; x += 40){
			line( x, 50, x, 450);
		}

	}

	public void sixthExercise()
	{
		colorMode(HSB);
		noStroke();

		for(int y = 25; y <=500; y+=50){

		for(int x = 25; x <= 500; x+=50){
		fill((y+x)/6, 300, 300);
		ellipse(x, y,50,50);
		}
	}
	
	}


	public void seventhExercise()
	{

		colorMode(HSB);

		for(int y = 0; y<=500; y+=25){
		for (int x = 0; x <= 500; x+=25){

			rect(x, y, 25,25);

		}
	}
		
	}





}
