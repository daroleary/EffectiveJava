package effectivejava.classesandinterfaces.prefer_class_hierarchies_to_tagged_classes;

class Square extends Rectangle {
	Square(double side) {
		super(side, side);
	}
}
