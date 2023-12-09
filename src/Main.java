import java.util.ArrayList;

//MAIN
//Eren Mert Özen 21118080018
//Abdylla Durdyyev 21118080401
//Sybat Yeskhozhayeva 21118080904
public class Main
{

	static ArrayList<Lecturer> allLecturers = new ArrayList<Lecturer>();
	static ArrayList<Courses> allCourses  = new ArrayList<Courses>();
	static ArrayList<Students> allStudents  = new ArrayList<Students>();
	static ArrayList<Classrooms> allClassrooms  = new ArrayList<Classrooms>();

    public static void main(String args[]) {
    	
    	//Staffs
    	TechnicalStaff techStaff = new TechnicalStaff("001","Course_Manager",40.0);
    	Secretary secretary = new Secretary("002","Secretary",40.0);
    	CleaningStaff cleaningStaff = new CleaningStaff("001","Cleaning Staff",40.0);
    	
    	//Warden and head of department
    	Warden warden = new Warden("000","Warden",40.0, 45000);
    	HeadOfDepartment headOfDepartment = new HeadOfDepartment("000","Ali Akcayol", 45350);

    	//Classroom initialization
    	
		//Add Classrooms by copying the line below.
    	//allClassrooms.add(new Classrooms("Name",maxCapacity,pollution));
    	allClassrooms.add(new Classrooms("402",100,0));
    	allClassrooms.add(new Classrooms("215",100,1));
    	allClassrooms.add(new Classrooms("420",100,0.4));
    	allClassrooms.add(new Classrooms("115",100,0));
    	allClassrooms.add(new Classrooms("314",100,0.35));
    	allClassrooms.add(new Classrooms("416",100,0));

		//allClassrooms.add(new Classrooms("212", 50, 1));


    	//OtherArea initialization
    	
    	Canteen canteen = new Canteen("Canteen",75,0);
    	Cafe cafe = new Cafe("Cafe",75,0);
    	Garden garden = new Garden("Garden",250,0);
    	LecturerOffice lecturerOffice = new LecturerOffice("LecturerOffice",5,0);
    	
    	//Lecturer initialization
    	
		//Add Lecturers by copying the line below.
    	//allLecturers.add(new Lecturer("LectuerId","LecturerName", salary));
    	allLecturers.add(warden.GetNewLecturer("001","Huseyin Temucin", 8750));
    	allLecturers.add(warden.GetNewLecturer("002","Oktay Yildiz", 13500));
    	allLecturers.add(warden.GetNewLecturer("003","Feyza Yildirim", 7890));
    	allLecturers.add(warden.GetNewLecturer("004","Serife Buyukkose", 12350));
    	allLecturers.add(warden.GetNewLecturer("005","Muzeyyen Sangurlu Sezen", 7800));
    	allLecturers.add(warden.GetNewLecturer("006","Mehmet Kasap", 9600));
    	allLecturers.add(warden.GetNewLecturer("007","Aysegul Şahin", 14750));
    	
    	//Course initialization
    	
    	secretary.setAllLecturers(allLecturers); //Sets lecturers in secretary
    	
		//Add courses by copying the line below.
    	//allCourses.add(techStaff.CreateCourse("CourseCode", "CourseName", 5, secretary.AppointLecturer("LecturerName")));
    	allCourses.add(techStaff.CreateCourse("BM101", "Bilgisayar Programlama 1", 5, secretary.AppointLecturer("Huseyin Temucin")));
    	allCourses.add(techStaff.CreateCourse("BM102", "Bilgisayar Programlama 2", 5, secretary.AppointLecturer("Oktay Yildiz")));
    	allCourses.add(techStaff.CreateCourse("BM305", "Bilgisayar Sistemleri", 5, secretary.AppointLecturer("Oktay Yildiz")));
    	allCourses.add(techStaff.CreateCourse("BM402", "Bilgisayar Projesi 1", 5, secretary.AppointLecturer("Feyza Yildirim")));
    	allCourses.add(techStaff.CreateCourse("BM403", "Bilgisayar Projesi 2", 5, secretary.AppointLecturer("Oktay Yildiz")));
    	allCourses.add(techStaff.CreateCourse("BM205", "Elektronik Sistemler", 5, secretary.AppointLecturer("Feyza Yildirim")));
    	allCourses.add(techStaff.CreateCourse("MAT101", "Calculus 1", 5, secretary.AppointLecturer("Muzeyyen Sangurlu Sezen")));
    	allCourses.add(techStaff.CreateCourse("MAT102", "Calculus 2", 5, secretary.AppointLecturer("Muzeyyen Sangurlu Sezen")));
    	allCourses.add(techStaff.CreateCourse("MAT202", "Lineer Cebir", 5, secretary.AppointLecturer("Serife Buyukkose")));
    	
    	
    	//This loop is for assigning courses to their lecturers.
    	for(int i = 0; i < allCourses.size(); i++)
    	{
    		secretary.ChangeLecturer(allCourses.get(i), allCourses.get(i).getLecturer());
    	}
    	//Student initialization
    	
		//Add Students by copying the line below.
    	//allStudents.add(new Students("StudentIdNumber" , "StudentName_Surname", Year , "Degree", GPA));
    	allStudents.add(new UnderGraduate("21118080401" , "Abdylla Durdyyev", 2, "Undergraduate", 2.5));
    	allStudents.add(new MasterStudent("21118080018" , "Eren Mert Ozen", 1, "Master", 3.18));
    	allStudents.add(new MasterStudent("21118080904", "Sybat Yeskhozhayeva", 2, "Master", 3.5));
    	
    	secretary.setAllCourses(allCourses); //Sets courses in secretary
    	secretary.setAllStudents(allStudents); //Sets students in secretary
        
    	//Adding Courses to students
    	secretary.AddCourseToStudent(FindStudentByName("Eren Mert Ozen"), FindCourseByCode("BM101"));
    	secretary.AddCourseToStudent(FindStudentByName("Eren Mert Ozen"), FindCourseByCode("BM102"));
    	secretary.AddCourseToStudent(FindStudentByName("Eren Mert Ozen"), FindCourseByCode("BM305"));
    	secretary.AddCourseToStudent(FindStudentByName("Eren Mert Ozen"), FindCourseByCode("BM402"));
    	secretary.AddCourseToStudent(FindStudentByName("Eren Mert Ozen"), FindCourseByCode("BM403"));
    	secretary.AddCourseToStudent(FindStudentByName("Eren Mert Ozen"), FindCourseByCode("MAT101"));
    	secretary.AddCourseToStudent(FindStudentByName("Eren Mert Ozen"), FindCourseByCode("MAT102"));
    	secretary.AddCourseToStudent(FindStudentByName("Eren Mert Ozen"), FindCourseByCode("MAT202"));
    	
    	secretary.AddCourseToStudent(FindStudentByName("Abdylla Durdyyev"), FindCourseByCode("BM101"));
    	secretary.AddCourseToStudent(FindStudentByName("Abdylla Durdyyev"), FindCourseByCode("BM102"));
		secretary.AddCourseToStudent(FindStudentByName("Abdylla Durdyyev"), FindCourseByCode("BM402"));
		secretary.AddCourseToStudent(FindStudentByName("Abdylla Durdyyev"), FindCourseByCode("MAT101"));
		secretary.AddCourseToStudent(FindStudentByName("Abdylla Durdyyev"), FindCourseByCode("MAT202"));



		secretary.AddCourseToStudent(FindStudentByName("Sybat Yeskhozhayeva"), FindCourseByCode("BM101"));
		secretary.AddCourseToStudent(FindStudentByName("Sybat Yeskhozhayeva"), FindCourseByCode("BM102"));
		secretary.AddCourseToStudent(FindStudentByName("Sybat Yeskhozhayeva"), FindCourseByCode("BM402"));
		secretary.AddCourseToStudent(FindStudentByName("Sybat Yeskhozhayeva"), FindCourseByCode("MAT101"));
		secretary.AddCourseToStudent(FindStudentByName("Sybat Yeskhozhayeva"), FindCourseByCode("MAT202"));




    	//Secretary changing Lecturers
    	secretary.ChangeLecturer(FindCourseByCode("BM101"), FindLecturerByName("Oktay Yildiz"));
    	secretary.ChangeLecturer(FindCourseByCode("BM102"), FindLecturerByName("Huseyin Temucin"));
    	
    	//Warden makes salary raise
    	FindLecturerByName("Oktay Yildiz").PrintLecturerInformation();
    	warden.MakeSalaryRaise(FindLecturerByName("Oktay Yildiz"), 2500);
    	FindLecturerByName("Oktay Yildiz").PrintLecturerInformation();
    	
    	//Lecturer changing grades of students
    	try
    	{
    		Lecturer lecturer = FindLecturerByName("Oktay Yildiz");
    		lecturer.GradeStudent(lecturer.findStudentById("21118080018", allStudents, lecturer.FindCourseByCode("BM102")),
    								lecturer.FindCourseByCode("BM102"), 100);
    		lecturer = FindLecturerByName("Huseyin Temucin");
    		lecturer.GradeStudent(lecturer.findStudentById("21118080018", allStudents, lecturer.FindCourseByCode("BM101")), 
					lecturer.FindCourseByCode("BM101"), 79);
    	}
    	catch(Exception e)
    	{

    	}
    	
    	
    	//OTHERS
    	try
    	{
    		FindCourseByCode("BM101").printAllStudentIds(); //prints student ids of course
    		FindStudentByName("Eren Mert Ozen").printAllCourses();  //prints all course of this student
    		headOfDepartment.Graduate(FindStudentByName("Eren Mert Ozen")); //Graduates given student
    		FindClassroomByName("402").StartLesson(FindCourseByCode("BM101"));  //Starts given lesson in given classroom
    		cleaningStaff.CleanArea(FindClassroomByName("402"));   //Cleans given classroom
    		
    	}
    	catch(Exception e)
    	{
    		//This section is empty
    	}

    }
    
    private static Students FindStudentByName(String name)
    {
    	for(int i = 0; i < allStudents.size(); i++) 
    	{
    		if(allStudents.get(i).getNameSurname() == name)
    		{
    			return allStudents.get(i);
    		}
    	}
    	
    	System.out.println(name +" named student couldn't found.");
    	return null;
    }
    private static Courses FindCourseByCode(String code)
    {
    	for(int i = 0; i < allCourses.size(); i++) 
    	{
    		if(allCourses.get(i).getCourseCode() == code)
    		{
    			return allCourses.get(i);
    		}
    	}
    	
    	System.out.println(code + " code named Course couldn't found.");
    	return null;
    }
    private static Lecturer FindLecturerByName(String name)
    {
    	for(int i = 0; i < allLecturers.size(); i++) 
    	{
    		if(allLecturers.get(i).getNameSurname() == name)
    		{
    			return allLecturers.get(i);
    		}
    	}
    	
    	System.out.println(name + " named Lecturer couldn't found.");
    	return null;
    }
    private static Classrooms FindClassroomByName(String name)
    {
    	for(int i = 0; i < allClassrooms.size(); i++) 
    	{
    		if(allClassrooms.get(i).getName() == name)
    		{
    			return allClassrooms.get(i);
    		}
    	}
    	
    	System.out.println(name + " named classroom couldn't found.");
    	return null;
    }

}