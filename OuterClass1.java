// Inner Class-- A Class within a class
public class OuterClass1 {
    int a = 10; // instance variable

    class InnerClass {
        int b = 20; // Instance variable inside InnerClass
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        OuterClass1 outer = new OuterClass1();
        OuterClass1.InnerClass inner = outer.new InnerClass();

        System.out.println("Value of a from OuterClass1: " + outer.a);
        System.out.println("Value of b from InnerClass: " + inner.b);
    }
}
