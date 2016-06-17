package all;

/*Вызов статических методов родителя и потомка*/

public class StaticChild extends StaticParent {
    public static void print() {
        System.out.println("Child: inside print");
    }

    public static void main(String[] args) {
        StaticParent staticParent = new StaticParent();
        StaticParent staticParent1 = new StaticChild();
        StaticChild staticChild = new StaticChild();
        staticParent.print();
        staticParent1.print();
        staticChild.print();
    }
}

class StaticParent {
    public static void print(){
        System.out.println("Parent: inside print");
    }
}