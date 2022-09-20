package com.Doctors_infoo.Doctors_infoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorsController {
	@Autowired
    private DoctorsService service;

    @PostMapping("/addDoctor")
    public Doctors addDoctors(@RequestBody Doctors doctors) {
        return service.saveDoctors(doctors);
    }

    @PostMapping("/addDoctors")
    public List<Doctors> addDoctors(@RequestBody List<Doctors> doctors) {
        return service.saveDoctors(doctors);
    }

    @GetMapping("/doctors")
    public List<Doctors> findAllDoctors() {
        return service.getDoctors();
    }

    @GetMapping("/doctorsById/{id}")
    public Doctors findDoctorsById(@PathVariable int id) {
        return service.getDoctorsById(id);
    }

    @GetMapping("/doctors/{name}")
    public Doctors findDoctorsByName(@PathVariable String name) {
        return service.getDoctorsByName(name);
    }
    @GetMapping("/Dorder")
    public List<Doctors> findAll() {
        return service.getAllDoctorsDescendingOrderbysalary();
    }

    @PutMapping("/update")
    public Doctors updateDoctors(@RequestBody Doctors doctors) {
        return service.updateDoctors(doctors);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDoctors(@PathVariable int id) {
        return service.deleteDoctors(id);
        
    
    }
}
	
