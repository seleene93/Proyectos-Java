
package test;
import interfaces.*;

public class TestInterface {
    public static void main(String[] args) {
        DataBase data = new ImplementMySQL();
        data.insert();
    }
}
