// Natalie Pedigo
// CS 2336.504
// Belkoura
// 10-02-2022
// This triangle class is a child class of GeometricObject. The Triangle class
// creates a Triangle object and stores values for its sides, color, area, etc.
public class Triangle extends GeometricObject {

	private double side1, side2, side3 = 1.0;
	
	// constructor that sets the sides of a Triangle object
	// to a default value of 1.0
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	// constructor that sets the sides of a Triangle object 
	// to the values the user has input
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	
	public double getSide1() {
		return this.side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	
	public double getSide3() {
		return this.side3;
	}

	// calculate area of triangle and return value
	public double getArea() {
		double s = 0.5*(side1+side2+side3);
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	
	// calculate perimeter of triangle and return value
	public double getPerimeter() {
		return side1+side2+side3;
	}
	
	// displays attributes of triangle to the console when called
	public String toString() {
		return "******************************\nHere are your triangle's attributes!\nPerimeter = "+ getPerimeter()+"\nArea = "+ getArea();
	}
	
	
}
