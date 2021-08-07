import java.util.*;

//InvalidAgeException.java
 class InvalidAgeException extends Exception
{

InvalidAgeException(String str)
{

super(str);

}

}



 class TestAge
{

private static int age;
static void validate() throws InvalidAgeException
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter your age");
age = sc.nextInt();

if(age < 18)

throw new InvalidAgeException("Invalid Age, You are not eligible to vote");

else

System.out.println("Welcome to vote");

}



public static void main(String[] args)

{

try
{

validate();

}
catch(Exception e)
{

System.out.println("Caught an Exception: \n "+e);

}

}

}

//output
//ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/Exceptions$ java TestAge
//Enter your age
//18
//Welcome to vote
//ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/Exceptions$ 
//
//
