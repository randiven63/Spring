package tnsif.c2tc.m07.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.m07.Service.StudentService;
import tnsif.c2tc.m07.entity.Student;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student s)
	{
		service.addStudent(s);
	}
	@GetMapping("/getStudent/{uid}")
	public void getStudent(@PathVariable int uid)
	{
		service.getStudent(uid);
	}
	@GetMapping("/getStudents")
	public List<Student> getStudents()
	{
		return service.getStudents();
	}
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student s)
	{
		return service.updateStudent(s);
	}
	@DeleteMapping("/deleteStudent")
	public int deleteStudent(@PathVariable int uid)
	{
		return service.deleteStudent(uid);
	}
	
}
