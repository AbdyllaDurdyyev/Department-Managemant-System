//This class is for cleaning areas
public class CleaningStaff extends Staff
{
	
    CleaningStaff(String idNumber,String taskInformation, Double workHour) {
        super(idNumber, taskInformation, workHour);
    }
    
    
    //Cleans the given area. Reduces it's pollution to 0.
    public void CleanArea(Areas area)
    {
    	//To-do area gets dirty. Cleaning staff cleans it.*
        if (area.getPollution()==0){
            System.out.println("This area is already clean");
        }
        else if(area.getPollution()>0 && area.getPollution()<=1) {
            area.setPollution(0);
            System.out.println(area.getName() + " area has been cleaned");
        }
    }
}
