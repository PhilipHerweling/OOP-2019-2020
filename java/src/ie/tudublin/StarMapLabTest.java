package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMapLabTest extends PApplet {

    // Arraylist can grow and shrink
    // Generic
    ArrayList<StarLabTest> stars = new ArrayList<StarLabTest>(); 




    public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
        loadData();
        printStars();
		
    }
    
    public void draw()
	{
            background(0);
        	graph();
    }

    public void loadData()
    {
        Table t = loadTable("HabHYG15ly.csv", "header");
        for(TableRow tr:t.rows())
        {
            StarLabTest s = new StarLabTest(tr);
            stars.add(s);
        }
    }

    public void printStars()
    {
        for(StarLabTest s : stars)
        {
            println(s);
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

        for(StarLabTest s:stars)
        {
            stroke(255, 255, 0);
            line(s.getXg(),s.getYg()-5,s.getXg(),s.getYg()+5);
            line(s.getXg()-5, s.getYg(), s.getXg()+5, s.getYg());
            noFill();
            fill(map(s.getXg(),-5,5,gap,width - gap), map(s.getYg(), -5, 5, gap, width -gap), s.getAbsMag());
            circle(map(s.getXg(), -5, 5, gap, width -gap), map(s.getYg(), -5, 5, gap, width -gap), s.getAbsMag());
            

        }
    }





}