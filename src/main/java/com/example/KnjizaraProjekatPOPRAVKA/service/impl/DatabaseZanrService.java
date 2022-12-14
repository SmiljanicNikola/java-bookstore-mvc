package com.example.KnjizaraProjekatPOPRAVKA.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KnjizaraProjekatPOPRAVKA.dao.ZanrDAO;
import com.example.KnjizaraProjekatPOPRAVKA.model.Zanr;
import com.example.KnjizaraProjekatPOPRAVKA.service.ZanrService;

@Service
public class DatabaseZanrService implements ZanrService {

	@Autowired
	private ZanrDAO zanrDAO;

	@Override
	public Zanr findOne(Integer id) {
		return zanrDAO.findOne(id);
	}

	@Override
	public List<Zanr> findAll() {
		return zanrDAO.findAll();
	}
	
	@Override
	public List<Zanr> find(Integer[] ids) {
		List<Zanr> rezultat = new ArrayList<>();
		for (Integer id: ids) {
			Zanr zanr = zanrDAO.findOne(id);
			rezultat.add(zanr);
		}

		return rezultat;
	}
	
	
	
}
