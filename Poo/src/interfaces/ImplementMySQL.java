
package interfaces;

public class ImplementMySQL implements DataBase{

    @Override
    public void insert() {
        System.out.println("Se insertó un dato");
    }

    @Override
    public void toList() {
        System.out.println("Listando datos...");
    }

    @Override
    public void actualize() {
        System.out.println("Actualizando datos");
    }

    @Override
    public void delete() {
        System.out.println("Se eliminó un dato");
    }
    
}
