package all;

import java.sql.SQLException;
import java.util.List;

/*Вызов методов родителя, исключения, переопределение методов*/

public class Group extends SubGroup {


    public String name;
    private int _id;


    private Group() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void toPage(String s) {
        toPage(s);
    }

    @Override
    protected Object convert(String str, List<Integer> list) throws Exception {
        return new Object();
    }

    public static void main(String[] args) {
        Group group = new Group();
    }
}

class SubGroup {

    public void toPage(String s) {
        try {
            for (; ; ) ;
        } catch (Exception e) {
            System.out.println("Some error");
        } catch (SQLException sqlException) {
            System.out.println("Some error");
        }
    }


    protected String convert(String str, List<Integer> list) throws SQLException {
        return new String();
    }

}
