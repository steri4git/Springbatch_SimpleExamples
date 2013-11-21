package de.steri.springbatch.xml.xstream.domain;

import java.util.List;

public class Person {

	private String name;
	private String vorname;
	private List<Adresse> adressen;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public List<Adresse> getAdressen() {
		return adressen;
	}
	public void setAdressen(List<Adresse> adressen) {
		this.adressen = adressen;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((adressen == null) ? 0 : adressen.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
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
		Person other = (Person) obj;
		if (adressen == null) {
			if (other.adressen != null)
				return false;
		} else if (!adressen.equals(other.adressen))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", vorname=");
		builder.append(vorname);
		builder.append(", adressen=");
		builder.append(adressen);
		builder.append("]");
		return builder.toString();
	}
}
