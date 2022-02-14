
/**
 *
 * @author jose
 */
public class Course {
    public String course, name, surname;
    public int time;
    
    public Course(){
        course=name=surname="";
        time=0;
    }
    
    public Course(String course, String name, String surname, int time){
        if(CourseName(course){
            this.course = course;
        }
        
        if(TeacherName(name, surname){
            this.name = name;
            this.surname = surname;
        }
        
        if(CourseID(course){
            this.course = course;
        }
           
        if(CourseTime(time){
            this.time = time;
        }
           }
        
           
    
    public boolean CourseName(String course){
        if(course.length()<=4){
        return true;
    }else{
    System.err.println("The allowed number of characters if 4");
    return false;
        }
    }
    
    public String TeacherName(String name, String surname){
        return ("The name of the teacher is" +name+ "," +surname);
        
    }
    
    public String CourseID(String course){
        if(course.equals(course.substring(0)) && (course.equals(name.substring(3))));
        return course;
    }
    
    public boolean CourseTime(int time){
        if(time==30){
            return true;
        }else{
            return false;
        }
    }
    
    public String getCourse(){
        return course;
    }
    
    public void setCourse(String c){
        course = c;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String na){
        name = na;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void setSurname(String sn){
        surname = sn;
    }
    
    public int getTime(){
        return time;
    }
    
    public void setTime(int tm){
        time = tm;
    }
    
    public String toString(){
        return "The name of the course is" +course+ ", his duration is" +time+ "hours and the teacher is" +name +surname;
    }
    
    public Course clone(){
        Course clone = new Course();
        return clone;
    }
    
    
    
    
}


   
