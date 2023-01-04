import Exceptions.EmployeeInRegistryException;
import Exceptions.FieldLengthLimitException;
import Exceptions.IncorrectSalaryException;

import java.util.Objects;

public class Employee {

    protected int id;
    protected static int nextid = 1;
    protected String name;
    protected String surname;
    protected double salary;

    public Employee() {}

    public Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException, EmployeeInRegistryException {
        this.id = nextid++;

        if(name.length()>15 || surname.length()>15){
            throw new FieldLengthLimitException("ID" + id + ": Name must be less then 15 symbols");
        } else {
            this.name = name;
            this.surname = surname;
        }

        if(salary <= 0){
            throw new IncorrectSalaryException("ID" + id + ": Salary must be a positive number");
        } else {
            this.salary = salary;
        }
    }

   public String toString(){
        return("ID" + id + ": Name - " + name + "; Surname - " + surname + "; Salary - "+ salary);
   }

    @Override
    public int hashCode(){
        return Objects.hash(id, name, surname, salary);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Employee emp = (Employee) o;
        return Double.compare(emp.salary, salary) == 0 && Objects.equals(name, emp.name) && Objects.equals(surname, emp.surname);
    }
}
