package com.example.OnlineAyurvedaMedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineAyurvedaMedicine.entity.Medicine;
import com.example.OnlineAyurvedaMedicine.repository.MedicineRepository;

@Service
public class MedicineServiceImpl implements MedicineService{

	@Autowired
	private MedicineRepository medRepo;

	public Medicine saveMedicine(Medicine med) {
		Medicine savedMed = medRepo.save(med);
		return savedMed;

	}

	public List<Medicine> getAllMedicines() {
		List<Medicine> medicines = medRepo.findAll();
		return medicines;
	}

	public Optional<Medicine> getMedicineById(long id) {
		Optional<Medicine> med = medRepo.findByMedicineId(id);
		return med;
	}

	public String deleteMedicineById(long id) {
		Optional<Medicine> med = medRepo.findByMedicineId(id);
		if (med.isPresent()) {
			medRepo.deleteById(id);
			return "deleted sucessfully";
		}
		return "id doesn't exist";
	}

	public Medicine updateMedicineById(Medicine med) {
		Medicine upMed = medRepo.save(med);
		return upMed;
	}
	public List<Medicine> getMedicineByMedicineName(String medicineName) {
		List<Medicine> med = medRepo.findByMedicineName(medicineName);
		return med;
	}

}