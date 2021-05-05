class Stringprogram{
	public static void main(String[] args) {
	 
	  String str="Sample String"; //declaring a string varible and assiging
	  
	  System.out.println("STRING                       : "+str);
	  
	  System.out.println("STRING LENGTH                : "+str.length());

	    //toUpperCase() to return upper case string
	  
	  System.out.println("STRING IN UPPER CASE         : "+str.toUpperCase());

        //toLowerCase() to return upper case string
	  
	  System.out.println("STRING IN LOWER CASE         : "+str.toLowerCase());
	  
	    /*indexOf() method returns the index (the position) of the first
        occurrence of a specified text in a string (including whitespace)*/
	  
	  System.out.println("INDEX OF 'String'            : "+str.indexOf("String"));
       
      //string concatination

      String str2="Sample String2";

      System.out.println("STRING 2              	     : "+str2);
      
      //Using + operator

      System.out.println("CONCATINATION USING '+'      : "+str+" "+str2);

      //Using concat() operator
      
      System.out.println("CONCATINATION USING concat() : "+str.concat(str2));
     

	}
}

/*
  OUTPUT
  ------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/string$ javac Stringprogram.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/string$ java Stringprogram
STRING                       : Sample String
STRING LENGTH                : 13
STRING IN UPPER CASE         : SAMPLE STRING
STRING IN LOWER CASE         : sample string
INDEX OF 'String'            : 7
STRING 2              	     : Sample String2
CONCATINATION USING '+'      : Sample String Sample String2
CONCATINATION USING concat() : Sample StringSample String2

  

*/