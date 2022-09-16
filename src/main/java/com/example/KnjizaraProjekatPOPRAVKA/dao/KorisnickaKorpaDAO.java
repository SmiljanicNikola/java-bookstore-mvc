package com.example.KnjizaraProjekatPOPRAVKA.dao;

import java.util.List;

import com.example.KnjizaraProjekatPOPRAVKA.model.KorisnickaKorpa;


public interface KorisnickaKorpaDAO {
	
	
	public KorisnickaKorpa findOne(int id);
	
	
	public List<KorisnickaKorpa> findAll();
		
	
	public void save(KorisnickaKorpa korisnickaKorpa);
	
	
	public void update(KorisnickaKorpa korisnickaKorpa);
	
	
	public void delete(Integer id);
	
	
	public int deleteAll();

}
