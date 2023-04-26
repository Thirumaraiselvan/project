package com.example.demo.StudentController;



	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	
	import com.example.demo.model.Cabdetails;
	import com.example.demo.service.Cabservice;

	@RestController
	@RequestMapping("/abc")
	public class Cabcontroller {
		@Autowired
		 public Cabservice obj;
		
		@PostMapping("")
		public Cabdetails addDetails(@RequestBody Cabdetails stud)
		{
			return obj.addStudent(stud);
		}
		
		@GetMapping("")
		public List<Cabdetails> getStudent()
		{
			return obj.getStudent();
		}
		@GetMapping("/get/{id}")
		public Optional<Cabdetails> getStudent(@PathVariable("id") int id)
		{
			return obj.getStudent(id);
		}
		
		@PutMapping("/put")
		public Cabdetails updateDetails(@RequestBody Cabdetails stud)
		{
			return obj.updateStudent(stud);
		}
		
		@DeleteMapping("/delete/{id}")
		public void addDetails(@PathVariable("id") int id)
		{
			obj.deleteStudent(id);
		}
		
		
	}
		



