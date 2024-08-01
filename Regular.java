public class Regular extends Student
{
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;
    
    //constructor 
    public Regular(int enrollmentID, String dateOfBirth, String courseName, String studentName, String dateofEnrollment,
    int courseDuration, int tuitionFee, int numOfModules, int numOfCreditHours, double daysPresent)
    {
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        setcourseName(courseName);
        setdateofEnrollment(dateofEnrollment);
        setenrollmentID(enrollmentID);
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        isGrantedScholarship = false; 
    }
    
    //accessor method
    public int getnumOfModules()
    {
        return this.numOfModules;
    }
    
    public int getnumOfCreditHours()
    {
        return this.numOfCreditHours;
    }
    
    public double getdaysPresent()
    {
        return this.daysPresent;
    }
    
    public boolean getisGrantedScholarship()
    {
        return this.isGrantedScholarship;
    }
    
         
    public char presentPercentage(double daysPresent)
    { 
        double presentPercentage =((daysPresent/30)/getcourseDuration()) * 100;
        
        if((daysPresent/30) > getcourseDuration() )
        {
            System.out.println("Error in the number of Days present! Please recheck before trying again");
            return ' ';
        }
        
        else
        {
            if(presentPercentage >= 80 && presentPercentage <= 100)
            {
                isGrantedScholarship = true;
                System.out.println("Your grade is A");
                return 'A';
            }
            
            else if(presentPercentage >= 60 && presentPercentage <= 79)
            {
                isGrantedScholarship = false; 
                System.out.println("Your grade is B");
                return 'B';
            }
            
            else if(presentPercentage >= 40 && presentPercentage <= 59)
            {
                isGrantedScholarship = false; 
                System.out.println("Your grade is C");
                return 'C';
            }
            
            else if(presentPercentage >= 20 && presentPercentage <= 39)
            {
                isGrantedScholarship = false; 
                System.out.println("Your grade is D");
                return 'D';
            }
            
            else
            {
                isGrantedScholarship = false; 
                System.out.println("Your grade is E");
                return 'E';
            }
        }
    }
    
    public void grantCertificate(String dateofEnrollment, int enrollmentID, String courseName)
    {
        if(isGrantedScholarship == true)
        {
            System.out.println("The scholarship has been Granted");
            System.out.println("Congratulations! You've graduated.");
            System.out.println("The Enrollment Id is: " + getenrollmentID());
            System.out.println("The Course Name is: " + getcourseName());
            System.out.println("The Date of Enrollment is: " + getdateofEnrollment());
        }
            
        else
        {
            System.out.println("Congratulations! You've graduated.");
            System.out.println("The Course Name is: " + getcourseName());
            System.out.println("The Enrollment Id is: " + getenrollmentID());
            System.out.println("The Date of Enrollment is: " + getdateofEnrollment());
        }
    }
    
    //display method
    public void display()
    {
        if(isGrantedScholarship == true)
        {
            super.display();
            System.out.println("Number of Modules: " + numOfModules);
            System.out.println("Number of Credit Hours: "+numOfCreditHours);
            System.out.println("Days Present : "+daysPresent);
            System.out.println("The scholarship has been granted");
        }
        
        else
        {
            super.display();
            System.out.println("The scholarship has not been granted.");
        }
    }
}