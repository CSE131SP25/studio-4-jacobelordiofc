package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next(); 
		int r = in.nextInt(); 
		int g = in.nextInt();
		int b = in.nextInt();
		boolean filled = in.nextBoolean();
		double p1 = in.nextDouble(); 
		double p2 = in.nextDouble();
		double p3 = in.nextDouble();
		double p4 = in.nextDouble();
		
		 
		if (shape .equals("ellipse") && filled == false) {
			Color color = new Color (r, g, b);  
			StdDraw.setPenColor(color);
			StdDraw.ellipse(p1, p2, p3, p4);
		}
		else if (shape .equals ("ellipse") && filled == true) {
			Color color = new Color (r, g, b);
			StdDraw.setPenColor(color);
			StdDraw.filledEllipse(p1, p2, p3, p4);
		}
		else if (shape .equals ("rectangle") && filled == false) {
			Color color = new Color (r, g, b);
			StdDraw.setPenColor(color);
			StdDraw.rectangle(p1, p2, p3, p4);
		}
		else if (shape .equals ("rectangle") && filled == true) {
			Color color = new Color (r, g, b);
			StdDraw.setPenColor(color);
			StdDraw.filledRectangle(p1, p2, p3, p4);
		}
		
		
	}
}
