package Homework_2_6;

interface Moveable {
    void move(float dx, float dy);
    void resize(float koeff);
}

public abstract class Figure {
    float x,y;
    public Figure(float x, float y){
        this.x = x;
        this.y = y;
    }
    public abstract String getArea();
    public abstract String getPerimeter();
}

public class Rectangle extends Figure implements Moveable {
    float height;
    float width;
    public Rectangle(float x, float y, float height, float width){
        super(x, y);
        this.height = height;
        this.width = width;
    }
    @Override
    public String getArea(){
        return height*width + "";
    }
    @Override
    public String getPerimeter(){
        return (height+width)*2 + "";
    }
    @Override
    public void move(float dx, float dy) {
        this.x = this.x+dx;
        this.y = this.y+dy;
    }

    @Override
    public void resize(float koeff) {
        this.width = this.width*koeff;
        this.height = this.height*koeff;

    }
    @Override
    public String toString(){
        return "Rectangle"+"\n"+"Center: (" + this.x + "," + this.y + ")" + "\n" + "Height: "+this.height +"\n" + "Width:" +this.width;
    }
}
public class Circle extends Figure implements Moveable{
    float radius;
    public Circle(float x, float y, float radius){
        super(x, y);
        this.radius = radius;
    }
    @Override
    public String getArea(){
        return Math.PI*radius*radius + "";
    }
    @Override
    public String getPerimeter(){
        return 2*Math.PI*radius + "";
    }

    @Override
    public void move(float dx, float dy) {
        this.x = this.x+dx;
        this.y = this.y+dy;
    }

    @Override
    public void resize(float koeff) {
        this.radius = this.radius*koeff;
    }
    @Override
    public String toString(){
        return "Circle"+"\n"+"Center: (" + this.x + "," + this.y + ")" + "\n" + "Radius: "+this.radius;
    }
}


public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10, 10, 1);
        Rectangle rectangle = new Rectangle(10, 10, 1, 1);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
    }
}
