package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import com.example.OnlineAyurvedaMedicine.entity.Medicine;

public interface MedicineService {
	Medicine saveMedicine(Medicine med);

	Optional<Medicine> getMedicineById(long id);

	List<Medicine> getAllMedicines();

	String deleteMedicineById(long id);

	Medicine updateMedicineById(Medicine med);
	List<Medicine> getMedicineByMedicineName(String medicneName);

}
