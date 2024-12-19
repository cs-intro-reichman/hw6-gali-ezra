import java.awt.Color;

/**
 * Demonstrates the morphing operation featured by Runigram.java. 
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of a image and the number of morphing steps (an int). 
 */
public class Editor4 {

	public static void main (String[] args) {
		String fileName = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] originalImage = Runigram.read(fileName);
		Color[][] greyImage = Runigram.grayScaled(originalImage);
		Runigram.setCanvas(originalImage);
		Runigram.morph(originalImage, greyImage, n);
	}
}
