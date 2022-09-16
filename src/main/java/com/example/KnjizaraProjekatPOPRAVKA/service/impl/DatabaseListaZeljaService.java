package com.example.KnjizaraProjekatPOPRAVKA.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KnjizaraProjekatPOPRAVKA.dao.ListaZeljaDAO;
import com.example.KnjizaraProjekatPOPRAVKA.model.KorisnickaKorpa;
import com.example.KnjizaraProjekatPOPRAVKA.model.ListaZelja;
import com.example.KnjizaraProjekatPOPRAVKA.service.ListaZeljaService;

@Service
public class DatabaseListaZeljaService implements ListaZeljaService {

	
	@Autowired
	private ListaZeljaDAO listaZeljaDAO;
	
	@Override
	public ListaZelja findOne(int id) {
		return listaZeljaDAO.findOne(id);
	}

	@Override
	public List<ListaZelja> findAll() {
		return listaZeljaDAO.findAll();
	}

	@Override
	public ListaZelja save(ListaZelja listaZelja) {
		listaZeljaDAO.save(listaZelja);
		return listaZelja;
	}

	
	@Override
	public ListaZelja delete(Integer id) {
		ListaZelja listaZelja = findOne(id);
		if (listaZelja != null) {
			listaZeljaDAO.delete(id);
		}
		return listaZelja;
	}

}
