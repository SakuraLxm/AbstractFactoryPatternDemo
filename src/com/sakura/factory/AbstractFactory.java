package com.sakura.factory;

import com.sakura.Shape;
import com.sakura.color.Color;
/**
 * 
 * @author sakuraLxm
 *Ϊ Color �� Shape ���󴴽�����������ȡ������
 */
public abstract class AbstractFactory {
	   public abstract Color getColor(String color);
	   public   abstract Shape getShape() ;
	   public abstract Shape getShape(String shapeType) ;
}