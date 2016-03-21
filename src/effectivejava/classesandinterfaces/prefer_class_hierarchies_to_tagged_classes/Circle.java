package effectivejava.classesandinterfaces.prefer_class_hierarchies_to_tagged_classes;

class Circle extends Figure {
	final double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	double area() {
		return Math.PI * (radius * radius);
	}
}
