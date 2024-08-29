public class Rectangle implements GeometricObject{
    private double length ;
    private double width;
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public String toString(){
        return "Rectangle[length="+length+",width="+width+"]";
    }
    public double getArea(){
        return 0.5*length*width;
    }
    public double getPerimeter(){
        return (2*length)+(2*width);
    }
}
