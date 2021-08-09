//1. Write a user defined exception class to authenticate the user name and password.
import java.util.Scanner;
import java.util.*;

//Exception class 
class AuthenticateException extends Exception
{

    AuthenticateException(String str)
    {
        super(str);
    }

}

//Account class
class Account{

 String username , password;
 
 Account(String u ,String p){
    username = u ;
    password = p ;
 }

 void login() throws AuthenticateException
{

    Scanner sc = new Scanner(System.in);
    System.out.println("Login\n-------- ");
    System.out.print("Enter Username : ");
    String uname = sc.next();
    System.out.print("Enter Password : ");
    String pword = sc.next();

        if( uname.equals(username) && pword.equals(password))
        {
            System.out.println("Login Sucessfull");
        }
        else
        {
            throw new AuthenticateException("Invalid ,Credentials Login Failed");
        }
}

}

//main class

class Auth{
    public static void main(String args[])
    {        
        try
        {
          
          Scanner sc = new Scanner(System.in);
          //reading account details
          System.out.print("Enter New Username : ");
          String uname = sc.next();
          
          System.out.print("Enter New Password : ");
          String pword = sc.next();
          //creating account
          Account NewAccount = new Account(uname,pword);
          System.out.println("Account Created! Please Login.. "); 
          //login     
          NewAccount.login();
      
           
        }catch(Exception e)
        {
        System.out.println("Exception Found : "+e);    //printing Exception         
        }
    }
}

/*
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 6/1$ javac Auth.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 6/1$ java Auth
Enter New Username : abhilash
Enter New Password : password
Account Created! Please Login.. 
Login
-------- 
Enter Username : abhilash
Enter Password : 12345678 
Exception Found : AuthenticateException: Invalid ,Credentials Login Failed


ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 6/1$ javac Auth.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 6/1$ java Auth
Enter New Username : abhilash
Enter New Password : password
Account Created! Please Login.. 
Login
-------- 
Enter Username : abhilash
Enter Password : 12345678 
Exception Found : AuthenticateException: Invalid ,Credentials Login Failed



*/


