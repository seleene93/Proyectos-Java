package encapsulation;

public class GetSet {
    private String name;
    private int age;
    private boolean eliminated;

    public GetSet(String name, int age, boolean eliminated) {
        this.name = name;
        this.age = age;
        this.eliminated = eliminated;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public boolean isEliminated() {
        return this.eliminated;
    }
    public void setEliminated(boolean eliminated) {
        this.eliminated = eliminated;
    }

    @Override // nos permite modificar un método ya implementado en java
    public String toString() {
        return "Persona: [Nombre: %s, Edad: %d, Eliminado: %b]"
                .formatted(this.name, this.age, this,eliminated); 
    }
    
    
}
