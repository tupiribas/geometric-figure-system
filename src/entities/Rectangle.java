package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	private Double widht;
	private Double height;

	public Rectangle(Color color, Double widht, Double height) {
		super(color);
		this.widht = widht;
		this.height = height;
	}

	public Double getWidht() {
		return widht;
	}

	public Double getHeight() {
		return height;
	}

	@Override
	public final Double area() {
		return getHeight() * getWidht();
	}

}
