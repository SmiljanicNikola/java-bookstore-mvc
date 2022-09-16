package com.example.KnjizaraProjekatPOPRAVKA.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KnjizaraProjekatPOPRAVKA.dao.KomentarDAO;
import com.example.KnjizaraProjekatPOPRAVKA.model.Komentar;
import com.example.KnjizaraProjekatPOPRAVKA.service.KomentarService;

@Service
public class DatabaseKomentarService implements KomentarService {

	
	@Autowired
	private KomentarDAO komentarDAO;
	
	@Override
	public Komentar findOne(int id) {
		return komentarDAO.findOne(id);
	}

	
	@Override
	public List<Komentar> findAll() {
		return komentarDAO.findAll();
	}

	@Override
	public Komentar save(Komentar komentar) {
		komentarDAO.save(komentar);
		return komentar;
	}

	
	@Override
	public Komentar update(Komentar komentar) {
		komentarDAO.update(komentar);
		return komentar;
	}

	@Override
	public List<Komentar> find(int knjigaId) {
		List<Komentar> sviKomentari = komentarDAO.findAll();
		List<Komentar> odgovarajuci = new ArrayList<Komentar>();
		for(Komentar komentar : sviKomentari) {
			if (komentar.getKnjiga().getId() == knjigaId){
				odgovarajuci.add(komentar);
			}
		}
		return odgovarajuci;

	}




}
