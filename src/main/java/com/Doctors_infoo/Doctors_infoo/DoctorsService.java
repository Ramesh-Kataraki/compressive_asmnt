package com.Doctors_infoo.Doctors_infoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Comparator;
import java.util.List;

@Service

public class DoctorsService {
    @Autowired
    private DoctorsRepository repository;

    public Doctors saveDoctors(Doctors doctors) {
        return repository.save(doctors);
    }

    public List<Doctors> saveDoctors(List<Doctors> doctors) {
        return repository.saveAll(doctors);
    }

    public List<Doctors> getDoctors() {
        return repository.findAll();
    }

    public Doctors getDoctorsById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Doctors getDoctorsByName(String name) {
        return repository.findByName(name);
    }

    public String deleteDoctors(int id) {
        repository.deleteById(id);
        return "Doctor removed !! " + id;
    }

    public Doctors updateDoctors(Doctors doctors) {
    	Doctors existingDoctors = repository.findById(doctors.getId()).orElse(null);
        existingDoctors.setName(doctors.getName());
        existingDoctors.setSalary(doctors.getSalary());
        existingDoctors.setSpecialist(doctors.getSpecialist());
        return repository.save(existingDoctors);
    }
    public List<Doctors> getAllDoctorsDescendingOrderbysalary(){
		List<Doctors>list=repository.findAll();
		list.sort(new Comparator() {
			public int Compare(Doctors o1,Doctors o2) {
				if (o2.getSalary()==o1.getSalary()) {
					return o1.getName().compareTo(o2.getName());
					
				}
				return (int)(o2.getSalary()-o1.getSalary());
			}
			@Override
			public int compare(Object o1, Object o2) {
				return 0;
			}
		});
		return list;
	}
}


