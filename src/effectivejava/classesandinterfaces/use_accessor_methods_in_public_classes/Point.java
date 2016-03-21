package effectivejava.classesandinterfaces.use_accessor_methods_in_public_classes;

// Encapsulation of data by accessor methods and mutator
// Also note class is package-private
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
	this.x = x;
	this.y = y;
    }

    public double getX() {
	return x;
    }

    public void setX(double x) {
	this.x = x;
    }

    public double getY() {
	return y;
    }

    public void setY(double y) {
	this.y = y;
    }
}
