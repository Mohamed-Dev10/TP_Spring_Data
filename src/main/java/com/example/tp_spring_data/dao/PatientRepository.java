package com.example.tp_spring_data.dao;


import com.example.tp_spring_data.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
public interface PatientRepository extends JpaRepository<Patient,Long> {
        List<Patient> findByNomContainsIgnoreCase(String kw);
        Page<Patient> findByNomContains(String kw, Pageable pageable);

}
