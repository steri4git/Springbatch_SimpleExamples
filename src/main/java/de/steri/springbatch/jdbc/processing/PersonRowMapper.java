package de.steri.springbatch.jdbc.processing;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Person> {
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		person.setId(rs.getInt("id"));
		person.setName(rs.getString("name"));
		person.setVorname(rs.getString("vorname"));
		person.setAlter(rs.getInt("alter"));
		return person;
	}
}
