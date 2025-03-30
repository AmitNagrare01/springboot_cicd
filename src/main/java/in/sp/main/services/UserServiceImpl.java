package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.sp.main.entities.Student;
import in.sp.main.repositories.StudentRepository;

@Service
public class UserServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository; 
	
	@Override
	public Student createStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public List<Student> getallStudent() {

		return studentRepository.findAll();
	}

	@Override
	public Optional<Student> getStudentDetails(int id) {

		return studentRepository.findById(id);

	}

	@Override
	public void deleteStudent(int id) {

		 studentRepository.deleteById(id);
		
	}

	
	
}
