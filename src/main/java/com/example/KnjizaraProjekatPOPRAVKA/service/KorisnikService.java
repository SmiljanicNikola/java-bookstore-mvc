package com.example.KnjizaraProjekatPOPRAVKA.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.example.KnjizaraProjekatPOPRAVKA.model.Korisnik;

public interface KorisnikService {
	
	Korisnik findOne(String korisnickoIme);
	
	Korisnik findOne(String korisnickoIme, String lozinka);
	
	List<Korisnik> findAll();
	
	Korisnik save(Korisnik korisnik);
	
	Korisnik update(Korisnik korisnik);
	
	List<Korisnik> find(String ime, String prezime, String email, String adresa, String telefon, String korisnickoIme, String lozinka,
			LocalDate datumRodjenja, LocalDateTime datumRegistracije, String uloga);
	

}
