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
		    * �������е���ʽ
		    */

		   FactoryProducer.getFactory("shape").getShape();
		   
		   
	      //��ȡ��״����
	      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

	      //��ȡ��״Ϊ Circle �Ķ���
	      Shape shape1 = shapeFactory.getShape(ShapeFactory.CIRCLE);

	      //���� Circle �� draw ����
	      shape1.draw();

	      //��ȡ��״Ϊ Rectangle �Ķ���
	      Shape shape2 = shapeFactory.getShape(ShapeFactory.RECTANGLE);

	      //���� Rectangle �� draw ����
	      shape2.draw();
	      
	      //��ȡ��״Ϊ Square �Ķ���
	      Shape shape3 = shapeFactory.getShape(ShapeFactory.SQUARE);

	      //���� Square �� draw ����
	      shape3.draw();

	      //��ȡ��ɫ����
	      AbstractFactory colorFactory = FactoryProducer.getFactory("SHAPE");

	      //��ȡ��ɫΪ Red �Ķ���
	      Color color1 = colorFactory.getColor(ColorFactory.RED);

	      //���� Red �� fill ����
	      color1.fill();

	      //��ȡ��ɫΪ Green �Ķ���
	      Color color2 = colorFactory.getColor(ColorFactory.GREEN);

	      //���� Green �� fill ����
	      color2.fill();

	      //��ȡ��ɫΪ Blue �Ķ���
	      Color color3 = colorFactory.getColor(ColorFactory.BLUE);

	      //���� Blue �� fill ����
	      color3.fill();
	   }
	}
