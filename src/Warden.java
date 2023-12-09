//Warden of department. Extension of staff. Extra class
public class Warden{

    private String idNumber;
    private String taskInformation;
    private double workHour;
    private int salary;
    
    //Constructor
    public Warden(String idNumber, String taskInformation, double workHour, int salary) {
        this.setIdNumber(idNumber);
        this.setTaskInformation(taskInformation);
        this.setWorkHour(workHour);
        this.setSalary(salary);
    }
	
	//Makes salary raise by given amount to given lecturer
    public void MakeSalaryRaise(Lecturer lecturer, double raiseAmount)
    {
    	lecturer.setSalary(lecturer.getSalary() + raiseAmount);
    }
    
    //Warden gets new lecturer from another University.
    public Lecturer GetNewLecturer(String idNumber, String nameSurname, double salary)
    {
    	Lecturer lecturer = new Lecturer(idNumber,nameSurname,salary);
    	return lecturer;
    }

    //GETTERS AND SETTERS	
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getTaskInformation() {
		return taskInformation;
	}

	public void setTaskInformation(String taskInformation) {
		this.taskInformation = taskInformation;
	}

	public double getWorkHour() {
		return workHour;
	}

	public void setWorkHour(double workHour) {
		this.workHour = workHour;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
