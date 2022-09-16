package com.example.KnjizaraProjekatPOPRAVKA.dao;

import java.util.List;

import com.example.KnjizaraProjekatPOPRAVKA.model.ListaZelja;


public interface ListaZeljaDAO {
	

	public ListaZelja findOne(int id);
	
	
	public ListaZelja findOne(String vlasnikOznaka);
	
	
	public List<ListaZelja> findAll();
	

	public void save(ListaZelja listaZelja);
	
	
	public int update(ListaZelja listaZelja);
	
	
	public void delete(Integer id);
	
}
