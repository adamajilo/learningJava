//Attributes
Private double radius;
Private double width;
Private double height;
Private Boolean isCircle;

//Constants
Private static final double DEFAULT_RADIUS = 1;
Private static final double DEFAULT_WIDTH = 1;
Private static final double DEFAULT_HEIGHT = 1;

//Constructors
 public Shape(double r) {

    isCircle = true;
    if (r >= 0) {
        this.radius = r;
    }else{
        this.radius = DEFAULT_RADIUS;
    }
public Shape(double w, double h) { 

isCircle = false;
    if (w >= 0) {
        this.width = w;
    }else{
        this.width = DEFAULT_WIDTH;
    }

isCircle = false;
    if (h >= 0) {
        this.height = h;
    }else{
        this.height = DEFAULT_HEIGHT;
    }
}

//Accessors...
public double getRadius() {
    return this.radius;
}

//Mutator
public void setRadius (double r){
if (isCircle){
if (r >= 0) {
        this.radius = r;
    }else{
        this.radius = DEFAULT_RADIUS;
}
}

public void setWidth (double w){
if (!isCircle){
if (w >= 0) {
        this.width = w;
    }else{
        this.width = DEFAULT_WIDTH;
}
}

public void setHeight (double h){
if (!isCirlce) {
if (h >= 0) {
        this.height = h;
    }else{
        this.height = DEFAULT_HEIGHT;
    }
}

//toString
    public String toString (){
    if (isCircle){
        return "circle with radius = " + this.radius;
    }else{
        return 



