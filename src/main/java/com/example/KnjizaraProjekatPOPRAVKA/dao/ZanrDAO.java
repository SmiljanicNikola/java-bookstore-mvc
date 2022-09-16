package com.example.KnjizaraProjekatPOPRAVKA.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.KnjizaraProjekatPOPRAVKA.model.Zanr;


public interface ZanrDAO {
	

	public Zanr findOne(Integer id);

	
	public List<Zanr> findAll();

	
}
