package mvcPattern;

public class StudentView {
	public void printStudentDetails(String rollNo, String name){
		System.out.print("Student : ");
		System.out.print("Name " +name + ",");
		System.out.println("Roll Number : " + rollNo);
	}
}
