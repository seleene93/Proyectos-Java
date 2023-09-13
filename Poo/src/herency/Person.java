
package herency;

import java.util.Objects;


public class Person {
    protected String name; // cuando los atributos van a ser heredados los declaramos con protected
    protected char gender;
    protected int age;
    protected String address;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, char gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }
    
    public String getDetail() {
        return "Nombre: %s Edad: %d ".formatted(this.name, this.age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("name=").append(this.name);
        sb.append(", gender=").append(this.gender);
        sb.append(", age=").append(this.age);
        sb.append(", address=").append(this.address);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.gender;
        hash = 29 * hash + this.age;
        hash = 29 * hash + Objects.hashCode(this.address);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.gender != other.gender) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.address, other.address);
    }

    
    
    
    
    
}
