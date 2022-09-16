package com.example.KnjizaraProjekatPOPRAVKA.service;

import java.util.List;

import com.example.KnjizaraProjekatPOPRAVKA.model.KorisnickaKorpa;
import com.example.KnjizaraProjekatPOPRAVKA.model.ListaZelja;


public interface ListaZeljaService {

	ListaZelja findOne(int id);
	
	List<ListaZelja> findAll();
	
	ListaZelja save(ListaZelja listaZelja);
				
	ListaZelja delete(Integer id);
	
	
	

	
	
}
