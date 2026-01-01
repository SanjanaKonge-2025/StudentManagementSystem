package edu.cjc.sms.app.serviceImpl;

import java.util.List;

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
}
