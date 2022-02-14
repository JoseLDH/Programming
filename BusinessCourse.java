/**
 *
 * @author jose
 */
public class BusinessCourse extends Course{
    
    BusinessCourse(){
        this.setName("");
        this.setCourse("");
        this.setSurname("");
        this.setTime(0);
    }
    
    public BusinessCourse(String name, String surname, String course, String time, String student){
        this.setName(name);
        this.setCourse(course);
        this.setSurname(surname);
        
        int tm = Integer.parseInt(time);
    }
    
    public boolean Intership(int tm){
        if(tm==15){
            return true;
        }else{
            System.err.println("The duration of the intership has to be of 15 hours");
                return false;
        }
        
    }
    
    public BusinessCourse(Course other){
        name = other.name;
        surname = other.name;
        course = other.course;
        time = other.time;
    }
    
    public String toString(){
        return "The name of the course is" +getCourse()+ "and the duration of the intershup is " +getTime();
    }
    
    public BusinessCourse clone(){
        BusinessCourse clone2 = new BusinessCourse(this);
        return clone2;
    }
    
    
    
}
