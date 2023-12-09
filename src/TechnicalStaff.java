//This class extends staff and creates courses
public class TechnicalStaff extends Staff
{
	
    public TechnicalStaff(String idNumber, String taskInformation, double workHour) {
        super(idNumber, taskInformation, workHour);
    }
    
    //creates course with given parameters and returns it.
    public Courses CreateCourse(String courseCode, String name, int credit, Lecturer Instructor)
    {
    	Courses course = new Courses(courseCode,name,credit,Instructor);
    	return course;
    }

}
