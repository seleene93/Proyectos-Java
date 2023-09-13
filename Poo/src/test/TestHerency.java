
package test;
import herency.*;
import java.util.Date;

public class TestHerency {
    public static void main(String[] args) {
       
        Employee employee = new Employee(1000, "Selene");
        imprimer(employee);
        
        var date = new Date(); // fecha actual de hoy día
        Client client = new Client(date, true, "Tomás", 'M', 60, "Aldea");
        imprimer(client);
        
        determineType(employee);
        
        // Conversión de objetos 
        
        // Downcasting
        // tipo persona a tipo empleado, de clase padre a hija 
        Person person1 = new Employee(3000, "Bruno Quiroga");
        Employee employee1 = (Employee) person1;
        System.out.println(employee1.getDetail());
        
        // Upcasting 
        // tipo empleado a tipo persona
        Person person2 = employee1;
        System.out.println(person2.getDetail());
        
        Person p1 = new Person("Melanie", 'F', 27, "Minas");
        Person p2 = new Person("Melanie", 'F', 27, "Minas");
       
        System.out.println(p1.equals(p2)); // hay que implementarlo
        System.out.println(p1.hashCode()); // genera los números idénticos porque los objetos son idénticos
        System.out.println(p2.hashCode());
    }
    
    public static void imprimer(Person person) {
        System.out.println(person.getDetail());
    }
    
    
    // Las comparaciones se hacén de menos genérica a mas genérica, de clase a superclase
    public static void determineType(Object object) {
        if (object instanceof Employee) { // si el objeto es de tipo Employee
            System.out.println("Es de tipo 'Employee'");
        } else if (object instanceof Client) { // si el objeto es de tipo Client
            System.out.println("Es de tipo 'Client'");
        } else if (object instanceof Person) { // si el objeto es de tipo Person
            System.out.println("Es de tipo 'Person'");
        } else if (object instanceof Object) {
            System.out.println("Es de tipo 'Object");
        }
    }
}
