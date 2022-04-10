package tnsif.c2tc.m07.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tnsif.c2tc.m07.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
		//CrudRepository<Student, Integer>
	
{
	
}
