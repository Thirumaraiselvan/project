package com.example.demo.repository;

	

	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cabdetails;

	@Repository
	public interface Cabrepo extends JpaRepository<Cabdetails, Integer>
		{


	}
