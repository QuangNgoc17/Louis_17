package OOP_1_4;

public class Employee {
    int id;
    String firtsName;
    String lastName;
    int Salary;

    public Employee(int id, String firtName, String lastName, int salary) {
        this.id = id;
        this.firtsName = firtName;
        this.lastName = lastName;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return Salary;
    }
    public String getName(){
        return firtsName + lastName;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
    public int getAnnualSalary() {
        return Salary*12;
    }
    public int raiseSalary(int percent){
        return Salary+((Salary*percent)/100);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firtName='" + firtsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
