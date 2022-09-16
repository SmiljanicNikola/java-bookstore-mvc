package com.example.KnjizaraProjekatPOPRAVKA.dao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import com.example.KnjizaraProjekatPOPRAVKA.model.Kupovina;


public interface KupovinaDAO {
	
	
	public Kupovina findOne(int id);
	
	
	public Kupovina findOne(LocalDate datumKupovine);

	
	public List<Kupovina> findAll();
		
	
	public void save(Kupovina kupovina);
	
	
	public List<Kupovina> find(HashMap<String, Object> mapaArgumenata);
	
}
