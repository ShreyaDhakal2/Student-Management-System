//importing font, arraylist, event, etc 
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

//class StudentGUI implements ActionActionListener
public class StudentGUI implements ActionListener
{
    //frames
    private JFrame mainFrame, regularFrame, DropoutFrame, presentPercentFrame, grantCertificateFrame, dropoutMainFrame;
    
    private JLabel mainLabel, purposeLabel, enrollmentIdLabel, dateOfEnrollLabel, studentNameLabel, dobLabel, courseDurationLabel, creditHoursLabel, tuitionFeeLabel, 
    noOfModulesLabel, daysPresentLabel, courseNameLabel,
    //labels for dropout
    mainDropoutLabel, dateOfBirthDropoutLabel ,studentNameDropoutLabel, courseDurationDropoutLabel, tuitionFeeDropoutLabel, RemainingModulesDropoutLabel,
    MonthsAttendedDropoutLabel, dateOfDropoutDropoutLabel, courseNameDropoutLabel, enrollmentIDDropoutLabel ,dateOfEnrollmentDropoutLabel, infoDropoutLabel,
    
    //labels for main dropout where student is removed
    MAIN_DropoutLabel, enrollmentIdMainDropoutLabel,
    
    //labels for present percent
    enrollmentIdPresentPercentLabel, noOfDaysPresentPercentLabel, presentPercentMainLabel,
    
    //labels for grant certificate 
    enrollmentIdGrantCertLabel, courseNameGrantCertLabel, dateOfEnrollmentGrantCertLabel, grantCertMainLabel;
    
    //Textfields
    private JTextField enrollmentIdTF, studentNameTF, courseDurationTF, creditHoursLabelTF, tuitionFeeTF, noOfModulesTF, daysPresentTF, courseNameTF,
    
    //Dropout Textfields
    studentNameDropoutTF, courseDurationDropoutTF, tuitionFeeDropoutTF, RemainingModulesDropoutTF, MonthsAttendedDropoutTF,
    courseNameDropoutTF, enrollmentIDDropoutTF,
    
    //main dropout textfields where student is removed
    enrollmentIdMainDropoutTF,
    
    //Textfields for present percent
    enrollmentIdPresentPercentTF, noOfDaysPresentPercentTF, 
    
    //textfields for grant certificate
    enrollmentIdGrantCertTF, courseNameGrantCertTF;
    
    private JComboBox<String> dateOfEnrollDayCB, dateOfEnrollMonthCB, dateOfEnrollYearCB, dobDayCB,dobMonthCB, dobYearCB,
    
    //Comboboxes for Dropout
    dateOfBirthDayDropoutCB ,dateOfBirthMonthDropoutCB , dateOfBirthYearDropoutCB, dateOfDropoutDayDropoutCB,dateOfDropoutMonthDropoutCB,
    dateOfDropoutYearDropoutCB, dateOfEnrollDayDropoutCB, dateOfEnrollMonthDropoutCB , dateOfEnrollYearDropoutCB,
    
    //Combobox for grant certificate
    dateOfEnrollDayGrantCertCB, dateOfEnrollMonthGrantCertCB, dateOfEnrollYearGrantCertCB;
    
    private JButton registerBtn, dropoutBtn, RegisterStdBtn1, clearRegularBtn, displayRegularBtn, displayDropoutBtn, dropoutAddBtn, dropout2Btn, clearDropoutBtn,
    presentPercentBtn, displayPercentBtn, calculatePercentBtn, grantCertificateBtn, displayGrantCertBtn, grantCertificate1Btn, clearGrantCertBtn, billPayDropoutBtn,
    removeStdDropoutBtn;
    
    //creating arraylist of Student Class
    ArrayList<Student> ArrayListStd = new ArrayList<Student>();
    
    //constructor of the class
    
    public StudentGUI()
    {
        //creating frame
        regularFrame = new JFrame("Student Registration Info");
        DropoutFrame = new JFrame("Student Dropout Info");
        mainFrame = new JFrame("Main Frame");
        presentPercentFrame = new JFrame("Present Percent");
        grantCertificateFrame = new JFrame("Certification");
        dropoutMainFrame = new JFrame("Billing & Dropout Info");
        
        //Label for regular 
        purposeLabel = new JLabel("Please select your purpose");
        mainLabel = new JLabel("Student Information");
        enrollmentIdLabel = new JLabel("Enrollment Id");
        dateOfEnrollLabel = new JLabel("Date of Enrollment");
        studentNameLabel = new JLabel("Student Name");
        dobLabel = new JLabel("Date Of Birth");
        courseDurationLabel = new JLabel("Course Duration (months)");
        creditHoursLabel = new JLabel("Credit Hours");
        tuitionFeeLabel = new JLabel("Tuition Fee (Nrs)");
        noOfModulesLabel = new JLabel("No of Modules");
        daysPresentLabel = new JLabel("Days Present (days)");
        courseNameLabel = new JLabel("Course Name");
        
        //label for dropout
        mainDropoutLabel = new JLabel("Dropout");   
        infoDropoutLabel =new JLabel("(only enrollment Id is to be filled)");
        enrollmentIDDropoutLabel = new JLabel("Enrollment Id");
        courseNameDropoutLabel = new JLabel("Course Name");
        studentNameDropoutLabel = new JLabel("Student Name");
        dateOfBirthDropoutLabel = new JLabel("Date of Birth");
        dateOfEnrollmentDropoutLabel = new JLabel("Date of Enrollment");
        courseDurationDropoutLabel = new JLabel("Course Duration (months)");
        tuitionFeeDropoutLabel = new JLabel("Tuition Fee (Nrs)");
        RemainingModulesDropoutLabel = new JLabel("Remaining Modules");
        MonthsAttendedDropoutLabel = new JLabel("Months Attended");
        dateOfDropoutDropoutLabel = new JLabel("Date of Dropout");
        
        //label for mainDropout where student is removed
        enrollmentIdMainDropoutLabel = new JLabel("Enrollment Id");
        MAIN_DropoutLabel = new JLabel("Manage Payments & Enrollment Status");
        
        //label for present percent
        enrollmentIdPresentPercentLabel = new JLabel("Enrollment ID");
        noOfDaysPresentPercentLabel = new JLabel("No of days present");
        presentPercentMainLabel = new JLabel("Present Percent");
        
        //textfield for present percent
        enrollmentIdPresentPercentTF = new JTextField();
        noOfDaysPresentPercentTF = new JTextField();
        
        //labels for grant certificate
        enrollmentIdGrantCertLabel = new JLabel("Enrollment ID"); 
        courseNameGrantCertLabel = new JLabel("Course Name");
        dateOfEnrollmentGrantCertLabel = new JLabel("Date of Enrollment");
        grantCertMainLabel = new JLabel("Certification Details");
        
        //textfields for grant certificate
        enrollmentIdGrantCertTF = new JTextField(); 
        courseNameGrantCertTF = new JTextField();
        
        //TextField
        enrollmentIdTF = new JTextField();
        studentNameTF = new JTextField();
        courseDurationTF = new JTextField();
        creditHoursLabelTF = new JTextField();
        tuitionFeeTF = new JTextField();
        noOfModulesTF = new JTextField();
        daysPresentTF = new JTextField();
        courseNameTF = new JTextField();
        
        //textfield for Dropout
        studentNameDropoutTF = new JTextField();
        courseDurationDropoutTF = new JTextField();
        tuitionFeeDropoutTF = new JTextField();
        RemainingModulesDropoutTF = new JTextField();
        MonthsAttendedDropoutTF = new JTextField();
        courseNameDropoutTF = new JTextField();
        enrollmentIDDropoutTF = new JTextField();
        
        //textfield for main dropout
        enrollmentIdMainDropoutTF = new JTextField();
        
        //Combo Box
        String DateOfEnrollmentDay[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        dateOfEnrollDayCB = new JComboBox<String>(DateOfEnrollmentDay);
        
        String DateOfEnrollmentMonth[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        dateOfEnrollMonthCB = new JComboBox<String>(DateOfEnrollmentMonth);
        
        String DateOfEnrollmentYear[] = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021",
        "2022", "2023", "2024", "2025"}; 
        dateOfEnrollYearCB = new JComboBox<String>(DateOfEnrollmentYear);
        
        String DateOfBirthDay[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        dobDayCB = new JComboBox<String>(DateOfBirthDay);
        
        String DateOfBirthMonth[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        dobMonthCB = new JComboBox<String>(DateOfBirthMonth);
        
        String DateOfBirthYear[] = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021",
        "2022", "2023", "2024", "2025"}; 
        dobYearCB = new JComboBox<String>(DateOfBirthYear);
        
        
        //Combo Box for dropout
        String DateOfEnrollmentDayDropout[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        dateOfEnrollDayDropoutCB = new JComboBox<String>(DateOfEnrollmentDayDropout);
        
        String DateOfEnrollmentMonthDropout[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        dateOfEnrollMonthDropoutCB = new JComboBox<String>(DateOfEnrollmentMonthDropout);
        
        String DateOfEnrollmentYearDropout[] = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021",
        "2022", "2023", "2024", "2025"}; 
        dateOfEnrollYearDropoutCB = new JComboBox<String>(DateOfEnrollmentYearDropout);
        
        String DateOfBirthDayDropout[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        dateOfBirthDayDropoutCB = new JComboBox<String>(DateOfBirthDayDropout);
        
        String DateOfBirthMonthDropout[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        dateOfBirthMonthDropoutCB = new JComboBox<String>(DateOfBirthMonthDropout);
        
        String DateOfBirthYearDropout[] = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021",
        "2022", "2023", "2024", "2025"}; 
        dateOfBirthYearDropoutCB = new JComboBox<String>(DateOfBirthYearDropout);
        
        String DateOfDropoutDay[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        dateOfDropoutDayDropoutCB = new JComboBox<String>(DateOfDropoutDay);
        
        String DateOfDropoutMonth[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        dateOfDropoutMonthDropoutCB = new JComboBox<String>(DateOfDropoutMonth);
        
        String DateOfDropoutYear[] = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021",
        "2022", "2023", "2024", "2025"}; 
        dateOfDropoutYearDropoutCB = new JComboBox<String>(DateOfDropoutYear);
        
        //Combo Box for GRANT CERTIFICATE
        String DateOfEnrollmentDayGrantCert[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        dateOfEnrollDayGrantCertCB = new JComboBox<String>(DateOfEnrollmentDayGrantCert);
        
        String DateOfEnrollmentMonthGrantCert[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        dateOfEnrollMonthGrantCertCB = new JComboBox<String>(DateOfEnrollmentMonthGrantCert);
        
        String DateOfEnrollmentYearGrantCert[] = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021",
        "2022", "2023", "2024", "2025"}; 
        dateOfEnrollYearGrantCertCB = new JComboBox<String>(DateOfEnrollmentYearGrantCert);
        
        //Buttons
        registerBtn = new JButton("Register");
        dropoutBtn = new JButton("Dropout");
        RegisterStdBtn1 = new JButton("Register");
        clearRegularBtn = new JButton("Clear");
        clearDropoutBtn = new JButton("Clear");
        displayRegularBtn = new JButton("Display");
        displayDropoutBtn = new JButton("Display");
        dropoutAddBtn = new JButton("Add");
        dropout2Btn = new JButton("Bills & Dropout");
        presentPercentBtn = new JButton("Present %");
        displayPercentBtn = new JButton("Display");
        calculatePercentBtn = new JButton("Calculate");
        grantCertificateBtn = new JButton("Certification");
        displayGrantCertBtn = new JButton("Display");
        grantCertificate1Btn = new JButton("Grant");
        clearGrantCertBtn = new JButton("Clear");
        removeStdDropoutBtn = new JButton("Remove");
        billPayDropoutBtn = new JButton("Pay Due");
        
        
        //adding Labels to mainFrame
        mainFrame.add(purposeLabel);
        
        //adding Labels to regularframe
        regularFrame.add(mainLabel);
        regularFrame.add(enrollmentIdLabel); 
        regularFrame.add(dateOfEnrollLabel);
        regularFrame.add(studentNameLabel);
        regularFrame.add(dobLabel);
        regularFrame.add(courseDurationLabel);
        regularFrame.add(creditHoursLabel);
        regularFrame.add(tuitionFeeLabel);
        regularFrame.add(noOfModulesLabel);
        regularFrame.add(daysPresentLabel);
        regularFrame.add(courseNameLabel);
        
        //adding dropout labels to frame
        DropoutFrame.add(mainDropoutLabel);
        DropoutFrame.add(dateOfBirthDropoutLabel);
        DropoutFrame.add(courseDurationDropoutLabel);
        DropoutFrame.add(tuitionFeeDropoutLabel);
        DropoutFrame.add(RemainingModulesDropoutLabel);
        DropoutFrame.add(MonthsAttendedDropoutLabel);
        DropoutFrame.add(dateOfDropoutDropoutLabel);
        DropoutFrame.add(courseNameDropoutLabel);
        dropoutMainFrame.add(infoDropoutLabel);
        DropoutFrame.add(enrollmentIDDropoutLabel);
        DropoutFrame.add(dateOfEnrollmentDropoutLabel);
        DropoutFrame.add(studentNameDropoutLabel);
        
        //adding dropout labels of maindropout to dropout main frame
        dropoutMainFrame.add(enrollmentIdMainDropoutLabel);
        dropoutMainFrame.add(MAIN_DropoutLabel);
        
        //adding dropout txtfield of maindropout
        dropoutMainFrame.add(enrollmentIdMainDropoutTF);
        
        //adding present percent labels to PresentPercentFrame
        presentPercentFrame.add(enrollmentIdPresentPercentLabel);
        presentPercentFrame.add(noOfDaysPresentPercentLabel);
        presentPercentFrame.add(presentPercentMainLabel);
        
        //adding certification labels to grantCertificateFrame
        grantCertificateFrame.add(enrollmentIdGrantCertLabel); 
        grantCertificateFrame.add(courseNameGrantCertLabel);
        grantCertificateFrame.add(dateOfEnrollmentGrantCertLabel);
        grantCertificateFrame.add(grantCertMainLabel);
        
        //adding Textfields to frame
        regularFrame.add(enrollmentIdTF);
        regularFrame.add(studentNameTF);
        regularFrame.add(courseDurationTF);
        regularFrame.add(creditHoursLabelTF);
        regularFrame.add(tuitionFeeTF);
        regularFrame.add(noOfModulesTF);
        regularFrame.add(daysPresentTF);
        regularFrame.add(courseNameTF);
        
        //adding Textfields of Dropout to Dropoutframe
        DropoutFrame.add(studentNameDropoutTF);
        DropoutFrame.add(courseDurationDropoutTF);
        DropoutFrame.add(tuitionFeeDropoutTF);
        DropoutFrame.add(RemainingModulesDropoutTF);
        DropoutFrame.add(MonthsAttendedDropoutTF);
        DropoutFrame.add(courseNameDropoutTF);
        DropoutFrame.add(enrollmentIDDropoutTF);
        
        //adding Textfields of Present percent to PresentPercentFrame
        presentPercentFrame.add(enrollmentIdPresentPercentTF);
        presentPercentFrame.add(noOfDaysPresentPercentTF);
        
        //adding Textfields of certification to grantCertificateFrame
        grantCertificateFrame.add(enrollmentIdGrantCertTF); 
        grantCertificateFrame.add(courseNameGrantCertTF);
        
        //adding Combo Box to frame
        regularFrame.add(dateOfEnrollDayCB);
        regularFrame.add(dateOfEnrollMonthCB);
        regularFrame.add(dateOfEnrollYearCB);
        regularFrame.add(dobDayCB);
        regularFrame.add(dobMonthCB);
        regularFrame.add(dobYearCB);
        
        //adding Combo box of Dropout to Dropout frame
        DropoutFrame.add(dateOfBirthDayDropoutCB);
        DropoutFrame.add(dateOfBirthMonthDropoutCB);
        DropoutFrame.add(dateOfBirthYearDropoutCB);
        DropoutFrame.add(dateOfDropoutDayDropoutCB);
        DropoutFrame.add(dateOfDropoutMonthDropoutCB);
        DropoutFrame.add(dateOfDropoutYearDropoutCB);
        DropoutFrame.add(dateOfEnrollDayDropoutCB);
        DropoutFrame.add(dateOfEnrollMonthDropoutCB);
        DropoutFrame.add(dateOfEnrollYearDropoutCB);
        
        //adding combo box of certification to grantCertificateFrame
        grantCertificateFrame.add(dateOfEnrollDayGrantCertCB);
        grantCertificateFrame.add(dateOfEnrollMonthGrantCertCB);
        grantCertificateFrame.add(dateOfEnrollYearGrantCertCB);
        
        //adding Buttons to frame
        regularFrame.add(clearRegularBtn);
        regularFrame.add(displayRegularBtn);
        mainFrame.add(registerBtn);
        mainFrame.add(dropoutBtn);
        regularFrame.add(RegisterStdBtn1);
        DropoutFrame.add(displayDropoutBtn);
        DropoutFrame.add(dropoutAddBtn);
        DropoutFrame.add(dropout2Btn);
        DropoutFrame.add(clearDropoutBtn);
        regularFrame.add(presentPercentBtn);
        presentPercentFrame.add(displayPercentBtn);
        presentPercentFrame.add(calculatePercentBtn);
        regularFrame.add(grantCertificateBtn);
        grantCertificateFrame.add(displayGrantCertBtn);
        grantCertificateFrame.add(grantCertificate1Btn);
        grantCertificateFrame.add(clearGrantCertBtn);
        dropoutMainFrame.add(removeStdDropoutBtn);
        dropoutMainFrame.add(billPayDropoutBtn);
        
        //mainFrame
        mainFrame.setLayout(null);  
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.setSize(500, 340);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //setting bound for Jlabel of mainFrame
        purposeLabel.setBounds(130, 10, 270, 32);
        
        //setting bound for JLabels
        mainLabel.setBounds(200, 37, 200, 20);
        enrollmentIdLabel.setBounds(30, 106, 81, 20);
        dateOfEnrollLabel.setBounds(394, 291, 114, 20);
        studentNameLabel.setBounds(394, 106, 87, 20);  
        dobLabel.setBounds(30, 197, 76, 20);
        courseDurationLabel.setBounds(30, 291, 150, 20);
        creditHoursLabel.setBounds(30, 484, 79, 20);
        tuitionFeeLabel.setBounds(30, 384, 110, 20);
        noOfModulesLabel.setBounds(391, 384, 90, 20);
        daysPresentLabel.setBounds(391, 484, 130, 20);
        courseNameLabel.setBounds(391, 197, 84, 20);
        
        //setting bounds for JLabels of dropout frame
        mainDropoutLabel.setBounds(250, 37, 100, 30);
        studentNameDropoutLabel.setBounds(394,106,87,20);
        dateOfBirthDropoutLabel.setBounds(30,197,76,20);
        courseDurationDropoutLabel.setBounds(30,291,160,20);
        tuitionFeeDropoutLabel.setBounds(30,384, 105, 20);
        RemainingModulesDropoutLabel.setBounds(391,384,160, 20);
        MonthsAttendedDropoutLabel.setBounds(30,477,149, 20);
        dateOfDropoutDropoutLabel.setBounds(391, 477,97, 20);
        courseNameDropoutLabel.setBounds(391,197,84, 20);
        infoDropoutLabel.setBounds(30, 210, 350, 20);
        enrollmentIDDropoutLabel.setBounds(30,106, 81, 20);
        dateOfEnrollmentDropoutLabel.setBounds(394,291,114, 20);
        
        //setting bounds for JLabels of main dropout frame where student is removed
        enrollmentIdMainDropoutLabel.setBounds(30,70, 81, 20);
        MAIN_DropoutLabel.setBounds(30, 5, 300, 20);
        enrollmentIdMainDropoutTF.setBounds(30, 104, 270, 32);
        
        //setting bound for JLabels of present percent frame
        enrollmentIdPresentPercentLabel.setBounds(53, 58, 85, 20);
        noOfDaysPresentPercentLabel.setBounds(53, 150, 118, 20);
        presentPercentMainLabel.setBounds(165, 22, 170, 20);
        
        //setting bound for JLabel of grantCertificateFrame
        enrollmentIdGrantCertLabel.setBounds(53, 58, 85, 20);
        courseNameGrantCertLabel.setBounds(53, 150, 86, 20);
        dateOfEnrollmentGrantCertLabel.setBounds(53, 242, 116, 20);
        grantCertMainLabel.setBounds(155, 22, 190, 20);
        
        //setting bound for JTextfield of grantCertificateFrame
        enrollmentIdGrantCertTF.setBounds(53, 88, 180, 32);
        courseNameGrantCertTF.setBounds(53, 180, 180, 32);
        
        //setting bound for JTextfield of present percent frame
        enrollmentIdPresentPercentTF.setBounds(53,88, 180, 32);
        noOfDaysPresentPercentTF.setBounds(53, 180, 180, 32);
        
        //setting bound for textfields
        enrollmentIdTF.setBounds(30, 140, 180, 32);
        studentNameTF.setBounds(394, 140, 180, 32);
        courseDurationTF.setBounds(30, 326, 180, 32);
        creditHoursLabelTF.setBounds(30, 523, 180, 32);
        tuitionFeeTF.setBounds(30, 419, 180, 32);
        noOfModulesTF.setBounds(391, 419, 180, 32);
        daysPresentTF.setBounds(391, 517, 180, 32);
        courseNameTF.setBounds(394, 232, 180, 32);
        
        //setting bound for textfields of Dropout
        courseDurationDropoutTF.setBounds(30,326, 180, 32);
        tuitionFeeDropoutTF.setBounds(30,419, 180, 32);
        RemainingModulesDropoutTF.setBounds(391,419, 180, 32);
        MonthsAttendedDropoutTF.setBounds(30, 523, 180, 32);
        courseNameDropoutTF.setBounds(391,232, 180, 32);
        enrollmentIDDropoutTF.setBounds(30,140, 180, 32);
        studentNameDropoutTF.setBounds(394, 140, 180, 32);
        
        //setting bound for Combo Box 
        dateOfEnrollDayCB.setBounds(394, 321, 39, 32);
        dateOfEnrollMonthCB.setBounds(440, 321, 44, 32);
        dateOfEnrollYearCB.setBounds(491, 321, 83, 32);

        dobDayCB.setBounds(30, 232, 39, 32);
        dobMonthCB.setBounds(76, 232, 44, 32);
        dobYearCB.setBounds(127, 232, 83, 32);
        
        //setting bounds for Combo box of Dropout frame
        dateOfBirthDayDropoutCB.setBounds(30, 232, 39, 32);
        dateOfBirthMonthDropoutCB.setBounds(76, 232, 44, 32);
        dateOfBirthYearDropoutCB.setBounds(127, 232, 83, 32);
        dateOfDropoutDayDropoutCB.setBounds(391, 523, 39, 32);
        dateOfDropoutMonthDropoutCB.setBounds(437, 523, 44, 32);
        dateOfDropoutYearDropoutCB.setBounds(488,523, 83, 32);
        dateOfEnrollDayDropoutCB.setBounds(394, 321, 39, 32);
        dateOfEnrollMonthDropoutCB.setBounds(440, 321, 44, 32);
        dateOfEnrollYearDropoutCB.setBounds(491, 321, 83, 32);
        
        //setting bound for combo box of grantCertificateFrame
        dateOfEnrollDayGrantCertCB.setBounds(53, 272, 43, 32);
        dateOfEnrollMonthGrantCertCB.setBounds(111, 272, 43, 32);
        dateOfEnrollYearGrantCertCB.setBounds(167, 272, 66, 32);
        
        //setting bound for Buttons
        registerBtn.setBounds(200, 100, 120, 32);
        dropoutBtn.setBounds( 200, 200, 120, 32);
        RegisterStdBtn1.setBounds(250, 587, 120, 32);
        clearRegularBtn.setBounds(451, 587, 120, 32);
        clearDropoutBtn.setBounds(451, 587, 120, 32);
        displayRegularBtn.setBounds(454, 37, 120, 32);
        displayDropoutBtn.setBounds(454, 37, 120, 32);
        dropoutAddBtn.setBounds(240, 587, 120, 32);
        dropout2Btn.setBounds(29, 587, 120, 32);
        presentPercentBtn.setBounds(250, 640, 120, 32);
        displayPercentBtn.setBounds(285, 105, 120, 32);
        calculatePercentBtn.setBounds(285, 170, 120, 32);
        grantCertificateBtn.setBounds(450, 640, 120, 32);
        displayGrantCertBtn.setBounds(286, 180, 120, 32);
        grantCertificate1Btn.setBounds(286, 134, 120, 32);
        clearGrantCertBtn.setBounds(286, 226, 120, 32);
        removeStdDropoutBtn.setBounds(30, 150, 120, 32);
        billPayDropoutBtn.setBounds(180, 150, 120, 32); 
        
        //designing the components with color and fonts
        
        purposeLabel.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        purposeLabel.setForeground(Color.DARK_GRAY);
        mainLabel.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        mainLabel.setForeground(Color.DARK_GRAY);
        
        mainDropoutLabel.setFont(new Font("TimesNewRoman", Font.BOLD, 25));
        mainDropoutLabel.setForeground(Color.DARK_GRAY);
        
        presentPercentMainLabel.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        presentPercentMainLabel.setForeground(Color.DARK_GRAY);
        
        grantCertMainLabel.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
        grantCertMainLabel.setForeground(Color.DARK_GRAY);
        
        infoDropoutLabel.setFont(new Font("TimesNewRoman", Font.BOLD, 11));
        infoDropoutLabel.setForeground(Color.red);
        
        MAIN_DropoutLabel.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
        MAIN_DropoutLabel.setForeground(Color.DARK_GRAY);
        
        Color color=new Color (242,245,208);
        regularFrame.getContentPane().setBackground(color);
        
        Color color1 = new Color (242,245,208);
        mainFrame.getContentPane().setBackground(color1);

        Color color2 = new Color (242,245,208);
        DropoutFrame.getContentPane().setBackground(color2);
        
        Color color3 = new Color (242,245,208);
        presentPercentFrame.getContentPane().setBackground(color3);
        
        Color color4 = new Color (242,245,208);
        grantCertificateFrame.getContentPane().setBackground(color4);
        
        Color color5 = new Color (242,245,208);
        dropoutMainFrame.getContentPane().setBackground(color5);
        
        
        //action listeners for various buttons 
        RegisterStdBtn1.addActionListener(this);
        dropoutBtn.addActionListener(this);
        registerBtn.addActionListener(this);
        clearRegularBtn.addActionListener(this);
        clearDropoutBtn.addActionListener(this);
        displayRegularBtn.addActionListener(this);
        displayDropoutBtn.addActionListener(this);
        displayPercentBtn.addActionListener(this);
        presentPercentBtn.addActionListener(this);
        grantCertificateBtn.addActionListener(this);
        dropoutAddBtn.addActionListener(this);
        dropout2Btn.addActionListener(this);
        calculatePercentBtn.addActionListener(this);
        grantCertificate1Btn.addActionListener(this);
        removeStdDropoutBtn.addActionListener(this);
        billPayDropoutBtn.addActionListener(this);
        displayGrantCertBtn.addActionListener(this);
        clearGrantCertBtn.addActionListener(this);
    }
    
    /*this is the main method named actionPerformed which helps in handling the different events. for examplw, on button click, this portion instructs
       different buttons as to what it should really be doing. There are 18 button in total in this project which is handled by the method action performed
       opening the frames, displaying suitable messages in dialog box on buttn click, registering the student, removing the student from the list, paying
       the fees, calculating present percentage, granting the certificate to the designated student is done by this method through the different buttons
       AND,
       exception handling is also done in this portion in which if any String value is entered in integer textfield, it shows specific error message in the
       dialog box. 
       Furthermore, the program also shows the error if any textfield is left vacant.
       
       Clear Buttons help in clearing out the differet textfields in the frame*/
    
    @Override 
    public void actionPerformed(ActionEvent e)
    {
        //variables
        int enrollmentID, courseDuration, numOfCreditHours, tuitionFee, numOfModules, numOfRemainingModules, numOfMonthsAttended;
        
        double daysPresent;
        
        String studentName, courseName, dateOfBirth, dateofEnrollment, dateOfDropout, DateOfEnrollmentDay, DateOfEnrollmentMonth, DateOfEnrollmentYear, DateOfBirthDay, 
        DateOfBirthMonth, DateOfBirthYear, DateOfDropoutDay, DateOfDropoutMonth, DateOfDropoutYear;
        
        //opens frame
        if(e.getSource() == registerBtn)
        {
            regularFrame.setLayout(null);  
            regularFrame.setResizable(false);
            regularFrame.setVisible(true);
            regularFrame.setSize(620, 730);
        }
        
        //frame
        else if(e.getSource() == dropoutBtn)
        {
            DropoutFrame.setLayout(null);
            DropoutFrame.setResizable(false);
            DropoutFrame.setVisible(true);
            DropoutFrame.setSize(620, 665);
        }
        
        //frame
        else if(e.getSource() == dropout2Btn)
        {
            dropoutMainFrame.setLayout(null);
            dropoutMainFrame.setResizable(false);
            dropoutMainFrame.setVisible(true);
            dropoutMainFrame.setSize(340, 400);
        }
        
        //opens a frame for calculating present percentage
        
        else if(e.getSource() == presentPercentBtn)
        {
            presentPercentFrame.setLayout(null);
            presentPercentFrame.setResizable(false);
            presentPercentFrame.setVisible(true);
            presentPercentFrame.setSize(454, 260);            
        }
        
        //opens a frame for granting the certificate to the students
        
        else if(e.getSource() == grantCertificateBtn)
        {
            grantCertificateFrame.setLayout(null);
            grantCertificateFrame.setResizable(false);
            grantCertificateFrame.setVisible(true);
            grantCertificateFrame.setSize(454, 360);  
        }
        
        /*helps in registering different information about the student as well as student's academic information and data. this button adds different 
        objects of type Regular class to the arraylist of Student Class.*/
        
        else if(e.getSource() == RegisterStdBtn1)
        {
            if(enrollmentIdTF.getText().isEmpty() || studentNameTF.getText().isEmpty() || courseDurationTF.getText().isEmpty() || 
                creditHoursLabelTF.getText().isEmpty() || tuitionFeeTF.getText().isEmpty() || noOfModulesTF.getText().isEmpty() || 
                daysPresentTF.getText().isEmpty() || courseNameTF.getText().isEmpty())
            {
                    JOptionPane .showMessageDialog(regularFrame,"Empty field found", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
                try
                {
                    enrollmentID = Integer.parseInt(enrollmentIdTF.getText());
                    studentName = studentNameTF.getText();
                    courseDuration = Integer.parseInt(courseDurationTF.getText());
                    numOfCreditHours = Integer.parseInt(creditHoursLabelTF.getText());
                    tuitionFee = Integer.parseInt(tuitionFeeTF.getText());
                    numOfModules = Integer.parseInt(noOfModulesTF.getText());
                    daysPresent = Double.parseDouble(daysPresentTF.getText());
                    courseName = courseNameTF.getText();
                    
                    DateOfBirthDay = dobDayCB.getSelectedItem().toString();
                    DateOfBirthMonth = dobMonthCB.getSelectedItem().toString();
                    DateOfBirthYear = dobYearCB.getSelectedItem().toString();
                    dateOfBirth = DateOfBirthDay + "-" + DateOfBirthMonth + "-" + DateOfBirthYear;
                    DateOfEnrollmentDay = dateOfEnrollDayCB.getSelectedItem().toString();
                    DateOfEnrollmentMonth = dateOfEnrollMonthCB.getSelectedItem().toString();
                    DateOfEnrollmentYear = dateOfEnrollYearCB.getSelectedItem().toString();
                    dateofEnrollment = DateOfEnrollmentDay + "-" + DateOfEnrollmentMonth + "-" + DateOfEnrollmentYear;
                    
                    //instruction to check if the arraylist is empty
                    if(ArrayListStd.isEmpty())
                    {
                        //add object of regular student by calling constructor 
                        Regular objRegular = new Regular(enrollmentID, dateOfBirth, courseName, studentName, dateofEnrollment, courseDuration, tuitionFee, numOfModules,
                        numOfCreditHours, daysPresent);
                        
                        //add object to arraylist
                        ArrayListStd.add(objRegular);
                        
                        //message
                        JOptionPane.showMessageDialog(regularFrame, "Success! Student is registered");
                    }
                    
                    else 
                    {
                        //iterating arraylist
                        for(Student Std:ArrayListStd)
                        {
                            boolean duplicate = false;
                            
                            //check instance of the object of Student is instance of Regular 
                            if(Std instanceof Regular)
                            {
                                duplicate = true;
                                
                                if(Std.getenrollmentID() == enrollmentID)
                                {
                                    JOptionPane.showMessageDialog(regularFrame, "Duplicate Enrollment Id! Please try a unique Id", "Warning", JOptionPane.WARNING_MESSAGE);
                                    break;
                                }
                                
                                else if(Std == ArrayListStd.get(ArrayListStd.size() - 1))
                                {
                                    //calling the constructor from regular class and adding the object
                                    Regular objRegular = new Regular(enrollmentID, dateOfBirth, courseName, studentName, dateofEnrollment, courseDuration, tuitionFee, numOfModules,
                                    numOfCreditHours, daysPresent);
                                    
                                    //add object to arraylist
                                    ArrayListStd.add(objRegular);
                                    
                                    //message dialog
                                    JOptionPane.showMessageDialog(regularFrame, "Student Registered");
                                    
                                    break;
                                }
                            }
                            
                            else if(Std == ArrayListStd.get(ArrayListStd.size() - 1))
                            {
                                if(duplicate == false)
                                {
                                    //calling the constructor from regular class and adding the object
                                    Regular objRegular = new Regular(enrollmentID, dateOfBirth, courseName, studentName, dateofEnrollment, courseDuration, tuitionFee, numOfModules,
                                    numOfCreditHours, daysPresent);
                                    
                                    //add object to arraylist
                                    ArrayListStd.add(objRegular);
                                    
                                    //message dialog
                                    JOptionPane.showMessageDialog(regularFrame, "Student Registered");
                                    
                                    break;
                                }
                            }
                        }
                    }
                }
                
                catch(NumberFormatException b)
                {
                    JOptionPane.showMessageDialog(regularFrame, "The Input Data is Invalid! Retry Again.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        /*helps in registering different information about the student as well as student's academic information and data and dropout info as well as bills.
         * this button adds different  objects of type Dropout class to the arraylist of Student Class.*/
        
        else if(e.getSource() == dropoutAddBtn)
        {
            if(enrollmentIDDropoutTF.getText().isEmpty() || studentNameDropoutTF.getText().isEmpty() || courseDurationDropoutTF.getText().isEmpty() || 
                tuitionFeeDropoutTF.getText().isEmpty() || RemainingModulesDropoutTF.getText().isEmpty() || courseNameDropoutTF.getText().isEmpty()
                || MonthsAttendedDropoutTF.getText().isEmpty())
            {
                    JOptionPane .showMessageDialog(DropoutFrame,"Empty field found", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
                try
                {
                    //exception handling
                    
                    enrollmentID = Integer.parseInt(enrollmentIDDropoutTF.getText());
                    
                    courseName = courseNameDropoutTF.getText();
                    
                    studentName = studentNameDropoutTF.getText();
                    
                    DateOfBirthDay = dateOfBirthDayDropoutCB.getSelectedItem().toString();
                    DateOfBirthMonth = dateOfBirthMonthDropoutCB.getSelectedItem().toString();
                    DateOfBirthYear = dateOfBirthYearDropoutCB.getSelectedItem().toString();
                    dateOfBirth = DateOfBirthDay + "-" + DateOfBirthMonth + "-" + DateOfBirthYear;
                    
                    DateOfEnrollmentDay = dateOfEnrollDayDropoutCB.getSelectedItem().toString();
                    DateOfEnrollmentMonth = dateOfEnrollMonthDropoutCB.getSelectedItem().toString();
                    DateOfEnrollmentYear = dateOfEnrollYearDropoutCB.getSelectedItem().toString();
                    dateofEnrollment = DateOfEnrollmentDay + "-" + DateOfEnrollmentMonth + "-" + DateOfEnrollmentYear;

                    courseDuration = Integer.parseInt(courseDurationDropoutTF.getText());
                    
                    tuitionFee = Integer.parseInt(tuitionFeeDropoutTF.getText());
                    
                    numOfRemainingModules = Integer.parseInt(RemainingModulesDropoutTF.getText());
                    
                    numOfMonthsAttended = Integer.parseInt(MonthsAttendedDropoutTF.getText());
                    
                    DateOfDropoutDay = dateOfDropoutDayDropoutCB.getSelectedItem().toString();
                    DateOfDropoutMonth = dateOfDropoutMonthDropoutCB.getSelectedItem().toString();
                    DateOfDropoutYear = dateOfDropoutYearDropoutCB.getSelectedItem().toString();
                    dateOfDropout = DateOfDropoutDay + "-" + DateOfDropoutMonth + "-" + DateOfDropoutYear;
                    
                    //instruction to check if the arraylist is empty
                    if(ArrayListStd.isEmpty())
                    {
                        //add object of dropout by calling constructor 
                        Dropout ObjDropout = new Dropout(dateOfBirth, studentName, courseDuration, tuitionFee, numOfRemainingModules, numOfMonthsAttended, 
                        dateOfDropout, courseName, enrollmentID, dateofEnrollment);
                        
                        //add object to arraylist
                        ArrayListStd.add(ObjDropout);
                        
                        //message
                        JOptionPane.showMessageDialog(DropoutFrame, "Success! Student is Listed");
                        
                    }
                    
                    else 
                    {
                        //iterating arraylist
                        for(Student Std:ArrayListStd)
                        {
                            boolean isListed = false;
                            
                            //check instance of the object of Student is instance of Regular 
                            if(Std instanceof Dropout)
                            {
                                isListed = true;
                                
                                if(Std.getenrollmentID() == enrollmentID)
                                {
                                    JOptionPane.showMessageDialog(DropoutFrame, "Duplicate Enrollment Id! Please try a unique Id", "Warning", JOptionPane.WARNING_MESSAGE);
                                    
                                    break;
                                }
                                
                                else if(Std == ArrayListStd.get(ArrayListStd.size() - 1))
                                {
                                    //calling the constructor from dropout class and adding the object
                                    Dropout ObjDropout = new Dropout(dateOfBirth, studentName, courseDuration, tuitionFee, numOfRemainingModules, numOfMonthsAttended, 
                                    dateOfDropout, courseName, enrollmentID, dateofEnrollment);
                                    
                                    //add object to arraylist
                                    ArrayListStd.add(ObjDropout);
                                    
                                    //message
                                    JOptionPane.showMessageDialog(DropoutFrame, "Success! Student is Listed");
                                    
                                    break;
                                }
                            }
                            
                            else if(Std == ArrayListStd.get(ArrayListStd.size() - 1))
                            {
                                if(isListed == false)
                                {
                                    //calling the constructor from dropout class and adding the object
                                    Dropout ObjDropout = new Dropout(dateOfBirth, studentName, courseDuration, tuitionFee, numOfRemainingModules, numOfMonthsAttended, 
                                    dateOfDropout, courseName, enrollmentID, dateofEnrollment);
                                    
                                    ArrayListStd.add(ObjDropout);
                                    
                                    JOptionPane.showMessageDialog(DropoutFrame, "Student Registered");
                                    
                                    break;
                                }
                            }
                        }
                    }
                }
                
                catch(NumberFormatException b)
                {
                    JOptionPane.showMessageDialog(DropoutFrame, "The Input Data is Invalid! Retry Again.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //calculates the present percent of the student 
        
        else if(e.getSource() == calculatePercentBtn)
        {
            if(enrollmentIdPresentPercentTF.getText().isEmpty() || noOfDaysPresentPercentTF.getText().isEmpty())
            {
                JOptionPane .showMessageDialog(presentPercentFrame,"Empty field found.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
                //exception handling through try catch block
                try
                {
                    enrollmentID = Integer.parseInt(enrollmentIdPresentPercentTF.getText());
                    daysPresent = Double.parseDouble(noOfDaysPresentPercentTF.getText());
                    
                    //check arraylist if it's empty
                    if(ArrayListStd.isEmpty())
                    {
                        JOptionPane.showMessageDialog(presentPercentFrame, "Student Not Found", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    
                    else 
                    {
                        //iterating through the arraylist
                        for(Student Std:ArrayListStd)
                        {
                            boolean calculate = false;
                            
                            //checking if object of Student, 'Std' is the instance
                            if(Std instanceof Regular)
                            {
                                calculate = true;
                                
                                //downcasting
                                Regular reg = (Regular) Std;
                                
                                if(Std.getenrollmentID() == enrollmentID)
                                {
                                    //call the presentPercentage method from Regular Class
                                    reg.presentPercentage(daysPresent);
                                    
                                    JOptionPane.showMessageDialog(presentPercentFrame, "Enrollment Id: " + enrollmentID + "\n" + "Days Present: " + daysPresent);
                                    
                                    break;
                                }
                                
                                else if(Std == ArrayListStd.get(ArrayListStd.size() - 1))
                                {
                                    JOptionPane.showMessageDialog(presentPercentFrame, "Enrollment Id is invalid! Please Recheck before trying again", "Warning", JOptionPane.WARNING_MESSAGE);
                                    
                                    break;
                                }
                            }
                            
                            else if(Std == ArrayListStd.get(ArrayListStd.size() - 1))
                            {
                                if(calculate == false)
                                {
                                    JOptionPane.showMessageDialog(presentPercentFrame, "The Student with Enrollment Id " + enrollmentID + "doesn't exist.", "Warning", JOptionPane.WARNING_MESSAGE);
                                }
                            }
                        }  
                    }
                }
                
                catch(NumberFormatException b)
                {
                    JOptionPane.showMessageDialog(presentPercentFrame, "The Input Data is Invalid! Retry Again.","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //grants certificate to the student in accordance to the days present. it also shows the grade sheet as in Grade A, B, ...etc.
        
        else if(e.getSource() == grantCertificate1Btn)
        {
            if(enrollmentIdGrantCertTF.getText().isEmpty() || courseNameGrantCertTF.getText().isEmpty())
            {
                JOptionPane .showMessageDialog(grantCertificateFrame,"Empty field found.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
                //exception handling through try catch block
                try
                {      
                    courseName = courseNameGrantCertTF.getText();
                    
                    enrollmentID = Integer.parseInt(enrollmentIdGrantCertTF.getText());
                
                    DateOfEnrollmentDay = dateOfEnrollDayGrantCertCB.getSelectedItem().toString();
                    DateOfEnrollmentMonth = dateOfEnrollMonthGrantCertCB.getSelectedItem().toString();
                    DateOfEnrollmentYear = dateOfEnrollYearGrantCertCB.getSelectedItem().toString();
                    dateofEnrollment = DateOfEnrollmentDay + "-" + DateOfEnrollmentMonth + "-" + DateOfEnrollmentYear ;
                    
                    //check if the arraylist is empty
                    if(ArrayListStd.isEmpty())
                    {
                        JOptionPane.showMessageDialog(grantCertificateFrame, "Student Not Found", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    
                    else
                    {
                        for(Student Std:ArrayListStd)
                        {
                            boolean isGranted = false;
                            
                            if(Std instanceof Regular)
                            {
                                isGranted = true;
                                
                                //downcasting 
                                Regular reg = (Regular) Std;
                                
                                ////grant the certificate if the condition matches
                                if(Std.getenrollmentID() == enrollmentID)
                                {
                                    reg.grantCertificate(dateofEnrollment, enrollmentID, courseName);
                                    
                                    //scholarship is then granted,
                                    JOptionPane.showMessageDialog(grantCertificateFrame, "The Certificate to student with Enrollment Id " + enrollmentID + "has been granted!");
                                    
                                    break;
                                }
                                
                                //invaid enrollment Id
                                else if(Std == ArrayListStd.get(ArrayListStd.size() - 1))
                                {
                                    JOptionPane.showMessageDialog(grantCertificateFrame, "Enrollment Id is invalid! Please Recheck before trying again", "Warning", JOptionPane.WARNING_MESSAGE);
                                    
                                    break;
                                }
                            }
                            
                            else if(Std == ArrayListStd.get(ArrayListStd.size() - 1))
                            {
                                if(isGranted == false)
                                {
                                    JOptionPane.showMessageDialog(grantCertificateFrame, "Student not found. Couldn't grant the Certificate!", "Alert", JOptionPane.ERROR_MESSAGE);
                                    
                                    break;
                                }
                            }
                        }   
                    }
                }
                
                catch(NumberFormatException b)
                {
                    JOptionPane.showMessageDialog(grantCertificateFrame, "The Input Data is Invalid! Retry Again.","Error", JOptionPane.ERROR_MESSAGE);            
                }
            }
        }
        
        //helps in paying the bill
        
        else if(e.getSource() == billPayDropoutBtn)
        {
            if(enrollmentIdMainDropoutTF.getText().isEmpty())
            {
                JOptionPane .showMessageDialog(dropoutMainFrame,"Empty field found.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
                //exception handling through try catch block
                try
                {
                    //variable
                    enrollmentID = Integer.parseInt(enrollmentIdMainDropoutTF.getText());
                    
                    if(ArrayListStd.isEmpty())
                    {
                        JOptionPane.showMessageDialog(dropoutMainFrame, "Student Not Found", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    
                    else
                    {
                        for(Student Std:ArrayListStd)
                        {
                            boolean hasPaid = false;
                            
                            if(Std instanceof Dropout)
                            {
                                hasPaid = true;
                                Dropout drop = (Dropout) Std;
                                
                                if(Std.getenrollmentID() == enrollmentID)
                                {
                                    drop.billsPayable();
                                    
                                    JOptionPane.showMessageDialog(dropoutMainFrame, "Bill has been paid");
                                    
                                    break;
                                }
                            }
                        }
                    }
                }
                
                catch(NumberFormatException b)
                {
                    JOptionPane.showMessageDialog(dropoutMainFrame, "The Input Data is Invalid! Retry Again.","Error", JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
        
        //helps in removing the details of the student
        
        else if(e.getSource()  == removeStdDropoutBtn)
        {
            if(enrollmentIdMainDropoutTF.getText().isEmpty())
            {
                JOptionPane .showMessageDialog(dropoutMainFrame,"Empty field found.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
                try
                {
                    enrollmentID = Integer.parseInt(enrollmentIdMainDropoutTF.getText());
                    
                    if(ArrayListStd.isEmpty())
                    {
                        JOptionPane.showMessageDialog(dropoutMainFrame, "Student Not Found", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    
                    else
                    {
                        for(Student Std:ArrayListStd)
                        {
                            boolean hasPaid = false;
                            
                            if(Std instanceof Dropout)
                            {
                                hasPaid = true;
                                Dropout drop = (Dropout) Std;
                                
                                if(Std.getenrollmentID() == enrollmentID)
                                {
                                    drop. removeStudent();
                                    
                                    JOptionPane.showMessageDialog(dropoutMainFrame, "The Student has been removed");
                                    break;
                                }
                                
                                else if(Std == ArrayListStd.get(ArrayListStd.size() - 1))
                                {
                                    JOptionPane.showMessageDialog(dropoutMainFrame, "Enrollment Id is invalid! Please Recheck before trying again", "Warning", JOptionPane.WARNING_MESSAGE);
                                    break;
                                }
                            }
                            
                            else if(Std == ArrayListStd.get(ArrayListStd.size() - 1))
                            {
                                if(hasPaid == false)
                                {
                                    JOptionPane.showMessageDialog(dropoutMainFrame, "Student not found. Couldn't grant the Certificate!", "Alert", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                        }
                    }
                }
                
                catch(NumberFormatException b)
                {
                    JOptionPane.showMessageDialog(dropoutMainFrame, "The Input Data is Invalid! Retry Again.","Error", JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
        
        //displays the required information in message dialog
        else if(e.getSource() == displayRegularBtn)
        {
            if(ArrayListStd.isEmpty())
            {
                JOptionPane.showMessageDialog(regularFrame, "Empty field found", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
                //variables
                
                boolean dispReg = false;
                enrollmentID = Integer.parseInt(enrollmentIdTF.getText());
                studentName = studentNameTF.getText();
                courseDuration = Integer.parseInt(courseDurationTF.getText());
                numOfCreditHours = Integer.parseInt(creditHoursLabelTF.getText());
                tuitionFee = Integer.parseInt(tuitionFeeTF.getText());
                numOfModules = Integer.parseInt(noOfModulesTF.getText());
                daysPresent = Double.parseDouble(daysPresentTF.getText());
                courseName = courseNameTF.getText();
                
                DateOfBirthDay = dobDayCB.getSelectedItem().toString();
                DateOfBirthMonth = dobMonthCB.getSelectedItem().toString();
                DateOfBirthYear = dobYearCB.getSelectedItem().toString();
                dateOfBirth = DateOfBirthDay + "-" + DateOfBirthMonth + "-" + DateOfBirthYear;
                DateOfEnrollmentDay = dateOfEnrollDayCB.getSelectedItem().toString();
                DateOfEnrollmentMonth = dateOfEnrollMonthCB.getSelectedItem().toString();
                DateOfEnrollmentYear = dateOfEnrollYearCB.getSelectedItem().toString();
                dateofEnrollment = DateOfEnrollmentDay + "-" + DateOfEnrollmentMonth + "-" + DateOfEnrollmentYear;
                
                for(Student Std:ArrayListStd)
                {
                    if(Std instanceof Regular)
                    {
                        dispReg = true;
                        
                        //downcasting
                        Regular Reg = (Regular) Std;
                        
                        //calling regular class display() method
                        Reg.display();
                    }
                }
                
                if(dispReg == false)
                {
                    JOptionPane.showMessageDialog(regularFrame, "Details not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                
                else 
                {
                    JOptionPane.showMessageDialog(regularFrame, "Values: " + "\n" + "Enrollment Id: " + enrollmentID + "\n" + "Student Name: " + studentName + "\n" + "Course Duration: " + courseDuration + "\n" + "No of Credit Hours: " + numOfCreditHours + "\n" + "Tuition Fee: Nrs." + tuitionFee + "\n" + "No of Modules: " + numOfModules + "\n" + "Days Present: " + daysPresent + "\n" + "Course Name: " + courseName + "\n" + "Date of Birth: " + dateOfBirth + "\n" + " Date of Enrollment: " + dateofEnrollment);
                }
            }
        }
        
        //displays the required information in message dialog
        
        else if(e.getSource() == displayDropoutBtn)
        {
            if(ArrayListStd.isEmpty())
            {
                JOptionPane.showMessageDialog(DropoutFrame, "Empty field found", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
                //variables
                
                boolean dispDrop = false;
                enrollmentID = Integer.parseInt(enrollmentIDDropoutTF.getText());
                studentName = studentNameDropoutTF.getText();
                courseName = courseNameDropoutTF.getText();
                courseDuration = Integer.parseInt(courseDurationDropoutTF.getText());
                tuitionFee = Integer.parseInt(tuitionFeeDropoutTF.getText());
                numOfRemainingModules = Integer.parseInt(RemainingModulesDropoutTF.getText());
                numOfMonthsAttended = Integer.parseInt(MonthsAttendedDropoutTF.getText());
                
                DateOfBirthDay = dateOfBirthDayDropoutCB.getSelectedItem().toString();
                DateOfBirthMonth = dateOfBirthMonthDropoutCB.getSelectedItem().toString();
                DateOfBirthYear = dateOfBirthYearDropoutCB.getSelectedItem().toString();
                dateOfBirth = DateOfBirthDay + "-" + DateOfBirthMonth + "-" + DateOfBirthYear;
                    
                DateOfEnrollmentDay = dateOfEnrollDayDropoutCB.getSelectedItem().toString();
                DateOfEnrollmentMonth = dateOfEnrollMonthDropoutCB.getSelectedItem().toString();
                DateOfEnrollmentYear = dateOfEnrollYearDropoutCB.getSelectedItem().toString();
                dateofEnrollment = DateOfEnrollmentDay + "-" + DateOfEnrollmentMonth + "-" + DateOfEnrollmentYear;
                    
                DateOfDropoutDay = dateOfDropoutDayDropoutCB.getSelectedItem().toString();
                DateOfDropoutMonth = dateOfDropoutMonthDropoutCB.getSelectedItem().toString();
                DateOfDropoutYear = dateOfDropoutYearDropoutCB.getSelectedItem().toString();
                dateOfDropout = DateOfDropoutDay + "-" + DateOfDropoutMonth + "-" + DateOfDropoutYear;             
                
                //iterating through the arraylist
                for(Student Std:ArrayListStd)
                {
                    //checking if the object of arraylist of Student class is instance of Dropout Class
                    if(Std instanceof Dropout)
                    {
                        dispDrop = true;
                        
                        //downcasting
                        Dropout drop = (Dropout) Std;
                        
                        //calling display() method of dropout class through object of Dropout class
                        drop.display();
                    }
                }
                
                if(dispDrop == false)
                {
                    JOptionPane.showMessageDialog(DropoutFrame, "Details not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                
                else 
                {
                    JOptionPane.showMessageDialog(DropoutFrame, "Values: " + "\n" + "Enrollment Id: " + enrollmentID + "\n" + "Student Name: " + studentName + "\n" + "Course Duration: " + courseDuration + "\n" + "Tuition Fee: Nrs." + tuitionFee + "\n" + "No of Rem. Modules: " + numOfRemainingModules + "\n" + "No of months attended: " + numOfMonthsAttended + "\n" + "Course Name: " + courseName + "\n" + "Date of Birth: " + dateOfBirth + "\n" + "Date of Enrollment: " + dateofEnrollment + "\n" + "Dropout Date: " + dateOfDropout);
                }
            }
        }
        
        //displays the required information in message dialog
        
        else if(e.getSource() == displayPercentBtn)
        {
            if(ArrayListStd.isEmpty())
            {
                JOptionPane.showMessageDialog(presentPercentFrame, "Empty field found", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else 
            {
                //variables
                boolean dispPercent = false;
                
                enrollmentID = Integer.parseInt(enrollmentIdPresentPercentTF.getText());
                daysPresent = Double.parseDouble(noOfDaysPresentPercentTF.getText());
                
                for(Student Std:ArrayListStd)
                {
                    if(Std instanceof Regular)
                    {
                        dispPercent = true;
                                
                        //downcasting
                        Regular reg = (Regular) Std;
                        
                        //calling display method of regular class through the object of Regular class
                        reg.display();
                    }
                }
                
                if(dispPercent == false)
                {
                    JOptionPane.showMessageDialog(presentPercentFrame, "Details not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                
                else 
                {
                    JOptionPane.showMessageDialog(presentPercentFrame, "Values: " + "\n" + "Enrollment Id: " + enrollmentID + "\n" + "Days Present: " + daysPresent);
                }
            }
        }
        
        //displays the required information in message dialog
        
        else if(e.getSource() == displayGrantCertBtn)
        {
            if(ArrayListStd.isEmpty())
            {
                JOptionPane.showMessageDialog(grantCertificateFrame, "Empty field found", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else 
            {
                //variables
                boolean grantCert = false;
                
                courseName = courseNameGrantCertTF.getText();
                    
                enrollmentID = Integer.parseInt(enrollmentIdGrantCertTF.getText());
                
                DateOfEnrollmentDay = dateOfEnrollDayGrantCertCB.getSelectedItem().toString();
                DateOfEnrollmentMonth = dateOfEnrollMonthGrantCertCB.getSelectedItem().toString();
                DateOfEnrollmentYear = dateOfEnrollYearGrantCertCB.getSelectedItem().toString();
                dateofEnrollment = DateOfEnrollmentDay + "-" + DateOfEnrollmentMonth + "-" + DateOfEnrollmentYear ;
                 
                
                for(Student Std:ArrayListStd)
                {
                    if(Std instanceof Regular)
                    {
                        grantCert = true;
                                
                        //downcasting
                        Regular reg = (Regular) Std;
                        
                        //calling display method of regular class through the object of regular class
                        reg.display();
                    }
                }
                
                if(grantCert == false)
                {
                    JOptionPane.showMessageDialog(grantCertificateFrame, "Details not found", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                
                else 
                {
                    JOptionPane.showMessageDialog(grantCertificateFrame, "Values: " + "\n" + "Enrollment Id: " + enrollmentID + "\n" + "Course Name: " + courseName + "\n" + "Date of Enrollment: " + dateofEnrollment);
                }
            }
        }
        
        //clears the textfields
        
        else if(e.getSource() == clearRegularBtn)
        {
            enrollmentIdTF.setText("");
            studentNameTF.setText("");
            courseDurationTF.setText("");
            creditHoursLabelTF.setText("");
            tuitionFeeTF.setText("");
            noOfModulesTF.setText(""); 
            daysPresentTF.setText("");
            courseNameTF.setText("");
            JOptionPane.showMessageDialog(regularFrame,"Text fields Cleared");
        }
        
        //clears the textfields
        
        else if(e.getSource() == clearDropoutBtn)
        {
            enrollmentIDDropoutTF.setText("");
            studentNameDropoutTF.setText("");
            courseDurationDropoutTF.setText("");
            tuitionFeeDropoutTF.setText("");
            courseNameDropoutTF.setText("");
            RemainingModulesDropoutTF.setText("");
            MonthsAttendedDropoutTF.setText("");
            JOptionPane.showMessageDialog(DropoutFrame,"Text fields Cleared");
        }
        
        //clears the textfields
        
        else if(e.getSource() == clearGrantCertBtn)
        {
            courseNameGrantCertTF.setText("");
            enrollmentIdGrantCertTF.setText("");
            JOptionPane.showMessageDialog(regularFrame,"Text fields Cleared");
        }
    }
    
    //method which operates the constructor by calling it.
    public static void main(String[]args)
    {
        new StudentGUI();
    }
}