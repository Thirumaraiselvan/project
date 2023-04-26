package com.example.demo.service;


	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.example.demo.model.Cabdetails;
	import com.example.demo.repository.Cabrepo;

	@Service
	public class Cabservice {
	    
		@Autowired
	public Cabrepo respo;
		
		public Cabdetails addStudent(Cabdetails student)
		{
			return respo.save(student);
		}
		
		public List<Cabdetails> getStudent()
		{
			return respo.findAll();
		}
		public Optional<Cabdetails> getStudent(int id)
		{
			return respo.findById(id);
		}
		public Cabdetails updateStudent(Cabdetails student)
		{
			return respo.save(student);
		}
		public void deleteStudent(int id)
		{
			respo.deleteById(id);
		}
		
}
