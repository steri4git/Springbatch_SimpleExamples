package de.steri.springbatch.xml.xstream.domain;

import java.util.List;

public class Datei {

	private String datum;
	private String ersteller;
	private List<Person> personen;

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getErsteller() {
		return ersteller;
	}

	public void setErsteller(String ersteller) {
		this.ersteller = ersteller;
	}

	public List<Person> getPersonen() {
		return personen;
	}

	public void setPersonen(List<Person> personen) {
		this.personen = personen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result
				+ ((ersteller == null) ? 0 : ersteller.hashCode());
		result = prime * result
				+ ((personen == null) ? 0 : personen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Datei other = (Datei) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (ersteller == null) {
			if (other.ersteller != null)
				return false;
		} else if (!ersteller.equals(other.ersteller))
			return false;
		if (personen == null) {
			if (other.personen != null)
				return false;
		} else if (!personen.equals(other.personen))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Datei [datum=");
		builder.append(datum);
		builder.append(", ersteller=");
		builder.append(ersteller);
		builder.append(", personen=");
		builder.append(personen);
		builder.append("]");
		return builder.toString();
	}

	
	
}
