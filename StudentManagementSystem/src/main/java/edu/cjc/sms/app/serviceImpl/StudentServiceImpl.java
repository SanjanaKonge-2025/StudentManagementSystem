package edu.cjc.sms.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.sms.app.model.Student;
import edu.cjc.sms.app.repository.StudentRepository;
import edu.cjc.sms.app.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI
{
	@Autowired
	StudentRepository ssr;
	
	@Override
	public void saveStudentData(Student s) 
	{
	ssr.save(s);
		
	}
	
	@Override
	public List<Student> getAllStudent()
	{
		return ssr.findAll();
	}

	@Override
	public List<Student> searchStudentsByBatch(String batchNumber) 
	{
		List<Student> batchStudents=ssr.findAllByBatchNumber(batchNumber);
		return batchStudents;
	}

	@Override
	public Student getSingleStudent(int id) 
	{
		Optional<Student> opStudent=ssr.findById(id);
		return opStudent.get();
	}

	@Override
	public void updateStudentFees(int studentid, double ammount) 
	{
		Optional<Student> opStudent=ssr.findById(studentid);
		Student st=opStudent.get();
		st.setFeesPaid(st.getFeesPaid()+ammount);
		ssr.save(st);
		
	}
}
