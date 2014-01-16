package de.steri.springbatch.jdbc.processing;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class PersonJDBCTemplates {

	private JdbcTemplate jdbcTemplate;
	private HashMap<String, String> queries;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public HashMap<String, String> getQueries() {
		return queries;
	}

	public void setQueries(HashMap<String, String> queries) {
		this.queries = queries;
	}

	@Transactional
	@Rollback(false) 
	public int readData() {
		
		return jdbcTemplate.queryForInt(queries.get("COUNT_PERSON"));
	}
	
}

