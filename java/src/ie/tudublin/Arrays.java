package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	

	//float[] rainfall = new float[12];
	float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "Decmber"};


	public void settings()
	{
		size(500, 500);
	}

	/*public void setup() 
	{	
		
		for(int i = 0; i < rainfall.length; i++){
			println(months[i]+"\t"+ rainfall[i]);
		}

		float max = 0;
		float min = rainfall[0];
		int cmax = 0;
		int cmin = 0;

		for(int i = 0; i < rainfall.length; i++){
			if(rainfall[i]>max){
				max = rainfall[i];
				cmax = i;
			}
			else if(rainfall[i] < min){
				min = rainfall[i];
				cmin = i;
			}
		}

		println(months[cmin] + " "+min + "\t"+ months[cmax] +" "+ max);
		
	}*/

	void drawBarchart(){

		colorMode(HSB);
		fill(0, 300, 300);
		int count = 0;
		float w = width / rainfall.length;

		for(int i = 0; i < months.length; i++){
			fill(count/2, 300, 300);
			rect(count, 500, 42, -rainfall[i]);
			count += 42;

		}
		

	}//end of barchart method

	//import java.util.arrays
	

	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	
		drawBarchart();
	}
}
