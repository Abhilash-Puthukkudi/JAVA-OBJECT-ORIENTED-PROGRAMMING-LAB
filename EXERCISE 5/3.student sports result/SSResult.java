/*
3. Create interfaces Student and Sports. Create a class Result
implements Student and Sports. Display the academic and sports score
of a student.

*/
interface Student {
	int score=120;
	void DisplayScore();

}
interface Sports {
	int score=30;
	void DisplaySportScore();
}
class Result implements Student,Sports {
	public void DisplayScore() {
		System.out.println("Academic Score is :" + Student . score);
	}
	public void DisplaySportScore() {
		System.out.println("Sport Score is :" + Sports . score);
	}
}
public class SSResult {
	public static void main(String args[]){
		Result r = new Result();
		r.DisplayScore();
		r.DisplaySportScore();

	}
}


/*

output
------

ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/3$ javac SSResult.java
ablas@ablas-HP-Notebook:~/Desktop/JAVA PROGRAMS/EXERCISE 5/3$ java SSResult
Academic Score is :120
Sport Score is :30


*/
