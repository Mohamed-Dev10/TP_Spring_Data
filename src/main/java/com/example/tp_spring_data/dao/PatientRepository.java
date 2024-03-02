package com.example.tp_spring_data.dao;


import com.example.tp_spring_data.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface PatientRepository extends JpaRepository<Patient,Long> {
        List<Patient> findByNomContainsIgnoreCase(String kw);

}
