import java.util.ArrayList;

public class Courses 
{
    private String courseCode;
    private String name;
    private int credit;
    private Areas location;
    private Lecturer Instructor;
    private ArrayList<String> studentIds;

  //Constructor 1
    public Courses(String courseCode, String name, int credit) {
        this.courseCode = courseCode;
        this.name = name;
        this.credit = credit;
        studentIds = new ArrayList<String>();
    }
  //Constructor 2
    public Courses(String courseCode, String name, int credit,Lecturer Instructor) {
        this.courseCode = courseCode;
        this.name = name;
        this.credit = credit;
        this.Instructor = Instructor;
        studentIds = new ArrayList<String>();
    }
    //Constructor 3
    public Courses(String courseCode, String name, int credit, Areas location, Lecturer lecturerInformation){
        this.courseCode = courseCode;
        this.name = name;
        this.credit = credit;
        studentIds = new ArrayList<String>();
        this.location=location;
        //this.lecturerInformation = lecturerInformation;
    }
    
    //This function adds given studentId to studentIds list
    public void AddStudentId(String studentId)
    {
    	studentIds.add(studentId);
    }
    
    //Prints all id's of students who take this course
    public void printAllStudentIds()
    {
    	System.out.println(courseCode + " " + name + " named this course is taken by: ");
    	for(int i = 0; i < studentIds.size(); i++)
    	{
    		System.out.println(studentIds.get(i));
    	}
    }
    
    //GETTERS AND SETTERS
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Areas getLocation() {
        return location;
    }

    public void setLocation(Areas location) {
        this.location = location;
    }

    public Lecturer getLecturer() {
        return Instructor;
    }

    public void setLecturer(Lecturer lecturerInformation) {
        this.Instructor = lecturerInformation;
    }
    
    public ArrayList<String> getStudentIds()
    {
    	return studentIds;
    }
}
