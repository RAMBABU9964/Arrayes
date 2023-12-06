package com.kn.array2d;
import java.util.Scanner;
public class TwoDimensionalArrayDemo1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
    //Take input for number of student
		System.out.println("Enter number of student=");
		int numberOfStudents=scan.nextInt();
	//Take input for number of subjects
		System.out.println("Enter number of subjects=");
		int numberOfSubjects=scan.nextInt();
		//Array Declaration & Creation
		int[][]arr=new int[numberOfStudents][numberOfSubjects];
		//Array initialization
       for (int i=0;i<arr.length;i++) {
    	   System.out.println("Enter the data for Students "+(i+1));
    	   for(int j=0;j<arr[i].length;j++) {
    		   System.out.println("Enter the Data for Subjects "+(j+1)+" Marks=");
    		   arr[i][j]=scan.nextInt();	   
    	   }
       }
       //Array traversing
       for(int i=0;i<arr.length;i++) {
    	   System.out.println("===Student "+(i+1)+" Data===");
    	   for(int j=0;j<arr[i].length;j++) {
    		   System.out.println("Subject "+(j+1)+" marks="+arr[i][j]);
    	   }
       }
	}

}
/*output:
Enter number of student=
3
Enter number of subjects=
3
Enter the data for Students 1
Enter the Data for Subjects 1 Marks=
45
Enter the Data for Subjects 2 Marks=
54
Enter the Data for Subjects 3 Marks=
68
Enter the data for Students 2
Enter the Data for Subjects 1 Marks=
58
Enter the Data for Subjects 2 Marks=
68
Enter the Data for Subjects 3 Marks=
78
Enter the data for Students 3
Enter the Data for Subjects 1 Marks=
78
Enter the Data for Subjects 2 Marks=
79
Enter the Data for Subjects 3 Marks=
76
===Student 1 Data===
Subject 1 marks=45
Subject 2 marks=54
Subject 3 marks=68
===Student 2 Data===
Subject 1 marks=58
Subject 2 marks=68
Subject 3 marks=78
===Student 3 Data===
Subject 1 marks=78
Subject 2 marks=79
Subject 3 marks=76
*/
