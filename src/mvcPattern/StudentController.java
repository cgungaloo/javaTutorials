package mvcPattern;

public class StudentController {
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view){
		this.model = model;
		this.view = view;
	}
	
	public void setStudentName(String name){
		model.setName(name);
	}
	
	public String getStudentName(){
		return model.getName();
	}
	
	public void setStudentRollNumber(String rollno){
		model.setRollNo(rollno);
	}
	
	public String getStudentRollNumber(){
		return model.getRollNo();
	}
	
	public void updateView(){
		view.printStudentDetails(model.getRollNo(),model.getName());
	}
}
