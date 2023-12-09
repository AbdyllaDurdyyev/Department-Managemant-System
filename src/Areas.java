import java.util.*;

public abstract class Areas
{
	private String name;
	private int maxCapacity;
	private int currentCapacity;
	private double pollution;  //A value between 0-1. 0 is clean, 1 is very dirty.
	
	private ArrayList<String> Ids;
	
	public Areas(String name, int maxCapacity, double pollution)
	{
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.pollution = pollution;
		Ids = new ArrayList<String>();
	}
	
	//Enter Area student version. When this function is called a student enters this place.
	public void EnterArea(Students student)
	{
		
		if(isUtilizable() == false)
		{
			System.out.println( name + " area is full! ");
			return;
		}
		if(isStudentInArea(student.getIdNumber()) == true)
		{
			System.out.println(student.getNameSurname() + " is already in " + name +" area!");
			return;
		}
		
		
		Ids.add(student.getIdNumber());
		System.out.println(student.getNameSurname() + " has entered " + name);
	}
	
	//Enter Area lecturer version. When this function is called a lecturer enters this place.
		public void EnterArea(Lecturer lecturer)
		{
			
			if(isUtilizable() == false)
			{
				System.out.println( name + " area is full! ");
				return;
			}
			if(isStudentInArea(lecturer.getIdNumber()) == true)
			{
				System.out.println(lecturer.getNameSurname() + " is already in " + name +" area!");
				return;
			}
			
			
			Ids.add(lecturer.getIdNumber());
			System.out.println(lecturer.getNameSurname() + " has entered " + name);
		}
	
	//Checks if this area is full.
	public boolean isUtilizable(){
		if (currentCapacity < maxCapacity){
			return true;
		}
		else return false;
	}
	
	//Checks if student is already in area
	public boolean isStudentInArea(String studentId)
	{
		for(int i = 0; i < Ids.size(); i++)
		{
			if(Ids.get(i) == studentId)
				return true;
		}
		
		return false;
	}
	
	//Increases pollution
	public void IncreasePollution(double pollutionAmount)
	{
		double newPollution = getPollution() + pollutionAmount;
		setPollution(newPollution);
	}
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}

	public double getPollution() {
		return pollution;
	}
	public void setPollution(double pollution) {
		this.pollution = pollution;
	}

	public ArrayList<String> getIds() {
		return Ids;
	}

	
	
	
	


}
