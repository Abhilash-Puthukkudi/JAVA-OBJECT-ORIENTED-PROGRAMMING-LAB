//4. Write a program that reads from a file having integers. Copy even numbers and odd numbers to separate files.


import java.io.*;
class CopyOddEven{
	public static void main(String args[]){
		int data;  // varible to hold data retrived by read method
        //try with resource method
		try(FileInputStream fin = new FileInputStream("input.txt");
		FileOutputStream fout1 = new FileOutputStream("oddnum.txt");
		FileOutputStream fout2 = new FileOutputStream("evennum.txt");){
			String val = ""; // string varible to hold number

      
			do{
				data = fin.read(); //reading data
				if(data != -1){
					if((char)data != '\n'){ 
						char c = (char)data; //converting data to char
						val = val+String.valueOf(c); // concatinating digits
						
					}
					else if((char)data == '\n'){
						
						int value = Integer.parseInt(val);
						val = val + "\n";
						if(value % 2 == 0 ){
							byte even[] = val.getBytes();//writing even number
							fout2.write(even);
						}
						else{
							byte odd[] = val.getBytes(); //writing odd number
							fout1.write(odd);
						}
						val = ""; //number string clearing
                       
					}
                    
				}
			}while(data != -1);
            System.out.println("file copied successfully!!!");
		}catch(IOException e){
			System.out.println("File Not Found");
		}			
	}
}
