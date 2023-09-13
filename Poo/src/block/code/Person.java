package block.code;

public class Person {

    private final int idPerson;
    private static int personCounter;

    static {
        System.out.println("Ejecución bloque estático");
        ++Person.personCounter;
        // idPerson = 10;  
    }

    {
        System.out.println("Ejecución bloque no código");
        this.idPerson = Person.personCounter++;
    }

    public Person() {
        System.out.println("");
    }

    public int getIdPerson() {
        return idPerson;
    }

    @Override
    public String toString() {
        return "Person{" + "idPerson=" + idPerson + '}';
    }
    
    
    
    
}
