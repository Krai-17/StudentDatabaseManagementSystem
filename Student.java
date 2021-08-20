package studentDatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private String courses="";
    private int tuitionBalance=0;
    private String studentId;
    private static int costOfCourse=600;
    private static int id=1000;

    //constructor takes students name and year
    public Student() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName=sc.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName=sc.nextLine();

        System.out.print(" 1 - Freshman\n 2 - Sophomore\n 3 - Junior\n 4 - Senior\nEnter student class level: " );
        this.grade=sc.nextInt();

        setStudentId();

        //System.out.println(firstName + " " + lastName + " " + grade +" "+ studentId );

    }
    //generate ID
    private void setStudentId() {
        //grade level +ID
        id++;
        this.studentId=grade+""+id;

    }

    //enroll in courses
    public void enroll() {
        Scanner sc = new Scanner(System.in);
        String course="X";
        while(!(course.equals("Q")))
        {
            System.out.print("Enter course to enroll (Q to quit):");
            course=sc.nextLine();
            if(!(course.equals("Q"))) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
        }
        //System.out.println("Enrolled in: "+courses);
        //System.out.println("Tuition balance: Rs."+(tuitionBalance));
    }

    //view balance
    public void viewTuitionBalance() {
        System.out.println("Your tuition balance is: Rs."+tuitionBalance);
    }

    //pay fees
    public void payTuition(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your payment amount:");
        int fee=sc.nextInt();
        tuitionBalance=tuitionBalance-fee;
        System.out.println("Thank you for payment of Rs."+fee);
        viewTuitionBalance();
    }
    //ask for payment
    public void paymentChoice(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Do you want to proceed to payment(1 for Yes--2 for No):");
        int c=sc.nextInt();
        if(c==1)
            payTuition();
        System.out.println("Have a nice day!");

    }
    //show status
    public void showInfo() {
        System.out.println("Name: "+firstName+" "+lastName+"\nGrade level: "+grade+"\nStudent ID: "+studentId+"\nCourses enrolled: "+courses+"\nBalance: Rs."+tuitionBalance);


    }

}
