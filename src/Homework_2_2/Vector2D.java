package Homework_2_2;

import java.util.Locale;

public class Vector2D {
    double vX, vY;
    static int count = 0;
    public Vector2D(){
        vX = 1;
        vY = 1;
        count++;
    }
    public Vector2D(double x, double y){
        vX = x;
        vY = y;
        count++;
    }
    public Vector2D(Vector2D v){
        this.vX = v.vX;
        this.vY = v.vY;
        count++;
    }
    public void print(){
        System.out.print("(");
        System.out.print(String.format(Locale.US, "%.2f", vX));
        System.out.print(", ");
        System.out.print(String.format(Locale.US, "%.2f", vY));
        System.out.print(")");
        System.out.println();
    }
    public double length(){
        if(Math.abs(vX)==1 && Math.abs(vY)==1){
            return 1;
        }else {
            return Math.sqrt(vX * vX + vY * vY);
        }
    }
    public void add(Vector2D v){
        this.vX=v.vX + vX;
        this.vY=v.vY + this.vY;
    }
    public void sub(Vector2D v){
        this.vX=vX - v.vX;
        this.vY=vY - v.vY;
    }
    public void scale(double scaleFactor){
        this.vX*=scaleFactor;
        this.vY*=scaleFactor;
    }
    public double dotProduct(Vector2D v){
        return vX*v.vX + vY*v.vY;
    }
    public void normalized(){
        vX = vX/Math.abs(vX);
        vY = vY/Math.abs(vY);
    }
}
