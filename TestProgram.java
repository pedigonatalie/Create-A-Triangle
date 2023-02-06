// Natalie Pedigo
// CS 2336.504
// Belkoura
// 10-02-2022
// this test program tests the Triangle and GeometricObject classes. 
// in this program, we gather user input, run some calculations, and 
// display our results.
import java.util.Scanner;
public class TestProgram {

	public TestProgram() {
		
	}

	public static void main(String[] args) {
		
		    Scanner input = new Scanner(System.in);
			// obtain user input for the three sides of the triangle
			System.out.println("Let's create a triangle!\nEnter three values for its three sides:");
			double side1 = input.nextInt();
			double side2 = input.nextInt();
			double side3 = input.nextInt();
			
			// obtain user input for both the color of the triangle, and if it is filled
			System.out.println("Enter the color of the triangle:");
			String color = input.next();
			System.out.println("Is the triangle filled?(Y/N)");
			char filled = input.next().charAt(0);
			
			// pass user input to Triangle constructor
			Triangle triangle1 = new Triangle(side1, side2, side3);
			
			// print attributes of triangle1 to the console
			System.out.println(triangle1.toString());
			System.out.println("Fill = "+triangle1.isFilled(filled));
			System.out.println("Color = "+triangle1.setColor(color));
		
		
	}

}
