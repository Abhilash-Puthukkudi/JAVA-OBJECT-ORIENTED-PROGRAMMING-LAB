/*Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class ‘Employee’ that inherits the properties of class Person and also contains its own data members like Empid, Company_name, Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits the properties of class Employee and contains its own data members like Subject, Department, Teacherid and also contain constructors and methods to display the data members. Use array of objects to display details of N teachers.
*/



import java.util.Scanner;

//class person
class Person{
     
    //data members
    String NAME,GENDER,ADDRESS;
    int AGE;
    

    //constructor
     Person( String name , String gender , String address , int age)
       {
           NAME    = name;
           GENDER  = gender;
           ADDRESS = address; 
           AGE     = age; 
       }

 

}

//class employee
class Employee extends Person{
    //data members
    int EMPID,SALARY;
    String COMPANY_NAME,QUALIFICATION;
    
    //constructor
    Employee( int empid , int salary , String company_name , String qualification , String name , String gender , String address , int age )
    {
        super( name , gender , address , age); // initializing super class constructor
        
      EMPID         =   empid; 
      SALARY        =   salary;
      COMPANY_NAME  =   company_name;
      QUALIFICATION =   qualification;
     
    } 

       
}


//class teacher
class Teacher extends Employee{

  //data members
  int TEACHER_ID ;
  String DEPARTMENT , SUBJECT ; 
  
   // Teacher constructor
   Teacher( int teacher_id , String department , String subject , int empid , int salary , String company_name , String qualification , String name , String gender , String address , int age )
   {
           super( empid ,  salary ,  company_name ,  qualification ,  name ,  gender ,  address ,  age );
              
            TEACHER_ID  = teacher_id ;
            DEPARTMENT  = department ;
            SUBJECT     = subject ; 
   }


 
  //display method
  void display()
    {   
            System.out.println( " EMPLOYEE ID    : " + EMPID          ); 
            System.out.println( " TEACHER ID     : " + TEACHER_ID     );
            System.out.println( " NAME           : " + NAME           );
            System.out.println( " ADDRESS        : " + ADDRESS        );
            System.out.println( " AGE            : " + AGE            );
            System.out.println( " GENDER         : " + GENDER         );
            System.out.println( " DEPARTMENT     : " + DEPARTMENT     );
            System.out.println( " SUBJECT        : " + SUBJECT        );    
            System.out.println( " COMPANY        : " + COMPANY_NAME   );
            System.out.println( " QUALIFICATION  : " + QUALIFICATION  );
            System.out.println( " SALARY         : " + SALARY         );                                            
   
    }

}

//main class
class TeachersMain
{
   public static void main(String args[]){
   
     Scanner in = new Scanner(System.in);             


     System.out.print(" ENTER NUMBER OF TEACHERS : ");
     int no_of_teachers = in.nextInt(); // number of teachers
     int i;

     Teacher teachers[] = new Teacher[ no_of_teachers ]; // created array object

     //reading data
     for( i=0 ; i < no_of_teachers ; i++ )
     {
            System.out.println("\nENTER TEACHER "+(i+1)+" DEATILS");
           
            System.out.print( " EMPLOYEE ID    : " );
            int EMPID = Integer.parseInt(in.next()); 

            System.out.print( " TEACHER ID     : " );    
            int TEACHER_ID = Integer.parseInt(in.next());

            System.out.print( " NAME           : " );
            String NAME = in.next();

            System.out.print( " ADDRESS        : " );
            String ADDRESS =in.next();

            System.out.print( " AGE            : " );
            int AGE = Integer.parseInt(in.next()); 
            
            System.out.print( " GENDER         : " );
            String GENDER = in.next();
 
            System.out.print( " DEPARTMENT     : " );
            String DEPARTMENT = in.next();

            System.out.print( " SUBJECT        : " ); 
            String SUBJECT = in.next();

            System.out.print( " COMPANY        : " );
            String COMPANY_NAME = in.next();
 
            System.out.print( " QUALIFICATION  : " );
            String QUALIFICATION = in.next();
            
            System.out.print( " SALARY         : " );
            int SALARY = Integer.parseInt(in.next());   
          
            //initiazling object
            
       teachers[i] = new Teacher( TEACHER_ID , DEPARTMENT , SUBJECT , EMPID , SALARY , COMPANY_NAME , QUALIFICATION , NAME , GENDER , ADDRESS  , AGE );

     }
     
      System.out.println("\nTEACHERS DETIALS\n________________");
   
     // displaying teacher deartils
     for( i=0 ; i < no_of_teachers ; i++ )
     {
         System.out.println("\nTEACHER "+(i+1)+"\n_________");  
         teachers[i].display();             
     }



    }
  }


/*
OUTPUT
------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 4/3$ javac TeachersMain.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 4/3$ java TeachersMain
 ENTER NUMBER OF TEACHERS : 2

ENTER TEACHER 1 DEATILS
 EMPLOYEE ID    : 1001
 TEACHER ID     : 111
 NAME           : ABHILASH
 ADDRESS        : KOZHIKODE
 AGE            : 22
 GENDER         : MALE
 DEPARTMENT     : MCA     
 SUBJECT        : JAVA
 COMPANY        : KMCT
 QUALIFICATION  : BSC 
 SALARY         : 12000

ENTER TEACHER 2 DEATILS
 EMPLOYEE ID    : 1002
 TEACHER ID     : 112
 NAME           : ABHINAND
 ADDRESS        : KOZHIKODE
 AGE            : 27
 GENDER         : MALE
 DEPARTMENT     : BTECH
 SUBJECT        : MECH
 COMPANY        : CET
 QUALIFICATION  : BTECH
 SALARY         : 44000

TEACHERS DETIALS
________________

TEACHER 1
_________
 EMPLOYEE ID    : 1001
 TEACHER ID     : 111
 NAME           : ABHILASH
 ADDRESS        : KOZHIKODE
 AGE            : 22
 GENDER         : MALE
 DEPARTMENT     : MCA
 SUBJECT        : JAVA
 COMPANY        : KMCT
 QUALIFICATION  : BSC
 SALARY         : 12000

TEACHER 2
_________
 EMPLOYEE ID    : 1002
 TEACHER ID     : 112
 NAME           : ABHINAND
 ADDRESS        : KOZHIKODE
 AGE            : 27
 GENDER         : MALE
 DEPARTMENT     : BTECH
 SUBJECT        : MECH
 COMPANY        : CET
 QUALIFICATION  : BTECH
 SALARY         : 44000




*/
//Verified
