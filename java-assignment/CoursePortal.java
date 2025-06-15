class Course {
    private String title;
    private int duration;
    private String instructor;

    Course(String title, int duration, String instructor){
        this.title=title;
        this.duration=duration;
        this.instructor=instructor;
    }

    public String getTitle(){
        return title;
    }

    public int getDuration(){
        return duration;
    }

    public String getInstructor(){
        return instructor;
    }

    public void getCourseInfo(){
        System.out.println("Title:"+getTitle());
        System.out.println("Duration:"+getDuration()+" hrs");
        System.out.println("Instructor:"+getInstructor());

    }
}
class LiveCourse extends Course {
    private String scheduleTime;  //I'm using this as a string because i want to add : and pm or am after the time

    LiveCourse(String title,int duration, String instructor,String scheduleTime){
        super(title,duration,instructor);
        this.scheduleTime=scheduleTime;
    }

    public String getScheduleTime(){
        return scheduleTime;
    
    }

    @Override 
    public void getCourseInfo(){
        super.getCourseInfo();
        System.out.println("Scheduled Time:"+getScheduleTime());
    }
}

class RecordedCourse extends Course {
    private int videoCount;

    RecordedCourse(String title,int duration,String instructor,int videoCount){
        super(title,duration,instructor);
        this.videoCount=videoCount;
    }

    public int getvideoCount(){
        return videoCount;
    }

    @Override
    public void getCourseInfo(){
        super.getCourseInfo();
        System.out.println("Total Videos:"+getvideoCount());

    }

    
}
public class CoursePortal {
    public static void main(String[] args){
        Course[] cr=new Course[]{
            new Course("Market Analysis",4,"MR.Rochak Sharma"),
            new LiveCourse("Financial Analysis",10,"Dr.Roshan Thapa","4:00 Clock"),
            new RecordedCourse("Video Editing",23,"Aashish Shrestha",4)
        };

        for(int i=0;i<cr.length;i++){
            cr[i].getCourseInfo();
            System.out.println("-----------"); //To make it more attractive and add space
        }
    }
}