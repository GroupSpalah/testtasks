package all;

/*Название переменных, String pool*/

public class student extends Object/*, String*/ {

    private String $_Name;

    private String 9_Name;

    public student() {

    }


    public static void Main(String[] args) {

    }

}


class StringPool {
    public static void main(String[] args) {
        String s1 = "Fun";
        String s2 = "Fun";
        String s3 = new String("Fun");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s3.intern());
    }
}
