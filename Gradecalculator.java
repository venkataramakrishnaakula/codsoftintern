import java.util.*;
class Gradecalculator{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("how many subjects ");
  int subjectCount = sc.nextInt();

        // Variable to store total marks
        int totalMarks = 0;

        // Loop to get marks for each subject
        for (int i = 0; i < subjectCount; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            int marks = sc.nextInt();
            totalMarks += marks; // Add marks to totalMarks
        }

        // Calculate average
        double average = (double) totalMarks / subjectCount;
	
if(average > 90){
System.out.println("your grade is A+");
	}
else if (average > 80){
System.out.println("your grade is A");
	 }
else if (average > 70){
System.out.println("your grade is B");
	}
else if (average > 60){
System.out.println("your grade is C");
	}
else if (average > 50){
System.out.println("your grade is D");
	}
else if (average > 40){
System.out.println("your grade is E");
	}
else {
System.out.println("your grade is F");
	}
System.out.println("YOUR TOTAL MARKS: "+ totalMarks);
System.out.println("YOUR AVERAGE MARKS: "+ average);
	}
}