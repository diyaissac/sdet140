package JavaBasics;

public class StudentMarks {
	int english = 60;
	int mathematics = 67;
	int chemistry = 78;
	int physics = 89;
	 
	
	void totalmarks(){
		int sumOfMarks = english + mathematics + chemistry + physics;
		System.out.println(" sum of four subjects = " + sumOfMarks);
	}
	
	void averageMarks() {
		int average = (english + mathematics + chemistry + physics)/4;
		System.out.println(" sum of four subjects = " + average);
	}
}
