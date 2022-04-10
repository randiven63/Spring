package tnsif.c2tc.m07.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.m07.Repo.StudentRepo;
import tnsif.c2tc.m07.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo sr;
	@Override
	public void addStudent(Student s) 
	{
		sr.save(s);
	}
	@Override
	public Student updateStudent(Student s) {
		Student s1=sr.save(s); 
		return s1;
	}

	@Override
	public Student getStudent(int id) {
		Student s=sr.findById(id).get();
		return s;
	}
	
	@Override
	public int deleteStudent(int uid) {
		Student s=sr.findById(uid).get();
		sr.delete(s);
		return 1;
	}

	@Override
	public List<Student> getStudents() {
		return sr.findAll();
		 
	}

}
