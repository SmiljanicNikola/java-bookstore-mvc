package com.example.KnjizaraProjekatPOPRAVKA.service.impl;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KnjizaraProjekatPOPRAVKA.dao.KupovinaDAO;
import com.example.KnjizaraProjekatPOPRAVKA.model.Kupovina;
import com.example.KnjizaraProjekatPOPRAVKA.service.KupovinaService;

@Service
public class DatabaseKupovinaService implements KupovinaService {

	
	@Autowired
	private KupovinaDAO kupovinaDAO;
	
	@Override
	public Kupovina findOne(int id) {
		return kupovinaDAO.findOne(id);
	}

	@Override
	public List<Kupovina> findAll() {
		return kupovinaDAO.findAll();
	}

	
	@Override
	public Kupovina save(Kupovina kupovina) {
		kupovinaDAO.save(kupovina);
		return kupovina;
	}

	@Override
	public Kupovina findOne(LocalDate datumKupovine) {
		return kupovinaDAO.findOne(datumKupovine);
	}

	@Override
	public List<Kupovina> find2(LocalDate datumKupovineOd, LocalDate datumKupovineDo) {
		HashMap<String, Object> mapaArgumenata = new HashMap<String,Object>();
		
		if(datumKupovineOd!=null) 
			mapaArgumenata.put("datumKupovineOd", datumKupovineOd);
		
		if(datumKupovineDo!=null) 
			mapaArgumenata.put("datumKupovineDo", datumKupovineDo);
		
		return kupovinaDAO.find(mapaArgumenata);
	}

}
