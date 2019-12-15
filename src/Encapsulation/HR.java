package Encapsulation;

public class HR {

    public static void main(String[] args) {

        Employee employee=new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setAge(25);
        employee.setEmployeeID("A23J09");
        employee.setSSN(123456789);
        employee.setGender('M');
        employee.setSalary(120000);

        System.out.println(employee.getAge());
    }
}
