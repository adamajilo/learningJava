public class Shape implements Comparable<Shape> {
    // Attributes
    private double radius;
    private double width;
    private double height;
    private boolean isCircle;

    // Constants
    private static final double DEFAULT_RADIUS = 1.0;
    private static final double DEFAULT_WIDTH = 1.0;
    private static final double DEFAULT_HEIGHT = 1.0;

    // Constructors
    public Shape(double r) {
        this.isCircle = true;
        if (r >= 0) {
            this.radius = r;
        } else {
            this.radius = DEFAULT_RADIUS;
        }
    }

    public Shape(double w, double h) {
        this.isCircle = false;
        if (w >= 0) {
            this.width = w;
        } else {
            this.width = DEFAULT_WIDTH;
        }

        if (h >= 0) {
            this.height = h;
        } else {
            this.height = DEFAULT_HEIGHT;
        }
    }

    // Accessors
    public double getRadius() {
        return this.radius;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public boolean isCircle() {
        return this.isCircle;
    }

    // Mutators
    public void setRadius(double r) {
        if (isCircle) {
            if (r >= 0) {
                this.radius = r;
            } else {
                this.radius = DEFAULT_RADIUS;
            }
        }
    }

    public void setWidth(double w) {
        if (!isCircle) {
            if (w >= 0) {
                this.width = w;
            } else {
                this.width = DEFAULT_WIDTH;
            }
        }
    }

    public void setHeight(double h) {
        if (!isCircle) {
            if (h >= 0) {
                this.height = h;
            } else {
                this.height = DEFAULT_HEIGHT;
            }
        }
    }

    // toString
    @Override
    public String toString() {
        if (isCircle) {
            return "circle with radius = " + this.radius;
        } else {
            return "rectangle with width = " + this.width + " and height = " + this.height;
        }
    }

    // Area
    public double area() {
        if (isCircle) {
            return Math.PI * radius * radius;
        } else {
            return width * height;
        }
    }

    // compareTo()
    @Override
    public int compareTo(Shape that) {
        return Double.compare(this.area(), that.area());
    }
}