package all;

/*Вложенные классы*/

public class OuterClass {

    private static String string;

    private static class StaticInnerClass {
        public static final String s= string;
        public void some(){}
    }
}
