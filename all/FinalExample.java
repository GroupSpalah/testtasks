package all;

/*Немодифицированный, final, класс*/

public class FinalExample {

    final SomeThing someThing = new SomeThing();

    public SomeThing getSomeThing() {
        return someThing;
    }

    public static void main(String[] args) {
        FinalExample finalexample = new FinalExample();
        finalexample.someThing.firstName = "Hello";
        System.out.println(finalexample.someThing.firstName);
    }

}


class SomeThing {
    public String firstName = "Name";
}
