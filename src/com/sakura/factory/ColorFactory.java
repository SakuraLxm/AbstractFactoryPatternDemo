package com.sakura.factory;

import com.sakura.Circle;
import com.sakura.Rectangle;
import com.sakura.Shape;
import com.sakura.Square;
import com.sakura.color.Blue;
import com.sakura.color.Color;
import com.sakura.color.Green;
import com.sakura.color.Red;

/**
 * 
 * @author sakuraLxm
 *
 */
public class ColorFactory extends AbstractFactory {
	public static String RED = "RED";
	public static String GREEN = "GREEN";
	public static String BLUE = "BLUE";


	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if (color == null) {
			
			return null;
		}
		if (color.equalsIgnoreCase(RED)) {
			return new Red();
		} else if (color.equalsIgnoreCase(GREEN)) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		return null;
	}
}