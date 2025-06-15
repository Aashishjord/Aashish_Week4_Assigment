class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void getRoleDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Subclass: Student
class Student extends Person {
    private String program;

    public Student(String name, int id, String program) {
        super(name, id);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    @Override
    public void getRoleDetails() {
        super.getRoleDetails();
        System.out.println("Role: Student");
        System.out.println("Program: " + program);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void getRoleDetails() {
        super.getRoleDetails();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Admin extends Person {
    private String department; 

    public Admin(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void getRoleDetails() {
        super.getRoleDetails();
        System.out.println("Role: Admin");
        System.out.println("Department: " + department);
    }
}

// Main class
public class UniversitySystem {
    public static void main(String[] args) {   //Im not using for loop in this case
        Student student = new Student("John cena", 101, "Computer Science");
        Teacher teacher = new Teacher("Randy Ortan", 201, "Mathematics");
        Admin admin = new Admin("Undertaker", 301, "Admissions");

        student.getRoleDetails();
        System.out.println("------------"); //To make more attractive
        teacher.getRoleDetails();
        System.out.println("------------");
        admin.getRoleDetails();
    }
}
