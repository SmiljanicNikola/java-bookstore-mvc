package com.example.KnjizaraProjekatPOPRAVKA.service;

import java.util.List;

import com.example.KnjizaraProjekatPOPRAVKA.model.Komentar;

public interface KomentarService {
	
	Komentar findOne(int id);
	
	List<Komentar> findAll();
	
	Komentar save(Komentar komentar);
		
	Komentar update(Komentar komentar);
		
	List<Komentar> find(int knjigaId);
		
}
