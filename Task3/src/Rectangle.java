public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;


    public Rectangle(){

    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

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
