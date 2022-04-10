package tnsif.c2tc.m07.Service;

import java.util.List;

import tnsif.c2tc.m07.entity.Student;

public interface StudentService {

	public void addStudent(Student s);
	
	public int deleteStudent(int uid);
	
	public Student updateStudent(Student s);
	
	public Student getStudent(int id);
	
	public List<Student> getStudents();

}
