package com.example.OnlineAyurvedaMedicine;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.OnlineAyurvedaMedicine.repository.MedicineRepository;
import com.example.OnlineAyurvedaMedicine.service.MedicineService;
import com.example.OnlineAyurvedaMedicine.service.MedicineServiceImpl;

@ExtendWith(MockitoExtension.class)
public class MedicineServiceTest {
	@Mock private MedicineRepository medRepo;
	private MedicineService medServ;
	
	@BeforeEach void setUp()
	{
		this.medServ = new MedicineServiceImpl(medRepo);
	}
	@Test void getAllMedicines() {
		medServ.getAllMedicines();
		verify(medRepo).findAll();
	}
	@Test void getMedicineById() {
		medServ.getMedicineById(802);
		verify(medRepo).findByMedicineId((long) 802);
		
	}
	@Test void deleteMedicineById()
	{
		medServ.getMedicineById(803);
		verify(medRepo).findByMedicineId((long) 803);
	}

}
