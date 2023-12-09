//Abstract class of staffs
public abstract class Staff 
{
	
    private String idNumber;
    private String taskInformation;
    private double workHour;

    
    //Constructor
    public Staff(String idNumber, String taskInformation, double workHour) {
        this.idNumber = idNumber;
        this.taskInformation = taskInformation;
        this.workHour = workHour;
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

}
