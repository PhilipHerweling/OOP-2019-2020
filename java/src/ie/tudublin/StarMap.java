package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet
{
    // Arraylist can grow and shrink
    // Generic
    ArrayList<Star> stars = new ArrayList<Star>(); 

    public void settings()
    {
        size(800, 800);

    }

    public void setup()
    {
        loadData();
        printStars();
    }

    public void loadData()
    {
        Table t = loadTable("HabHYG15ly.csv", "header");
        for(TableRow tr:t.rows())
        {
            Star s = new Star(tr);
            stars.add(s);
        }
    }

    public void graph()
	{

		float gap = width * 0.1f;
		float halfGap = gap / 2.0f;
		colorMode(RGB);
		stroke(0, 0, 255);
		textAlign(CENTER, CENTER);
		for(int i = -5 ; i <=5 ; i ++)
		{
			float x = map(i, -5, 5, gap, width -gap);				
			line(x, gap, x, height - gap);
			line(gap, x, width - gap, x);
			fill(255);
			text(i, x, halfGap);
			text(i, halfGap, x);
			
        }
        
        for(Star s:stars)
        {
            stroke(255, 255, 0);
            line(s.getxG(),s.getyG()-5,s.getxG(),s.getyG()+5);
            line(s.getxG()-5, s.getyG(), s.getxG()+5, s.getyG());
            circle(map(s.getxG(), -5, 5, gap, width -gap), map(s.getyG(), -5, 5, gap, width -gap), s.getAbsMag());

        }
	}

    public void printStars()
    {
        for(Star s:stars)
        {
            println(s);
        }
    }

    public void draw()
    {
        background(0);
        graph();

    }

}
