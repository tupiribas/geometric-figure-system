package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Shape re = new Rectangle(Color.valueOf("RED"), 2.4307631204964398648, 2.4307631204964398648);
		System.out.println(re.area());
		
		Shape ci = new Circle(Color.valueOf("BLUE"), 3.0);	
		System.out.println(ci.area());
	}

}
