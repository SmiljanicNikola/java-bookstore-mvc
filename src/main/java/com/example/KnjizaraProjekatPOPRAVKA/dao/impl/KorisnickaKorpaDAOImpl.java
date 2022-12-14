package com.example.KnjizaraProjekatPOPRAVKA.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.KnjizaraProjekatPOPRAVKA.dao.KnjigaDAO;
import com.example.KnjizaraProjekatPOPRAVKA.dao.KorisnickaKorpaDAO;
import com.example.KnjizaraProjekatPOPRAVKA.dao.KorisnikDAO;
import com.example.KnjizaraProjekatPOPRAVKA.model.Knjiga;
import com.example.KnjizaraProjekatPOPRAVKA.model.KorisnickaKorpa;
import com.example.KnjizaraProjekatPOPRAVKA.model.Korisnik;

@Repository
public class KorisnickaKorpaDAOImpl implements KorisnickaKorpaDAO {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private KnjigaDAO knjigaDAO;
	
	@Autowired
	private KorisnikDAO korisnikDAO;
	
	
	private class KorisnickaKorpaRowMapper implements RowMapper<KorisnickaKorpa>{

		@Override
		public KorisnickaKorpa mapRow(ResultSet rs, int rowNum) throws SQLException {
			int index = 1;
			int id=rs.getInt(index++);
			int knjigaId = rs.getInt(index++);
			Knjiga knjiga = knjigaDAO.findOne(knjigaId);
			Integer kolicina = rs.getInt(index++);
			String vlasnikKorpeOznaka = rs.getString(index++);
			Korisnik vlasnikKorpe = korisnikDAO.findOne(vlasnikKorpeOznaka);
				
			KorisnickaKorpa korisnickaKorpa = new KorisnickaKorpa(id, knjiga, kolicina,vlasnikKorpe);
			return korisnickaKorpa;
			
		}
	}
	
	
	@Override
	public KorisnickaKorpa findOne(int id) {
		try {
			String sql = "SELECT * FROM korisnickakorpa where id = ?";
			return jdbcTemplate.queryForObject(sql, new KorisnickaKorpaRowMapper(), id);
		} catch(EmptyResultDataAccessException ex) {
			return null;
		}
	}

	@Override
	public List<KorisnickaKorpa> findAll() {
		String sql = "SELECT id, knjigaId, kolicina, vlasnikKorpeOznaka from korisnickakorpa";
		return jdbcTemplate.query(sql, new KorisnickaKorpaRowMapper());
	}

	
	@Override
	public void save(KorisnickaKorpa korisnickaKorpa) {
		String sql = "INSERT INTO korisnickakorpa(id, knjigaId, kolicina, vlasnikKorpeOznaka) VALUES (?,?,?,?)";
		jdbcTemplate.update(sql, korisnickaKorpa.getId(), korisnickaKorpa.getKnjiga().getId(), korisnickaKorpa.getKolicina(), korisnickaKorpa.getVlasnikKorpe().getKorisnickoIme());	
		
	}

	@Override
	public void update(KorisnickaKorpa korisnickaKorpa) {
		String sql = "UPDATE korisnickakorpa SET id, knjigaId=?, kolicina=? WHERE id=?";
		jdbcTemplate.update(sql, korisnickaKorpa.getKnjiga().getId(),korisnickaKorpa.getKolicina(), korisnickaKorpa.getId());
		
	}

	@Override
	public void delete(Integer id) {
		String sql = "DELETE FROM korisnickakorpa WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}


	@Override
	public int deleteAll() {
		String sql="delete from korisnickakorpa";
		return jdbcTemplate.update(sql, new KorisnickaKorpaRowMapper());
	}

}

	

