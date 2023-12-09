//This class is an extension of lecturer
public class HeadOfDepartment extends Lecturer {

	public HeadOfDepartment(String idNumber, String nameSurname,double salary) {
		super(idNumber, nameSurname,salary);
	}
	
	
	//Graduates student if conditions are met
	public void Graduate(Students student)
	{
		switch(student.getDegree())
		{
			case "UnderGraduate": //If student is undergraduate, GPA must be bigger than 2.0 and course number must be at least 40.
			{
				if(student.getCourses().size() < 40)
				{
					System.out.println("This student doesn't have enough course to graduate. Student id: " + student.getIdNumber()
										+ " At least 40 course is needed. Course Count: " + student.getCourses().size());
					break;
				}
				if(student.getGPA() < 2.0)
				{
					System.out.println("This student doesn't have enough GPA to graduate. At least 2.0 GPA is needed"
							+ "Student id: " + student.getIdNumber() + " Student GPA: " + student.getGPA());
					break;
				}
				student.setCanGraduate(true);
				System.out.println(student.getNameSurname() + " is now graduated with " + student.getGPA() + " GPA");
				break;
			}
			case "Master": //If student is Master student, GPA must be bigger than 2.5 and course number must be at least 8.
			{
				if(student.getCourses().size() < 8)
				{
					System.out.println("This student doesn't have enough course to graduate. Student id: " + student.getIdNumber()
										+ " At least 8 course is needed. Course Count: " + student.getCourses().size());
					break;
				}
				if(student.getGPA() < 2.5)
				{
					System.out.println("This student doesn't have enough GPA to graduate. At least 2.5 GPA is needed"
							+ "Student id: " + student.getIdNumber() + " Student GPA: " + student.getGPA());
					break;
				}
				student.setCanGraduate(true);
				System.out.println(student.getNameSurname() + " is now graduated with " + student.getGPA() + " GPA");
				break;
			}
			case "Doctoral": //If student is Doctoral student, GPA must be bigger than 3.0 and course number must be at least 7.
			{
				if(student.getCourses().size() < 7)
				{
					System.out.println("This student doesn't have enough course to graduate. Student id: " + student.getIdNumber()
										+ " At least 7 course is needed. Course Count: " + student.getCourses().size());
					break;
				}
				if(student.getGPA() < 3.0)
				{
					System.out.println("This student doesn't have enough GPA to graduate. At least 3.0 GPA is needed"
							+ "Student id: " + student.getIdNumber() + " Student GPA: " + student.getGPA());
					break;
				}
				student.setCanGraduate(true); 
				System.out.println(student.getNameSurname() + " is now graduated with " + student.getGPA() + " GPA");
				break;
			}
			default: //This is debug
				System.out.println("Student's degree is in wrong format. Student's id: " + student.getIdNumber());
		}
	}

}
