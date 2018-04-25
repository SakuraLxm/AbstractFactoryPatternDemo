package com.sakura;



import com.sakura.color.Color;
import com.sakura.factory.AbstractFactory;
import com.sakura.factory.ColorFactory;
import com.sakura.factory.FactoryProducer;
import com.sakura.factory.ShapeFactory;
/**
 * 
 * @author sakuraLxm
 *
 */
public class AbstractFactoryPatternDemo {
	   public static void main(String[] args) {
		   /**
		    * 当下流行的链式
		    */

		   FactoryProducer.getFactory("shape").getShape();
		   
		   
	      //获取形状工厂
	      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

	      //获取形状为 Circle 的对象
	      Shape shape1 = shapeFactory.getShape(ShapeFactory.CIRCLE);

	      //调用 Circle 的 draw 方法
	      shape1.draw();

	      //获取形状为 Rectangle 的对象
	      Shape shape2 = shapeFactory.getShape(ShapeFactory.RECTANGLE);

	      //调用 Rectangle 的 draw 方法
	      shape2.draw();
	      
	      //获取形状为 Square 的对象
	      Shape shape3 = shapeFactory.getShape(ShapeFactory.SQUARE);

	      //调用 Square 的 draw 方法
	      shape3.draw();

	      //获取颜色工厂
	      AbstractFactory colorFactory = FactoryProducer.getFactory("SHAPE");

	      //获取颜色为 Red 的对象
	      Color color1 = colorFactory.getColor(ColorFactory.RED);

	      //调用 Red 的 fill 方法
	      color1.fill();

	      //获取颜色为 Green 的对象
	      Color color2 = colorFactory.getColor(ColorFactory.GREEN);

	      //调用 Green 的 fill 方法
	      color2.fill();

	      //获取颜色为 Blue 的对象
	      Color color3 = colorFactory.getColor(ColorFactory.BLUE);

	      //调用 Blue 的 fill 方法
	      color3.fill();
	   }
	}
