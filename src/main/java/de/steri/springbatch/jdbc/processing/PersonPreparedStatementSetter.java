package de.steri.springbatch.jdbc.processing;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

public class PersonPreparedStatementSetter implements
		ItemPreparedStatementSetter<Person> {
	@Override
	public void setValues(Person person, PreparedStatement ps)
			throws SQLException {
		ps.setInt(1, person.getId()+10);
		ps.setString(2, person.getVorname());
		ps.setString(3, person.getName());
		ps.setInt(4,person.getAlter());
	}
}
