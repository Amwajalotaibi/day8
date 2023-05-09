public class Circle extends Shape {

    private Double radius=1.0;

   public Circle(){
   super();
    }

    public Circle(String color, boolean filled, Double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getArea(){
       return radius/2;
    }

    public double getperimeter(){
       return radius*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
