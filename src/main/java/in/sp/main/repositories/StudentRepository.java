package in.sp.main.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	
}
