package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		StdDraw.clear();
		StdDraw.setXscale(0,22);
		StdDraw.setYscale(0,16);
		StdDraw.setPenColor(255,200,0);
		StdDraw.filledRectangle(11,8,11,8);
		StdDraw.setPenColor(255,175,175);
		StdDraw.filledCircle(11, 8, 8);
		StdDraw.setPenColor(128,0,128);
		StdDraw.filledSquare(1.5,14.5,1);
		StdDraw.filledSquare(1.5,1.5,1);
		StdDraw.filledSquare(20.5,14.5,1);
		StdDraw.filledSquare(20.5,1.5,1);
	
		
	}
}