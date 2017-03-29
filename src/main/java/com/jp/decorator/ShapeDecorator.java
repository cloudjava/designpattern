package com.jp.decorator;

public class ShapeDecorator implements Shape {

	protected Shape decoratorShape;
	public ShapeDecorator(Shape shape){
		decoratorShape=shape;
	}
	@Override
	public void draw() {
		decoratorShape.draw();
		System.out.println("paint the red color");
	}

}
