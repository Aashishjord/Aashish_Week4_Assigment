class Employee {
    private String name;
    private int id;
    private double baseSalary;

    Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() { //getter of Name
        return name;
    }

    public int getId() {   //getter of id
        return id;
    }

    public double getbaseSalary() { //getter of salary
        return baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getbaseSalary() + bonus;
    }
}

class Developer extends Employee {
    private double overtimeHours;
    private double rate;

    Developer(String name, int id, double baseSalary, double overtimeHours, double rate) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return getbaseSalary() + (overtimeHours * rate);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee[] emp = new Employee[]{
            new Employee("Aashish Shrestha", 10, 4000),
            new Manager("Joe Biden", 4, 6000, 100),
            new Developer("John Cena", 20, 5000, 4, 50)
        };

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].getName() + " Salary: $" + emp[i].calculateSalary());
        }
    }
}
