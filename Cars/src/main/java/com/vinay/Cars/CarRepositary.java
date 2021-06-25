package com.vinay.Cars;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface CarRepositary extends JpaRepository<Car, Long> {

	@Query("SELECT c FROM Car c WHERE c.email = ?1")
	List<Car> findByEmail(String email);
	
	@Query("UPDATE Car c set c.price = ?2, c.years = ?3, c.kmdriven = ?4 WHERE c.id = ?1")
	@Modifying
    @Transactional
	void updatecar(Long id,int price,int years,int kmdriven);
}
