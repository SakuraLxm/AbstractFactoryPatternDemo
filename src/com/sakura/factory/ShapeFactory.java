package com.sakura.factory;

import com.sakura.Circle;
import com.sakura.Rectangle;
import com.sakura.Shape;
import com.sakura.Square;
import com.sakura.color.Color;

public class ShapeFactory extends AbstractFactory {
	public static String RECTANGLE = "RECTANGLE";
	public static String SQUARE = "SQUARE";
	public static String CIRCLE = "CIRCLE";

	   @Override
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return new Circle();
	      }        
	      if(shapeType.equalsIgnoreCase(CIRCLE)){
	         return new Circle();
	      } else if(shapeType.equalsIgnoreCase(RECTANGLE)){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase(SQUARE)){
	         return new Square();
	      }
	      return null;
	   }
	   
	   @Override
	 public  Color getColor(String color) {
	      return null;
	   }

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		return  new Circle();
	}
	}
