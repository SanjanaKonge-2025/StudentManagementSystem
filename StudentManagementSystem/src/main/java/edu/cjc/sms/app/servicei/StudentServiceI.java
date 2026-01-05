package edu.cjc.sms.app.servicei;

import java.util.List;

import edu.cjc.sms.app.model.Student;

public interface StudentServiceI {

	public void saveStudentData(Student s);

	public List<Student> getAllStudent();
	
	public List<Student> searchStudentsByBatch(String batchNumber);

	public Student getSingleStudent(int id);

	public void updateStudentFees(int studentid, double ammount);

}
