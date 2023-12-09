import java.util.*;

public class Lecturer
{
    private String idNumber;
    private String nameSurname;
    private ArrayList<Courses> courses;
    private int numOfCourses;
    private double salary;
    
    //Constructor
    public Lecturer(String idNumber, String nameSurname, double salary) {
        this.idNumber = idNumber;
        this.nameSurname = nameSurname;
        this.salary = salary;
        courses = new ArrayList<Courses>();
    }
    
    //Prints information of this lecturer.
    public void PrintLecturerInformation()
    {
    	System.out.println("Name: " + nameSurname + " | ID: " + idNumber + " | Salary: " + salary);
    }
    
    //Lecturer grades, given student's given course.
    public void GradeStudent(Students student,Courses course ,int grade)
    {
    	if(grade > 100)
    	{
    		System.out.println("Grade can't be greater than 100");
    		return;
    	}
    	if(student == null)
    	{
    		return;
    	}
    	
    	try
    	{
    		student.getGrades().set(findCourseIndex(student,course), grade);
    	}
    	catch(Exception e)
    	{
    		//This block works given index is -1. This means this student doesn't have that course.
    		//Console message is already written so no need to add in here.
    	}
    }
    public Students findStudentById(String id, ArrayList<Students> students, Courses course)
    {
    	boolean check1 = false, check2 = false;
    	int returnIndex = 0;
    	
    	//This for loop checks if there is a student with this id.
    	for(int i = 0; i < students.size(); i++)
    	{
    		if(students.get(i).getIdNumber() == id)
    		{
    			returnIndex = i;
    			check1 = true;
    		}
    	}
    	
    	//This for loop checks if there is a course with this course code.
    	for(int i = 0; i < courses.size(); i++)
    	{
    		if(courses.get(i).getCourseCode() == course.getCourseCode())
    		{
    			check2 = true;
    		}
    	}
    	
    	//Finally this loop checks if first 2 checks are done and if StudentId in course is equal to given id.
    	//If all conditions are met, It returns students. Else it throws an exception.
    	for(int i = 0; i < course.getStudentIds().size(); i++)
    	{
    		if(course.getStudentIds().get(i) == id && check1 && check2)
    			return students.get(returnIndex);
    	}
    	
    	System.out.println("There is no student with "+ id +" id in this course "+ course.getCourseCode()
    						+ " with this Lecturer: " + nameSurname );
    	return null;
    }
    
    //Finds course in courses list by given course code
    public Courses FindCourseByCode(String code)
    {
    	for(int i = 0; i < courses.size(); i++) 
    	{
    		if(courses.get(i).getCourseCode() == code)
    		{
    			return courses.get(i);
    		}
    	}
    	
    	System.out.println(code + " code named Course couldn't found in Lecturer's course list.");
    	return null;
    }
    
    //Finds index of course in students courseList
    private int findCourseIndex(Students student,Courses course)
    {
    	for(int i = 0; i < student.getCourses().size(); i++)
    	{
    		if(student.getCourses().get(i).getCourseCode() == course.getCourseCode())
    			return i;  // i means the index of this course in students courselist
    	}
    	
    	System.out.println("This student: " + student.getNameSurname() +" doesn't have this course:" + course.getName());
    	return -1;
    }
    
    
    //Setters
    public void setIdNumber(String idNumber)
    {
    	this.idNumber = idNumber;
    }
    public void setNameSurname(String nameSurname)
    {
    	this.nameSurname = nameSurname;
    }
    public void AddCourse(Courses course)
    {
    	if(numOfCourses >= 10)
    	{
    		System.out.println("This lecturer Access to max course number");
    		return;
    	}
    	
    	courses.add(course);
    	numOfCourses++;
    }
    
    //Getters
    public String getIdNumber()
    {
    	return idNumber;
    }
    public String getNameSurname()
    {
    	return nameSurname;
    }
    public ArrayList<Courses> getCourses()
    {
    	return courses;
    }

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
