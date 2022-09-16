package com.example.KnjizaraProjekatPOPRAVKA.service;

import java.util.List;

import com.example.KnjizaraProjekatPOPRAVKA.model.Zanr;

public interface ZanrService {

	Zanr findOne(Integer id);
	
	List<Zanr> findAll();
	
	List<Zanr> find(Integer[] ids);
	
}
