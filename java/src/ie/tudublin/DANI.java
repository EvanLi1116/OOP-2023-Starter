package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet(String[] sonnet)
    {

        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {
		if (keyCode == ' ')
		{

		}
	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);

		String[] sonnet = loadFile();
		writeSonnet(sonnet);
        
	}

	public String[] loadFile()
	{
		String[] textfile = loadStrings("smalltxt.txt");
		String[] sonnet = textfile.split(" ");

		return sonnet;
	}

	public void findWord(String[] a)
	{

	}

	public void printModel()
	{

	}


}

public class Follow extends PApplet
{

}

public class Words extends PApplet
{
	public void findFollow(String[] b)
	{

	}
}