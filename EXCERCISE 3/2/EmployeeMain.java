//2. Program to create a class for Employee having attributes eNo, eName eSalary. Read n
//employ information and Search for an employee given eNo, using the concept of Array of
//Objects.
//

import java.util.Scanner;

class Employee{

int eNo,eSalary; 
String eName;
 
void readEmployee(){ // READ METHOD

    Scanner  in = new Scanner(System.in);

 
        System.out.print("\nENTER EMPLOYEE NO      : ");
        eNo=Integer.parseInt(in.nextLine());

        System.out.print("ENTER EMPLOYEE NAME    : ");
        eName=in.nextLine();

        System.out.print("ENTER EMPLOYEE SALARY  : ");
        eSalary=Integer.parseInt(in.nextLine());
 
   }


  void DisplayEmployee(){ //DISPLAY METHOD
  
         System.out.println("\nEMPLOYEE NO           : "+eNo);
     
         System.out.println("ENTER EMPLOYEE NAME   : "+eName);
         
         System.out.println("ENTER EMPLOYEE NO     : "+eSalary);
         


   }



}


           

class EmployeeMain{   //MAIN CLASS

public static void main(String args[]){

 Scanner  in = new Scanner(System.in);

    System.out.print("ENTER NO OF EMPLOYEES : ");
    int noOfEmployees=in.nextInt(); 

    Employee EMP[] = new Employee[noOfEmployees];
    
    int employee;//loop varible
   
    for(employee=0; employee < noOfEmployees; employee++){
       
        System.out.println("\nENTER EMPLOYEE "+(employee+1)+" DETAILS ");
       
        EMP[employee] = new Employee();
       
        EMP[employee].readEmployee();
  
     }

   //displying entred emplyee details
    System.out.println("\nENTERD EMPLOYEES \n-------------- ");
    for(employee=0; employee < noOfEmployees; employee++){
     
        EMP[employee].DisplayEmployee();
    }

 //reading employee number to search
  System.out.print("\nENTER EMPLOYEE NO TO SEARCH : ");
  int search = in.nextInt();

 int index=-1; // Varible to store index of searched employee
   for(employee=0; employee < noOfEmployees; employee++)
    {
       
          if(EMP[employee].eNo==search)
           {
            index=employee;
            break;
          }
          else
          {
            index =-1;
          }
              
       
    }


    if(index==-1)
    System.out.println("NO SUCH EMPLOYEE");
    else
    {
      System.out.println("EMPLOYEE FOUND\n");
      EMP[index].DisplayEmployee();
    }

 }
}


  
/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/2$ javac EmployeeMain.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/2$ java EmployeeMain
ENTER NO OF EMPLOYEES : 3

ENTER EMPLOYEE 1 DETAILS 

ENTER EMPLOYEE NO      : 1
ENTER EMPLOYEE NAME    : ABHILASH
ENTER EMPLOYEE SALARY  : 120000

ENTER EMPLOYEE 2 DETAILS 

ENTER EMPLOYEE NO      : 2          
ENTER EMPLOYEE NAME    : BRUCE WAYNE
ENTER EMPLOYEE SALARY  : 1220000

ENTER EMPLOYEE 3 DETAILS 

ENTER EMPLOYEE NO      : 3
ENTER EMPLOYEE NAME    : TONY STARK
ENTER EMPLOYEE SALARY  : 1500000

ENTERD EMPLOYEES 
-------------- 

EMPLOYEE NO           : 1
ENTER EMPLOYEE NAME   : ABHILASH
ENTER EMPLOYEE NO     : 120000

EMPLOYEE NO           : 2
ENTER EMPLOYEE NAME   : BRUCE WAYNE
ENTER EMPLOYEE NO     : 1220000

EMPLOYEE NO           : 3
ENTER EMPLOYEE NAME   : TONY STARK
ENTER EMPLOYEE NO     : 1500000

ENTER EMPLOYEE NO TO SEARCH : 2
EMPLOYEE FOUND


EMPLOYEE NO           : 2
ENTER EMPLOYEE NAME   : BRUCE WAYNE
ENTER EMPLOYEE NO     : 1220000



*/





