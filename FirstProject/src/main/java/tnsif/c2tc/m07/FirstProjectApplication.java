package tnsif.c2tc.m07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tnsif.c2tc.m07.entity.Student;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
		Student student=new Student();
		student.display();
	}

}
