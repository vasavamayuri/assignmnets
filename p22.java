/*Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call 1 - method of parent class by object of parent class 2 - method of child class by object of child class 3 - method of parent class by object of child class */
class parent{
    void print()
    {
        System.out.println("This is parent class");
    }
}
class child{
    void print1()
    {
        System.out.println("This is child class");
    }
}
public class p22 {
    public static void main(String[] args) {
        parent obj=new parent();
        obj.print();
        child obj1=new child();

        obj1.print1();
    }

    
}
