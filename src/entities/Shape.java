package entities;

import entities.enums.Color;

public abstract class Shape implements Shapei {
	private Color color;

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
