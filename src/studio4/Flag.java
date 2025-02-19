package studio4;

import java.awt.Color;


import edu.princeton.cs.introcs.StdDraw;
import java.awt.Image;
public class Flag {
	public static void main(String[] args) {
		Color color = new Color (255, 57, 175); 
		StdDraw.setPenColor(color);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3); 
		//first 2 is x an y (center) second two hor far from center
		
		Color color2 = new Color (255, 255, 255); 
		StdDraw.setPenColor(color2);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.02);
		StdDraw.filledRectangle(0.16, 0.25, 1, 0.02);
		StdDraw.filledRectangle(0.16, 0.375, 1, 0.02);
		StdDraw.filledRectangle(0.16, 0.75, 1, 0.02);
		StdDraw.filledRectangle(0.16, 0.625, 1, 0.02);
		
		//Color color3 = new Color (255, 255, 255); 
		//StdDraw.setPenColor(color3);
		//StdDraw.filledRectangle(0.5, 0.5, 0.35, 0.3);
		
		StdDraw.setXscale(0 , 1); 
		StdDraw.setYscale(0 , 1); 
		 StdDraw.picture(0.5, 0.5, "resources/png-clipart-jacob-elordi-je-2.png");
			StdDraw.show(); 
		}
	}
