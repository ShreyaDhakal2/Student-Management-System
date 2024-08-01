//class name 
public class Dropout extends Student
{
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    
    //constructor
    public Dropout(String dateOfBirth, String studentName, int courseDuration, int tuitionFee, int numOfRemainingModules,
    int numOfMonthsAttended, String dateOfDropout, String courseName, int enrollmentID, String dateofEnrollment)
    {
        super(dateOfBirth,studentName,courseDuration,tuitionFee);
        setcourseName(courseName);
        setenrollmentID(enrollmentID);
        setdateofEnrollment(dateofEnrollment);
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        hasPaid = false;
    }                                                                                                                       
    
    //accessor method is defined here
    public int getnumOfRemainingModules()
    {
        return this.numOfRemainingModules;
        
    }
    
    public int getnumOfMonthsAttended()
    {
        return this.numOfMonthsAttended;
        
    }
    
    public String getdateOfDropout()
    {
        return this.dateOfDropout;
        
    }
    
    public int getremainingAmount()
    {
        return this.remainingAmount;
        
    }
    
    public boolean gethasPaid()
    {
        return this.hasPaid;
        
    }
    
    //mutator method
    public void billsPayable()
    {
        this.remainingAmount = (getcourseDuration() - numOfMonthsAttended) * gettuitionFee();
        this.hasPaid = true;
        System.out.println("The remaining amount is: " + this.remainingAmount);
    }
    
    public void removeStudent()
    {
        if(hasPaid == true)
        {
            setenrollmentID(0);
            setstudentName("");
            settuitionFee(0);
            setdateofEnrollment(""); 
            setdateOfBirth("");
            setcourseName("");
            setcourseDuration(0);
            dateOfDropout = "";
            numOfRemainingModules = 0;
            numOfMonthsAttended = 0;
            remainingAmount = 0;
            System.out.println("The Student Has Been Removed");
        }
        
        else
        {
            System.out.println("Bills have not been cleared yet.");
        }
    }
    

    //diplay method
    public void display()
    {
        super.display();
        System.out.println("Number of remaining modules: " + numOfRemainingModules);
        System.out.println("Number of months attended: " + numOfMonthsAttended);
        System.out.println("Dropout Date: " + dateOfDropout);
        System.out.println("Amount to be paid : " + remainingAmount);
    }
}