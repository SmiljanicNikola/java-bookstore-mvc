package com.example.KnjizaraProjekatPOPRAVKA.service;

import java.util.List;
import com.example.KnjizaraProjekatPOPRAVKA.model.KorisnickaKorpa;

public interface KorisnickaKorpaService {

	KorisnickaKorpa findOne(int id);
	
	List<KorisnickaKorpa> findAll();
	
	int deleteAll();
	
	KorisnickaKorpa save(KorisnickaKorpa korisnickaKorpa);
		
	KorisnickaKorpa update(KorisnickaKorpa korisnickaKorpa);
		
	KorisnickaKorpa delete(Integer id);
	
}
