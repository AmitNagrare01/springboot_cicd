package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import in.sp.main.entities.Student;

public interface StudentService {

	public Student createStudent(Student student);
	public List<Student> getallStudent();
	public Optional<Student> getStudentDetails(int id);
	public void deleteStudent(int id);
}
