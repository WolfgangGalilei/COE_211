import java.util.Scanner;
public class Skeleton {
    public static void main(String[] args) {
	Scanner scanny=new Scanner(System.in);
	int numbersOfDestruction[]=new int[5],labOccurrences,midtermGradeNoFunnyNamesInvolved,sumOfDestruction;
	double assignmentgrading=0,attendancegrading=0,midtermgrading;

	for(int failureIndex=1;failureIndex<=5;failureIndex++){
		System.out.print("Input the grade of assignment "+failureIndex+" ");
		numbersOfDestruction[failureIndex-1]=scanny.nextInt();
	}
	System.out.print("Input the number of attended labs ");
	labOccurrences=scanny.nextInt();
	System.out.print("Input the midterm grade ");
	midtermGradeNoFunnyNamesInvolved=scanny.nextInt();
	for(int normalIdx=0;normalIdx<5;normalIdx++)
	assignmentgrading+=numbersOfDestruction[normalIdx]; assignmentgrading*=0.06;
	attendancegrading=(labOccurrences/7.0)*5;
	midtermgrading=midtermGradeNoFunnyNamesInvolved*0.3;

	System.out.println();
	System.out.print("Assignments (30%): "+assignmentgrading+"\n"+
			 "Attendance  (5%) : "+ attendancegrading+"\n"+
			 "Midterm     (30%): "+ midtermgrading);
	

    }
}
//being inefficient is hard work, it's as hard to make something very wrong as to make something very right