class Patient {
    private String name;
    private int age;


    Patient(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void getTreatmentPlan(){
        System.out.println("Patient Treatment plan.");
    }

}

class InPatient extends Patient {
    private int roomNumber;

    InPatient(String name,int age,int roomNumber){
        super(name,age);
        this.roomNumber=roomNumber;
    }

    public int getroomNumber(){
        return roomNumber;
    }

    @Override
    public void getTreatmentPlan(){
         System.out.println("InPatient Treatment Plan:");
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Room Number:"+getroomNumber());
        System.out.println("Regular Monitoring, Healthy food Services.");
    }

}

class OutPatient extends Patient {
    private String appointmentDate;

    OutPatient(String name, int age,String appointmentDate){
        super(name,age);
        this.appointmentDate=appointmentDate;
    }

    public String getAppointmentDate(){
        return appointmentDate;
    }

    @Override
    public void getTreatmentPlan(){
        System.out.println("OutPatient Treatment Plan:");
         System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Appointment Date:"+getAppointmentDate());
        System.out.println("Prescribed medicines, Suggestions and Feedbacks.");

    }

}

public class HospitalRecords {
    public static void main(String[] args){
        Patient[] pt=new Patient[]{
            new InPatient("Rohan", 19, 404),
            new OutPatient("Nefun", 20, "2025-03-01")
        };

        for(int i=0; i<pt.length;i++){
            pt[i].getTreatmentPlan();
            System.out.println("-------------");
        }

    }
}