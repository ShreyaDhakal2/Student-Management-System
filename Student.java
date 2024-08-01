//class
public class Student
{
    //declaring the instance variables
    private int enrollmentID;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateofEnrollment;
    private int courseDuration;
    private int tuitionFee;
    
    //constructor
    public Student(String dateOfBirth, String studentName, int courseDuration, int tuitionFee)
    {
         this.dateOfBirth = dateOfBirth;
         this.studentName = studentName;
         this.courseName = "";
         this.dateofEnrollment = "";
         this.enrollmentID = 0;
         this.courseDuration = courseDuration;
         this.tuitionFee = tuitionFee;
    }
    
    //accessor method 
    public int getenrollmentID()
    {
        return this.enrollmentID;
        
    }
    
    public String  getdateOfbirth()
    {
        return this.dateOfBirth;
    }
    
    public String getcourseName()
    {
        return this.courseName;
    }
    
    public String getstudentName()
    {
        return this.studentName;
    }
    
    public String getdateofEnrollment()
    {
        return this.dateofEnrollment;
    }
    
    public int getcourseDuration()
    {
        return this.courseDuration;
    }
    
    public int gettuitionFee()
    {
        return this.tuitionFee;
    }
    
    //mutator method
    public void setcourseName(String courseName)
    {
        this.courseName = courseName;
    }
    
    public void setenrollmentID(int enrollmentID)
    {
        this.enrollmentID = enrollmentID;
    }
    
    public void setdateofEnrollment(String dateofEnrollment)
    {
        this.dateofEnrollment = dateofEnrollment;
    }
    
    public void settuitionFee(int tuitionFee)
    {
        this.tuitionFee = tuitionFee;
    }
    
    public void setcourseDuration(int courseDuration)
    {
        this.courseDuration = courseDuration;
    }
    
    public void setstudentName(String studentName)
    {
        this.studentName = studentName;
    }
    
    public void setdateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
    
    
    /* this method projects an error message in case any empty field is found. Also, displays the values of the variables entered
    by the user */
    public void display()
    {
        //checking if any empty field is found
        if(this.courseName == ("") || this.dateofEnrollment == ("") ||  this.dateOfBirth == ("") || this.studentName == (""))
        {
            System.out.println("Empty fields found. Please recheck before trying again!");
        }
        
        //printing the values if  empty field is not found
        else
        {
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course Name: " + courseName);
            System.out.println("Date of Enrollment: " + dateofEnrollment);
            System.out.println("Enrollment Id: " + enrollmentID);
            System.out.println("Course Duration: " + courseDuration);
            System.out.println("Tuition Fee: " + tuitionFee);
        }
    }
}