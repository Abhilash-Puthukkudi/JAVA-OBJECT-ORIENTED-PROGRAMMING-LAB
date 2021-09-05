class BubbleSort { 
 
    static <T> void bubbleSort(T[] arr) {  
        int n = arr.length;  
        T temp ;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(( ( (Comparable)arr[j-1]).compareTo (arr[j])) > 0   ){   
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }            
                     }  
                  } 
               }    
    
    public static void main(String[] args) {  
                Integer Intarr[] ={3,60,35,2,45,320,5}; // integer array
                Double  Doarr[]={100.2,1001.3,10.6,15.02,1.0}; // double array  
                 
                System.out.println("\nInteger Array Before Bubble Sort");  
                for(int i=0; i < Intarr.length; i++){  
                        System.out.print(Intarr[i] + " ");  
                }  
                
                System.out.println("\nDouble Array Before Bubble Sort");  
                for(int i=0; i < Doarr.length; i++){  
                        System.out.print(Doarr[i] + " ");  
                } 
                
                bubbleSort(Intarr);  //sorting array elements using integer bubble sort  
                bubbleSort(Doarr);  //sorting array elements using Double  bubble sort   
                 
                
                System.out.println("\nInteger Array After Bubble Sort");  //displaying sorted Integer array
                    for(int i=0; i < Intarr.length; i++){  
                        System.out.print(Intarr[i] + " ");  
                }
                
                System.out.println("\nDouble Array After Bubble Sort");  //displaying sorted Double array
                    for(int i=0; i < Doarr.length; i++){  
                        System.out.print(Doarr[i] + " ");  
                }  
        }  
}  
 /*
 output
 ------
 
 ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 9/4$ javac BubbleSort.java
Note: BubbleSort.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 9/4$ java BubbleSort

Integer Array Before Bubble Sort
3 60 35 2 45 320 5 
Double Array Before Bubble Sort
100.2 1001.3 10.6 15.02 1.0 
Integer Array After Bubble Sort
2 3 5 35 45 60 320 
Double Array After Bubble Sort
1.0 10.6 15.02 100.2 1001.3 ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 9/4$ 

 
 */
Verified
