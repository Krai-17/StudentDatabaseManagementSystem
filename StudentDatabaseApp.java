package studentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //ask number of students
        System.out.print("Enter number of students to be enrolled:");
        int numOfStudents=sc.nextInt();
        Student students[]=new Student[numOfStudents];

        //create n number of students
        for(int i=0;i<numOfStudents;i++){
            students[i]=new Student();
            students[i].enroll();
            students[i].showInfo();
            students[i].paymentChoice();

        }
    }
}
