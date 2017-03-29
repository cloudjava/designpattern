package com.jp.decorator;
/**
 * Decorator allows user to add new functionalities(painting red) to an existing object(shape) without altering its structure
 * in this case,we have a shape interface with draw method.
 * the circle and rectangle implement the draw method.
 * now,a requirement is paint red color for the shape, but do not change shape itself
 * so we should create a decorator for shape ,and implement color painting in the decorator
 * @author wesley
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Shape circle=new Circle();
		Shape sd=new ShapeDecorator(circle);
		sd.draw();
		
		Shape rectangle=new Rectangle();
		sd=new ShapeDecorator(rectangle);
		sd.draw();
	}

}
