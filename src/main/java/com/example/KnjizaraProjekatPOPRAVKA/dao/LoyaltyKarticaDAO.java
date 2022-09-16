package com.example.KnjizaraProjekatPOPRAVKA.dao;

import java.util.HashMap;
import java.util.List;

import com.example.KnjizaraProjekatPOPRAVKA.model.ListaZelja;
import com.example.KnjizaraProjekatPOPRAVKA.model.LoyaltyKartica;


public interface LoyaltyKarticaDAO {
	

	public LoyaltyKartica findOne(int id);
	
	
	public LoyaltyKartica findOne(String vlasnikOznaka);
	
	
	public List<LoyaltyKartica> findAll();
		

	public void save(LoyaltyKartica loyaltyKartica);
	
	
	public void update(LoyaltyKartica loyaltyKartica);
	
		
}
