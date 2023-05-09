// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //circle
    Circle s1=new Circle("reed",true, 4.0);
        System.out.println("The radius is : "+s1.getRadius());
        System.out.println("The Area is : "+s1.getArea());
        System.out.println("The perimeter is : "+s1.getperimeter());

       // Rectangle
        Rectangle r1=new Rectangle(5.0,3.7);
        Rectangle r2=new Rectangle("black",false,2.0,4.0);
        System.out.println("The width is : "+r1.getWidth());
        System.out.println("The length is : "+r1.getLength());
        System.out.println("The perimeter is : "+r1.getPerimeter());
        System.out.println("The Area is : "+r1.getArea());

        //Square
        Square q1=new Square(2.7);
        Square q2 =new Square("green",false,44.0);
        System.out.println("The is side : "+q1.getSide());
        System.out.println(q2.getSide());



    }
}