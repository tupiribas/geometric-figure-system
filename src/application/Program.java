package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Shape> myShape = new ArrayList<>();
		myShape.add(new Rectangle(Color.BLUE, 2.43, 3.54));
		myShape.add(new Circle(Color.BLACK, 5.1));

		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(Color.BLACK, 8.1));

		System.out.println("Total area: " + String.format("%.2f", totalArea(myCircle, myShape)));

	}

	private static Double totalArea(List<? extends Shape> myShape, List<Shape> my) {
		double sum = 0.0;
		double sum2 = 0.0;
		for (Shape list : myShape) {
			sum += list.area();
		}
		for (Shape o : my) {
			sum2 += o.area();
		}
		return sum + sum2;
	}

}
