package ie.tudublin;

import java.io.File;

import java.util.Scanner;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
		ArrayList<String> sonnet = new ArrayList<String>();
		sonnet.add(String[0]);
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	public void loadFile()
	{
		String[] textfile = loadStrings("filename.txt");
		String[] wordArray = textfile.split(" ");
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