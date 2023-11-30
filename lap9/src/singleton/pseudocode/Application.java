package singleton.pseudocode;

import singleton.pseudocode.Database;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT student from K65A6");

        Database bar = Database.getInstance();
        bar.query("SELECT student from K65A3");

        System.out.println(foo == bar);
    }
}
