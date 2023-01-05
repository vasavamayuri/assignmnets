/*Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square. */

public class p21 {
    void area(float length , float breadth)
    {
        System.out.println("Area of Rectangle is" + length*breadth);
    }

    void area(float s)
    {
        float area=4*s;
        System.out.println("Area of Square is" +area);
    }
    public static void main(String[] args) {
        p21 obj=new p21();
        obj.area(4,5);
        obj.area(8);
    }

}
