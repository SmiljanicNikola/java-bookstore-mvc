package com.example.KnjizaraProjekatPOPRAVKA.service;

import java.util.List;

import com.example.KnjizaraProjekatPOPRAVKA.model.LoyaltyKartica;

public interface LoyaltyKarticaService {
	LoyaltyKartica findOne(int id);
	
	LoyaltyKartica findOne(String vlasnikOznaka);
	
	List<LoyaltyKartica> findAll();
	
	LoyaltyKartica save(LoyaltyKartica loyaltyKartica);
	
	LoyaltyKartica update(LoyaltyKartica loyaltyKartica);
	
}
