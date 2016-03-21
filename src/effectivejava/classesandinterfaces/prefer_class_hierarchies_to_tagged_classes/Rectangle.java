package effectivejava.classesandinterfaces.prefer_class_hierarchies_to_tagged_classes;

class Rectangle extends Figure {
	final double length;
	final double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	double area() {
		return length * width;
	}
}
