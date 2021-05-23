package entities;

public class Rectangle {
	public double width;
	public double height;
	public static double area;
	public static double perimeter;
	public static double diagonal;
	
	public void area() {
		area = width * height;
	}
	
	public void perimeter() {
		perimeter = 2 * (width + height);
	}
	
	public void diagonal() {
		diagonal = Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
	}
	
	public String toString() {
		return	"AREA = " + area
				+ "\nPERIMETER = " + perimeter
				+ "\nDIAGONAL = " + diagonal;
	}
}
