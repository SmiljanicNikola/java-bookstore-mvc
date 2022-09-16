package com.example.KnjizaraProjekatPOPRAVKA.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KnjizaraProjekatPOPRAVKA.dao.LoyaltyKarticaDAO;
import com.example.KnjizaraProjekatPOPRAVKA.model.LoyaltyKartica;
import com.example.KnjizaraProjekatPOPRAVKA.service.LoyaltyKarticaService;

@Service
public class DatabaseLoyaltyKarticaService implements LoyaltyKarticaService {

	
	@Autowired
	private LoyaltyKarticaDAO loyaltyKarticaDAO;
	
	
	@Override
	public LoyaltyKartica findOne(int id) {
		return loyaltyKarticaDAO.findOne(id);
	}

	@Override
	public List<LoyaltyKartica> findAll() {
		return loyaltyKarticaDAO.findAll();
	}

	@Override
	public LoyaltyKartica save(LoyaltyKartica loyaltyKartica) {
		loyaltyKarticaDAO.save(loyaltyKartica);
		return loyaltyKartica;
	}

	@Override
	public LoyaltyKartica update(LoyaltyKartica loyaltyKartica) {
		loyaltyKarticaDAO.update(loyaltyKartica);
		return loyaltyKartica;
	}

	@Override
	public LoyaltyKartica findOne(String vlasnikOznaka) {
		return loyaltyKarticaDAO.findOne(vlasnikOznaka);
	}

}
