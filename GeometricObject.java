// Natalie Pedigo
// CS 2336.504
// Belkoura
// 10-02-2022
// the GeometricObject class is the parent class of Triangle. it contains
// methods that may be used in the Triangle class, or any child class
// that is created.
public class GeometricObject {

	private boolean filled;
	private String color;
	
	
	public GeometricObject() {
		
	}
	
	// the isFilled method determines whether the triangle is filled.
	// returns true or false
	public boolean isFilled(char fill){
		if(fill == ('Y'|'y')) {
		this.filled = true;
		}
		return filled;
	}
	
	// the setColor method sets the color of the triangle
	// and returns the color the user has inputted.
	public String setColor(String color) {
		this.color = color;
		return color;
	}

}
