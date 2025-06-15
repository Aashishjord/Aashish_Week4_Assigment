class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    Student(String name,int rollNumber,int[] marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getRoll(){
        return rollNumber;
    }

    public void setRoll(int rollNumber){
        this.rollNumber=rollNumber;
    }

    public int[] getMarks(){
        return marks;
    }

    public void setMarks(int[] marks){
        this.marks=marks;
    }

    public double calculateAverage(){
        if(marks==null || marks.length==0){
            return 0;
        }
        double sum=0;
        for(int i=0; i<marks.length;i++){
            sum+=marks[i];
        }
        return sum/marks.length;
    }
}
class GraduateStudent extends Student {
    private String thesisTopic;

    GraduateStudent(String name,int rollNumber,int[] marks,String thesisTopic){
        super(name,rollNumber,marks);
        this.thesisTopic=thesisTopic;
    }

    public String getThesisTopic(){
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic){
        this.thesisTopic=thesisTopic;
    }

    public void printThesisTitle(){
        System.out.println("Thesis Topic:"+thesisTopic);
    }

     
}
public class GradeBook {
    public static void main(String[] args){
        int[] marks1={80,90,100};
        Student s1=new Student("Aashish Shrestha",02,marks1);
        System.out.println("Name:"+s1.getName());
        System.out.println("Rollno:"+s1.getRoll());
        System.out.println("Average Marks:"+s1.calculateAverage());



        int[] marks2={40,50,60};

        System.out.println("----------------"); //To give some space
        GraduateStudent gs=new GraduateStudent("Harry", 04, marks2,"AI in education");
        System.out.println("Name:"+gs.getName());
        System.out.println("Roll no:"+gs.getRoll());
        System.out.println("Average Marks:"+gs.calculateAverage());
        gs.printThesisTitle();


    }
}