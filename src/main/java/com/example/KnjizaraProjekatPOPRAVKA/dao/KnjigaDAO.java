package com.example.KnjizaraProjekatPOPRAVKA.dao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import com.example.KnjizaraProjekatPOPRAVKA.model.Knjiga;


public interface KnjigaDAO {
	
	
	public Knjiga findOne(int id);
	
	
	public Knjiga findOne(String naziv);
		
	
	public List<Knjiga> findAll();
	
	
	public List<Knjiga> find(String naziv, Long isbn, String izdavackaKuca, String autor, LocalDate godinaIzdavanja,
			String kratakOpis, float cena, int brojStranica, String tipPoveza, String pismo, String jezik, float prosecnaOcena);
	
	
	public List<Knjiga> findVerzija2(HashMap<String, Object> mapaArgumenata);

	
	public int save(Knjiga knjiga);
	
	
	public void update(Knjiga knjiga);
	
	
	public void update2(Knjiga knjiga);
	
	
	public void delete(int id);
	
	
	public List<Knjiga> find(String naziv, Float cena, String autor, String jezik);

	
	public List<Knjiga> find(HashMap<String, Object> mapaArgumenata);

}
