import java.util.ArrayList;

//This class is an extension of staff and manages lecturers and students
public class Secretary extends Staff
{

	private ArrayList<Courses> allCourses;
	private ArrayList<Lecturer> allLecturers;
	private ArrayList<Students> allStudents;
	
	//Constructor
    Secretary(String idNumber,String taskInformation, Double workHour)
    {
        super(idNumber, taskInformation, workHour);
        allLecturers = new ArrayList<Lecturer>();
        allCourses  = new ArrayList<Courses>();
        allStudents = new ArrayList<Students>();
    }
    
    

    //Changes the lecturer of given course.
    public void ChangeLecturer(Courses course, Lecturer lecturer)
    {
    	if(lecturer == null)
    	{
    		System.out.println("Lecturer can not be found");
    		return;
    	}
    	if(course == null)
    	{
    		System.out.println("Course can not be found");
    		return;
    	}
    	course.setLecturer(lecturer);
    	lecturer.AddCourse(course);
    }
    
    //Returns lecturer by given name.
    public Lecturer AppointLecturer(String lecturerName)
    {
    	//if given lecturerName is in Lecturer database secretary appoints the lecturer.
    	for(int i = 0; i < allLecturers.size(); i++) 
    	{
    		if(allLecturers.get(i).getNameSurname() == lecturerName)
    		{
    			
    			return allLecturers.get(i);
    		}
    	}
    	
    	//if there is no one named liked that, it returns null
    	System.out.println(lecturerName + " named Lecturer couldn't found in secretary");
    	return null;
    }
    
    //Adds course to given student. And students id to given course.
    public void AddCourseToStudent(Students student, Courses course)
    {
    	if(student == null || course == null)
    	{
    		System.out.println("Adding course to Student failed");
    		return;
    	}
    	if(CheckStudentValidity(student.getIdNumber()) && CheckCourseValidity(course))
    	{
    		//if student has this course. It can not be added again.
    		if(checkIfStudentHasCourse(student,course) == true)
    			return;
    		//check if student is graduate or undergraduate later
    		student.addCourse(course);
    		course.AddStudentId(student.getIdNumber());
    		return;
    	}
    	
    	//if validity checks are false. Something went wrong.
    	System.out.println("Error: Course didn't get added to student.");
    	
    }
    
    //Checks if student has already have this course or not
    private Boolean checkIfStudentHasCourse(Students student, Courses course)
    {
    	for(int i = 0; i < student.getCourses().size(); i++)
    	{
    		if(student.getCourses().get(i) == course)
    		{
    			System.out.println(student.getNameSurname()+ " named student already has course named: " + course.getName());
    			return true;
    		}
    	}
    	return false;
    }
    //Checks if given student exists.
    private Boolean CheckStudentValidity(String studentId)
    {
    	for(int i = 0; i < allStudents.size(); i++) 
    	{
    		if(allStudents.get(i).getIdNumber() == studentId)
    		{
    			return true;
    		}
    	}
    	
    	System.out.println("Given student couldn't found in Secretary");
    	return false;
    }
    
    //Checks if given course exists.
    private Boolean CheckCourseValidity(Courses course)
    {
    	for(int i = 0; i < allCourses.size(); i++) 
    	{
    		if(allCourses.get(i).getCourseCode() == course.getCourseCode())
    		{
    			return true;
    		}
    	}
    	
    	System.out.println("Given course couldn't found in Secretary");
    	return false;
    }

    
    //GETTERS AND SETTERS
 
	public ArrayList<Courses> getAllCourses() {
		return allCourses;
	}


	public void setAllCourses(ArrayList<Courses> allCourses) {
		this.allCourses = allCourses;
	}


	public ArrayList<Lecturer> getAllLecturers() {
		return allLecturers;
	}


	public void setAllLecturers(ArrayList<Lecturer> allLecturers) {
		this.allLecturers = allLecturers;
	}
	
	public ArrayList<Students> getAllStudents() {
		return allStudents;
	}


	public void setAllStudents(ArrayList<Students> allStudents) {
		this.allStudents = allStudents;
	}
    
}
