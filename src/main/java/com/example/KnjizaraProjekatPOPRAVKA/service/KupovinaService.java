package com.example.KnjizaraProjekatPOPRAVKA.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Lazy;

import com.example.KnjizaraProjekatPOPRAVKA.model.Kupovina;

@Lazy
public interface KupovinaService {

	Kupovina findOne(int id);
	
	Kupovina findOne(LocalDate datumKupovine);

	List<Kupovina> findAll();
		
	Kupovina save(Kupovina kupovina);
	
	List<Kupovina> find2(LocalDate datumKupovineOd, LocalDate datumKupovineDo);
	
}
