package all;

public class Child extends Parent {
    static {
        System.out.println("Static block Child");
    }

    {
        System.out.println("Not static block Child");
    }

    public Child() {
        System.out.println("Constructor Child");
    }

    static void some(String s) {
        System.out.println("Child1");
    }


    static void some() {
        System.out.println("Child2");
    }

    public static void main(String[] args) {
        Child child = new Child();
        Child.some();
        Child child1 = null;
        child1.some("");//what happened here?
    }
}

class Parent {

    static void some(String s) {
        System.out.println("Parent2");
    }

    static void some() {
        System.out.println("Parent1");
    }

    static {
        System.out.println("Static block Parent");
    }

    {
        System.out.println("Not static block Parent");
    }

    public Parent() {
        System.out.println("Constructor Parent");
    }

}
