

package test;

import encapsulation. *;

public class TestGetSet {
    public static void main(String[] args) {
    GetSet person1 = new GetSet("Selene", 25, true); // ya no podemos acceder si no es llamando a la clase GetSet
    
    String state = person1.toString();
    
    person1.setName("Selene Muñoz");
        System.out.println(person1.getName());
        
        System.out.println(person1);
    }
    
    
    
}
