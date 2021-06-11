/* 4. Write a program to illustrate the following String manipulation methods.
1. Create new strings using new.
2. Getting String length
3. String Concatenation
4. Character extraction
5. String Comparison
6. Searching substrings
7. Modifying a string
8. Data conversion using valueOf() */

import java.util.Scanner;


public class StringManipulation{
	public static void main(String args[]){
         
          Scanner in = new Scanner(System.in);

        //-------------------------------NEW STRING OPERATIONS-------------------------------------- 

        System.out.println("'new String' OPERATIONS\n-*-*-*-*-*-*-*-*-*-*-*-*");       
  
		System.out.println("ENTER  NUMBER OF CHARACTERS OF CHAR ARRAY : ");
        int noChar,i;
        noChar=in.nextInt();

		char CharArray[] = new char[noChar]; // array constructed

        System.out.println("ENTER "+noChar+" CHARACTERS : ");
        //reading characters        
            for(i=0;i<noChar;i++){
             System.out.print((i+1)+") ");
             CharArray[i]=in.next().charAt(0);
         }
		
        String charString = new String(CharArray); // converting char array  to string
		
        System.out.println("CREATED STRING USING 'new String'        : "+charString);
	
        System.out.print("ENTER NUMBER OF ASCCI VALUES : ");
        int noByte = in.nextInt();  
              
        byte byteArray[] = new byte[noByte];// byte array constructed
         System.out.println("ENTER "+(noByte+1)+" ASCII VALUES : ");  
          for(i=0;i<noByte;i++){
             System.out.print((i+1)+") ");
             byteArray[i] = in.nextByte();;
         }
        
      
		String byteString=new String(byteArray); // converting byte array  to string
            
		System.out.println("Created from byte [] : "+byteString);

      //------------------------------------------STRING OPRATIONS--------------------------------------------------- 		
        
		 System.out.println(" STRING OPERATIONS \n-*-*-*-*-*-*-*-*-*-*"); 

         System.out.println("ENTER A STRING : ");
         String string = in.next();
       
		System.out.println("LENGTH OF "+ string +" IS : "+string.length());
		
        System.out.println("-----STRING CONCATINATION----");
        
        System.out.println("ENTER A STRING TO CONCATINATE : ");
        String conString = in.next();
		
        System.out.println("USING concat()     : "+(conString.concat(string)));
		System.out.println("USING '+' operator : "+(conString+string));
		
        System.out.println("-----CHARACTER EXTRACTION-----");
        
        System.out.println("ENTER A CHARACTER POSTION TO RETURN THAT CHARACTER  (0 TO "+ (string.length()-1)+")");
        int postion=in.nextInt();
   
		System.out.println("CHARACTER AT "+postion+" POSITION IN "+string+" is "+string.charAt(postion));
		
        
        System.out.print("ENTER START INDEX  OF SUB STRING : ");
        int startIndex = in.nextInt();
        
        System.out.print("ENTER END INDEX  OF SUB STRING   : ");
        int endIndex = in.nextInt();
 
        char charArray2[] = new char[endIndex-startIndex]; 
        
		string.getChars(startIndex,endIndex,charArray2,0);

  		System.out.println("CHARACTERS BETWEEN "+ startIndex +" TO "+ endIndex +" IN "+ string +" IS : " +new String(charArray2));
        
         //------------------------------------------STRING COMPARISON---------------------------------------------------           

		System.out.println("-----STRING COMPARISON-----");
         
        System.out.print("ENTER STRING 1 : ");  //reading two strings
        String string1 = in.next();
        
        System.out.print("ENTER STRING 2 : ");
        String string2 = in.next();
 		

		System.out.println(string1 + " equals " + string2 + " : " + string1.equals(string2));
 
		System.out.println(string1 + " equalsIgnoreCase " + string2 + " : " + string1.equalsIgnoreCase(string2));


        //first string is greater than second string, it returns positive number (difference of character value)
        // if strings are equal it returns 0
        // first string is smaller than second string, it returns negative number (difference of character value)
		System.out.println(string1 + " compareTo() " + string2 + " -> " + string1.compareTo(string2)); 

		System.out.println(string1 + " compareToIgnoreCase " + string2 + " -> " + string1.compareToIgnoreCase(string2)); 
        //first string equals to second string, it returns 0
		
        System.out.println("ENTER A STRING TO CHECK STRING OF STRING : ");
        string1=in.next();
  
        System.out.println(string+" STARTS WITH "+ string1 +" : "+string.startsWith(string1));
        
        System.out.println("ENTER A STRING TO CHECK ENDING OF STRING : ");
        string1=in.next();

		System.out.println(string+" ENDS WITH  "+string1+" : "+string.endsWith(string1));

  		System.out.println("-----SEARCH STRING-----");
    
        System.out.println("ENTER A STRING TO CHECK INDEX  : ");
        string1=in.next();

		System.out.println("INDEX OF "+string1+"in"+string+" IS : "+string.indexOf(string1));

		System.out.println("-----MODIFY STRING-----");

        System.out.println(" CREATE SUB STRING FROM INDEX ? : ");
        startIndex=in.nextInt();
 
		System.out.println("SUB STRING "+string+" IS : "+string.substring(startIndex));
		
        System.out.println("ENTER A STRING TO REPLACE : ");
        string1=in.next();
  
        System.out.println("REPLACE WITH : ");
        string1=in.next();

        System.out.println("RESULT OF REPLACED STRING : "+string.replace(string1,string2));
		
        System.out.println("-----USING valueOf()-----");

		System.out.println("ENTER A FLOAT VALUE : ");
        float floatValue=in.nextFloat();

		System.out.println(floatValue+" IS CONVERTED TO :ss "+String.valueOf(floatValue));  //float value is converted into string 
	}
}







/*
OUTPUT
------
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/4$ javac StringManipulation.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXCERCISE 3/4$ java StringManipulation
'new String' OPERATIONS
-*-*-*-*-*-*-*-*-*-*-*-*
ENTER  NUMBER OF CHARACTERS OF CHAR ARRAY : 
12
ENTER 12 CHARACTERS : 
1) J
2) A
3) V
4) A
5) I
6) S
7) S
8) I 
9) M
10) P
11) L
12) E
CREATED STRING USING 'new String'        : JAVAISSIMPLE
ENTER NUMBER OF ASCCI VALUES : 4
ENTER 5 ASCII VALUES : 
1) 65
2) 66
3) 67
4) 68
Created from byte [] : ABCD
 STRING OPERATIONS 
-*-*-*-*-*-*-*-*-*-*
ENTER A STRING : 
ABHILASH
LENGTH OF ABHILASH IS : 8
-----STRING CONCATINATION----
ENTER A STRING TO CONCATINATE : 
NAME:
USING concat()     : NAME:ABHILASH
USING '+' operator : NAME:ABHILASH
-----CHARACTER EXTRACTION-----
ENTER A CHARACTER POSTION TO RETURN THAT CHARACTER  (0 TO 7)
0
CHARACTER AT 0 POSITION IN ABHILASH is A
ENTER START INDEX  OF SUB STRING : 0
ENTER END INDEX  OF SUB STRING   : 4
CHARACTERS BETWEEN 0 TO 4 IN ABHILASH IS : ABHI
-----STRING COMPARISON-----
ENTER STRING 1 : JAVA
ENTER STRING 2 : JAVA
JAVA equals JAVA : true
JAVA equalsIgnoreCase JAVA : true
JAVA compareTo() JAVA -> 0
JAVA compareToIgnoreCase JAVA -> 0
ENTER A STRING TO CHECK STRING OF STRING : 
ABHI
ABHILASH STARTS WITH ABHI : true
ENTER A STRING TO CHECK ENDING OF STRING : 
LASH
ABHILASH ENDS WITH  LASH : true
-----SEARCH STRING-----
ENTER A STRING TO CHECK INDEX  : 
ABHI
INDEX OF ABHIinABHILASH IS : 0
-----MODIFY STRING-----
 CREATE SUB STRING FROM INDEX ? : 
0
SUB STRING ABHILASH IS : ABHILASH
ENTER A STRING TO REPLACE : 
ABHI
REPLACE WITH : 
abhi
RESULT OF REPLACED STRING : ABHILASH
-----USING valueOf()-----
ENTER A FLOAT VALUE : 
10.02
10.02 IS CONVERTED TO :ss 10.02



*/



