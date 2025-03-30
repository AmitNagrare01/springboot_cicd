package in.sp.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.entities.Student;
import in.sp.main.services.StudentService;

@RestController
public class controller {

	@Autowired
	private StudentService userService;
	
	@PostMapping("/student")
	public Student addUserDetails(@RequestBody Student student) {
		
		return userService.createStudent(student);
		
		
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		
		return userService.getallStudent();
	}
	
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudentDetails(@PathVariable int id) {
		
	Student student = userService.getStudentDetails(id).orElse(null);
	 if(student != null) {
		 
		 return ResponseEntity.ok().body(student);
	 }
	 else {
		 return ResponseEntity.notFound().build();
	 }
		 
	 }
	 
	 @DeleteMapping("/student/{id}")
	 public ResponseEntity<Void> deletestudent(@PathVariable int id){

	 userService.deleteStudent(id);
	 
	 return ResponseEntity.noContent().build();
	}
	
}
