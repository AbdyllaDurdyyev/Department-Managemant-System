import java.util.*;

public  class Students 
{
    final private String idNumber;
    final private String nameSurname;
    final private int year;
    final private String degree;
    private double GPA;
    private boolean canGraduate;
    private ArrayList<Courses> courses;
    private ArrayList<Integer> grades;
    private int numOfCourses;


    //Constructor
    public Students(String idNumber, String nameSurname, int year, String degree, double GPA) 
    {
        this.idNumber = idNumber;
        this.nameSurname = nameSurname;
        this.year = year;
		this.degree = degree;
        this.GPA = GPA;
        courses = new ArrayList<Courses>();
        grades = new ArrayList<Integer>();
    }
    
    //This function prints all the courses this student has and its GPA.
    public void printAllCourses()
    {
    	if(courses.size() == 0) //if there are no courses.
    	{
    		System.out.println(nameSurname + " named student doesn't have any courses");
    		return;
    	}
    	
    	System.out.println(nameSurname + " named student's Courses");
    	for(int i = 0; i < courses.size(); i++)
    	{
    		if(grades.get(i) == -1)
    		{
    			System.out.print((i+1) + " -> " + courses.get(i).getCourseCode() + " " + courses.get(i).getName() + " | Grade: Not Announced |");
        		System.out.println(" Instructor: " + courses.get(i).getLecturer().getNameSurname());
    		}
    		else
    		{
    			System.out.print((i+1) + " -> " + courses.get(i).getCourseCode() + " " + courses.get(i).getName() + " | Grade: " + grades.get(i));
        		System.out.println(" | Instructor: " + courses.get(i).getLecturer().getNameSurname());
    		}
    		
    	}
    	CalculateGPA();
    	System.out.println("GPA: " + getGPA());
    }
    
    //Calculates GPA with graded courses.
    public void CalculateGPA()
    {
    	double sum = 0;
    	numOfCourses = 0;
    	for(int i = 0; i < grades.size(); i++)
    	{
    		if(grades.get(i) >= 0)  //If grade is -1. It means it is not graded yet.
    		{
    			sum += grades.get(i);
    			numOfCourses++;
    		}
    	}
    	if(numOfCourses == 0)
    		numOfCourses = 1;
    	setGPA((sum / numOfCourses) / 25); 
    	
    }
    //This function adds course to courses list
    public void addCourse(Courses course) {
    	
    	if(numOfCourses >= 100) //What is MaxCourse for students? Find and put it in here
    	{
    		System.out.println("This student can not take more courses");
    		return;
    	}
    	
    	courses.add(course);
    	grades.add(-1);
    	numOfCourses++;
    }
    
    //This function is overload of addCourse function.
    public void addCourse(ArrayList<Courses> courses)
    {
    	this.courses = courses;
    }
    
    
    //GETTERS\\
    public String getIdNumber() {
        return idNumber;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public int getYear() {
        return year;
    }

	public String getDegree() {
		return degree;
	}

	public double getGPA() {
		return GPA;
	}

	public ArrayList<Courses> getCourses() {
		return courses;
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}
	
	//SETTERS\\

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}
	
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public boolean isCanGraduate() {
		return canGraduate;
	}

	public void setCanGraduate(boolean canGraduate) {
		this.canGraduate = canGraduate;
	}

	public int getNumOfCourses()
	{
		return numOfCourses;
	}


}
