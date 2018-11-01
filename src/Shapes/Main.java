package Shapes;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(new Point(0, 0), 1, Color.BLACK);
		Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 0), new Point(0, 1), Color.RED);
		Square square = new Square(new Point(5, 5), 2, Color.GREEN);
		
		//Shape shape = triangle;
		Object object = triangle;
		triangle = (Triangle) object;
		Shape[] shapes = {circle, triangle, square};
		printArrayElements(shapes);
		System.out.println("Shape with maximum area: " + findShapeWithMaxArea(shapes));
	}
	
	private static void printArrayElements(Object[] objects) {
		System.out.println(Arrays.toString(objects));
	}
	
	private static Shape findShapeWithMaxArea(Shape[] shapes) {
		Shape maxShape = null;
		double maxArea = Double.NEGATIVE_INFINITY;
		for (Shape shape: shapes) {
			double area = shape.getArea();
			if (area > maxArea) {
				maxArea = area;
				maxShape = shape;
			}
		}
		return maxShape;
	}
}
