package com.Doctors_infoo.Doctors_infoo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorsRepository extends JpaRepository<Doctors,Integer> {

	   Doctors findByName(String name);
}

