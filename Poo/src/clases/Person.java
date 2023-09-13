package clases;


public class Person {
   public String name;
   public int age; // public para poder acceder a las variables desde otros paquetes o clases cuando importemos
   
   // CONSTRUCTORES
   public Person() { // creamos constructores para que a la hora de instanciar el objeto se ejecute el método
       System.out.println("Construyendo el objeto");
   }
   
   public Person(String name) {
       System.out.println("Hola " + name + " desde el constructor");
   }
    
   public void showData() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad " + age);
    }
}
