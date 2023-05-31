import clases.Person;
import clases.Calculator;
import static java.lang.Math.*;
import clases.Rectangle;

// VARIABLES Y MÉTODOS ESTÁTICOS. MODIFICADORES DE ACCESO, (public, private)
public class Main {

    public static void main(String[] args) {
        
        Person person1 = new Person();
        person1.name = "Selene";
        person1.age = 25;
        person1.showData();
        
        Person person2 = new Person();
        person2.name = "Muñoz";
        person2.age = 24;
        person2.showData();
        
       // Calculator.PI = 3.15;
        System.out.println(Calculator.PI);
        
        System.out.println(Calculator.add(40, 50));
        
        System.out.println(PI);
        System.out.println(pow(4, 3));  
        
        Person person3 = new Person(); // se ejecuta el primer constructor
        Person person4 = new Person("Selene"); // se ejecuta el primer constructor
        
        Calculator calculate = new Calculator();
        System.out.println(calculate.subtract(50, 30));
        System.out.println(calculate.subtract(50.5, 30));
        
        Rectangle r1 = new Rectangle();
        System.out.println(r1.area(8, 4));
        System.out.println(r1.perimeter(8, 4));    
    }
}
