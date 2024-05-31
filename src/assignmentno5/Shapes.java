package assignmentno5;

import java.util.Scanner;

class shape{
	
	public void Rectangle( double height,double width)
	{
		double area= height*width;
		System.out.println("Rectangle area: " +area);
		
	}
	
	public void Square( double length)
	{
		double area= length*length;
		System.out.println("square  area: " +area);
		
	}
	
	
	public void box(double boxWidth,double boxDepth,double boxHeight)
	{
		double area= boxWidth*boxDepth*boxHeight;
		System.out.println("area of box: " + area);
		
	}
	
	
}







public class Shapes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter the width of the rectangle: ");
        double rectWidth = scanner.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double rectHeight = scanner.nextDouble();
        shape Rectangle = new shape();
        Rectangle.Rectangle(rectHeight, rectWidth);
        // Square
        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();
        shape square = new shape();
        square.Square(squareSide);
        // Box
        System.out.print("Enter the width of the box: ");
        double boxWidth = scanner.nextDouble();
        System.out.print("Enter the depth of the box: ");
        double boxDepth = scanner.nextDouble();
        System.out.print("Enter the height of the box: ");
        double boxHeight = scanner.nextDouble();
        shape box = new shape();
        box.box(boxWidth, boxDepth, boxHeight);

        scanner.close();

	}

}
