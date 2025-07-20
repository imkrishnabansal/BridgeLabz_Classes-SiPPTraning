// package JavaConstructors;

class Circle {
    private double radius;

     public Circle() {
        this(1.0); 
    }
    public Circle(double radius){
        this.radius =radius;
    }

    private double getRadius(){
        return radius;
    }
    public void setradius(double radius){
        this.radius =radius;
    } 
       public double getArea() {
        return Math.PI * radius * radius;
    }
    public void displayradius(){
        System.out.println("Radius " +radius);
        System.out.println("Area: " + getArea());
    }
}

