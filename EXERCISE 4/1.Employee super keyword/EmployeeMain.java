/*1. Create a class ‘Employee’ with data members Empid,Name, Salary, Address and constructors to initialize thedata members. Create another class ‘Teacher’ that inherit the properties of class employee and contain its own datamembers department, Subjects taught and constructors to initialize these data members and also include display
function to display all the data members. Use array of objects to display details of N teachers.
*/



import java.util.Scanner;

//EMPLOYEE CLASS
class Employee{ 

    int EMPID,SALARY;
    String ADDRESS,NAME;

    Employee(int empid, String name , int salary ,String address){
       //employee constructor
        EMPID = empid ;
        SALARY = salary ;
        ADDRESS = address;
        NAME = name ; 
     
        }
}




class Teacher extends Employee
{

    String DEPARTMENT,SUBJECT;
  
 
     Teacher(int empid, String name , int salary ,String address,String department,String subject){
 
            super(empid , name ,salary , address); // EMPLOYEE CONSTRUCTOR INITIALIZING USING SUPER
    
                DEPARTMENT = department;
                SUBJECT    = subject;      
 
        }

      void display(){ //EMPLOYEE DETAILS DISPLAY METHOD
           
            System.out.println("EMPLOYEE ID         : "+EMPID);
            System.out.println("EMPLOYEE NAME       : "+NAME);
            System.out.println("EMPLOYEE ADDRESS    : "+ADDRESS);
            System.out.println("EMPLOYEE DEPARTMENT : "+DEPARTMENT);
            System.out.println("EMPLOYEE SUBJECT    : "+SUBJECT);
            System.out.println("EMPLOYEE SALARY     : "+SALARY);
            
         }  



}


class EmployeeMain{

 public static void main(String args[]){
          
       Scanner in = new Scanner(System.in);

       System.out.print("ENTER NUMBER OF EMPLOYEES : ");
       int count = in.nextInt();//reading number of employees

       Teacher TeacherObj[] = new Teacher[count]; //created array object
        
       int i; 
 
       for(i =0 ; i<count ;i++)
       {
      
            int id,salary;
            String name,address,department,subject;
           
            System.out.println("\nENTER EMPLOYEE "+(i+1)+" DETAILS ");  
           
            System.out.print("ENTER EMPLOYEE ID       : ");
            id=in.nextInt();
            
            System.out.print("ENTER EMPLOYEE NAME     : ");
            name = in.next();

            System.out.print("EMPLOYEE ADDRESS        : ");
            address = in.next();

            System.out.print("EMPLOYEE DEPARTMENT     : ");
            department = in.next();

            System.out.print("EMPLOYEE SUBJECT        : ");
            subject = in.next();
           
            System.out.print("EMPLOYEE SALARY         : ");
            salary=in.nextInt();
   
           TeacherObj[i]=new Teacher( id , name , salary , address , department , subject ); // object initialzed 
 
        }
       //displaying employees
       System.out.println("\nEMPLOYEE DETAILS");     
        for(i =0;i<count;i++){
             System.out.println("\nEMPLOYEE "+(i+1)+"\n----------- ");  
             TeacherObj[i].display();
   
         }

        

          

    }



}


/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 4/emeploye with super keyword$ javac EmployeeMain.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 4/emeploye with super keyword$ java EmployeeMain
ENTER NUMBER OF EMPLOYEES : 2

ENTER EMPLOYEE 1 DETAILS 
ENTER EMPLOYEE ID       : 1001
ENTER EMPLOYEE NAME     : ABHILASH
EMPLOYEE ADDRESS        : KOZHIKODE
EMPLOYEE DEPARTMENT     : DEVOPS
EMPLOYEE SUBJECT        : KUBERNETES
EMPLOYEE SALARY         : 52000

ENTER EMPLOYEE 2 DETAILS 
ENTER EMPLOYEE ID       : 1002    
ENTER EMPLOYEE NAME     : ABHINAND
EMPLOYEE ADDRESS        : KOZHIKODE
EMPLOYEE DEPARTMENT     : GCP
EMPLOYEE SUBJECT        : DEVOPS
EMPLOYEE SALARY         : 52000

EMPLOYEE DETAILS

EMPLOYEE 1
----------- 
EMPLOYEE ID         : 1001
EMPLOYEE NAME       : ABHILASH
EMPLOYEE ADDRESS    : KOZHIKODE
EMPLOYEE DEPARTMENT : DEVOPS
EMPLOYEE SUBJECT    : KUBERNETES
EMPLOYEE SALARY     : 52000

EMPLOYEE 2
----------- 
EMPLOYEE ID         : 1002
EMPLOYEE NAME       : ABHINAND
EMPLOYEE ADDRESS    : KOZHIKODE
EMPLOYEE DEPARTMENT : GCP
EMPLOYEE SUBJECT    : DEVOPS
EMPLOYEE SALARY     : 52000

*/

