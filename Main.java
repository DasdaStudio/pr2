import Exceptions.EmployeeInRegistryException;
import Exceptions.FieldLengthLimitException;
import Exceptions.IncorrectSalaryException;

public class Main {
    public static void main(String[] args){

        Registry hr = Registry.getRegistry();

        Employee emp1 = null;
        try{
            emp1 = new Employee("Aria", "Stark", 1500);
            System.out.println(emp1);
            hr.addWorker(emp1);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        Manager emp2 = null;
        try{
            emp2 = new Manager("John", "Snow", 4500, 100);
            System.out.println(emp2);
            hr.addWorker(emp2);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        Employee emp3 = null;
        try{
            emp3 = new Employee("Daenerys", "Targaryen", 4500);
            System.out.println(emp3);
            hr.addWorker(emp3);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        Employee emp4 = null;
        try{
            emp4 = new Employee("Daenerys", "Targaryen", 4500);
            System.out.println(emp4);
            hr.addWorker(emp4);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeInRegistryException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nEmployee List:");
        hr.printList();
    }
}
