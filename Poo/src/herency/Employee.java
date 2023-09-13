
package herency;

public class Employee extends Person { // con la instruccion extends hereda desde otra clase
    
    private int idEmployee;
    private double salary;
    private static int employeeCounter;

    public Employee(double salary, String name) {
        super(name);
        this.idEmployee = ++Employee.employeeCounter;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return this.idEmployee;
    }

    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String getDetail() {
        return super.getDetail() + "Sueldo: " + this.salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("idEmployee=").append(this.idEmployee);
        sb.append(", salary=").append(this.salary);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
  
    
    
}
