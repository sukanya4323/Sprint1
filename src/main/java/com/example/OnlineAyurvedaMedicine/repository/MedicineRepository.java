package com.example.OnlineAyurvedaMedicine.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineAyurvedaMedicine.entity.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

	List<Medicine> findByMedicineName(String medicineName);

	Optional<Medicine> findByMedicineId(long id);

}
