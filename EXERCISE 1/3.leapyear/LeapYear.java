// 3. Write a Java program to find the number of days in a month for a given year.
// Check Leap year also.

import java .util.Scanner ;

class LeapYear{
	public static void main(String[] args) {
		
		//creating Scanner object
		Scanner in = new Scanner(System.in);
        
        int month,year;
        String leapyear; 
        
        System.out.print("ENTER MONTH :");
        month=in.nextInt(); 
        
        System.out.print("ENTER YEAR  :");
        year=in.nextInt();
        
        if((year%4 == 0) || ((year%100 == 0) &&(year%400 == 0))) {
        	   //checking leap year

              leapyear = " IS LEAP YEAR";  
        }
        else{
              leapyear = " IS NOT A LEAP YEAR";
              }
        

        switch(month){

         case 1                     :  //fall through
         case 3                     :  //fall through
         case 5                     :  //fall through
         case 7                     :  //fall through
         case 8                     :  //fall through
         case 10                    :  //fall through
         case 12                    : System.out.println(year+""+leapyear);
                                      System.out.println("MONTH "+month+" HAS 31 DAYS");
                                      break;  
         
         case 2                     : 
                                      if(leapyear==" IS LEAP YEAR"){
                                      System.out.println(year+""+leapyear);
                                      System.out.println("MONTH "+month+" HAS 29 DAYS");
                                      }
                                      else{
                                      System.out.println(year+""+leapyear);
                                      System.out.println("MONTH "+month+" HAS 28 DAYS");
                                      }
                                      break;
        
         case 4                    :  //fall through
         case 6                    :  //fall through
         case 9                    :  //fall through
         case 11                   :  System.out.println(year+""+leapyear);
                                      System.out.println("MONTH "+month+" HAS 30 DAYS");
                                      break;   

              
         }

 }
}



/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 1/3.leapyear$ javac LeapYear.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 1/3.leapyear$ java LeapYear
ENTER MONTH :02
ENTER YEAR  :2012
2012 IS LEAP YEAR
MONTH 2 HAS 29 DAYS



*/


