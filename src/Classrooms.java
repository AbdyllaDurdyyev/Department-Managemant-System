import java.util.*;

//This class uses Areas' functions
public class Classrooms extends Areas{

	
	private ArrayList<Students> students;
	private Lecturer lecturer;
	
	//Constructor
	public Classrooms(String name, int capacity, double pollution) {
		super(name, capacity, pollution);
		students = new ArrayList<Students>();
	}
	
	//Starts given course in this classroom.
	public void StartLesson(Courses course)
	{
		if(getPollution() >= 0.85) //if classroom is dirty. Lesson can not be started
		{
			System.out.println("This classroom: " + getName() + " is dirty. It needs to be cleaned.");
			return;
		}
		setClassroom(course);
		IncreasePollution(0.3);
		System.out.println(course.getName() + " lesson with lecturer " + lecturer.getNameSurname() + " is started in " + getName());
		
	}
	
	//Gets student and lecturer information in given course.
	private void setClassroom(Courses course)
	{
		//cleans classroom
		students.clear();
		
		for(int i = 0; i < course.getStudentIds().size(); i++)
		{
			students.add(findStudent(course.getStudentIds().get(i)));
			EnterArea(students.get(i));
		}
		
		setLecturer(course.getLecturer());
		EnterArea(lecturer);
		
	}
	
	//Finds given student in student database in Main class.
	private Students findStudent(String id)
	{
		for(int i = 0; i < Main.allStudents.size(); i++) 
    	{
    		if(Main.allStudents.get(i).getIdNumber() == id)
    		{
    			return Main.allStudents.get(i);
    		}
    	}
		
		System.out.println(id +" student couldn't found.");
		return null;
	}
	//GETTERS AND SETTERS

	public ArrayList<Students> getStudents() {
		return students;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}


}
