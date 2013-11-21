package de.steri.springbatch.xml.xstream.domain;

public class Adresse {

	    private String strasse;
	    private String hausnummer;
	    private String stadt;
	    private String plz;
		public String getStrasse() {
			return strasse;
		}
		public void setStrasse(String strasse) {
			this.strasse = strasse;
		}
		public String getHausnummer() {
			return hausnummer;
		}
		public void setHausnummer(String hausnummer) {
			this.hausnummer = hausnummer;
		}
		public String getStadt() {
			return stadt;
		}
		public void setStadt(String stadt) {
			this.stadt = stadt;
		}
		public String getPlz() {
			return plz;
		}
		public void setPlz(String plz) {
			this.plz = plz;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((hausnummer == null) ? 0 : hausnummer.hashCode());
			result = prime * result + ((plz == null) ? 0 : plz.hashCode());
			result = prime * result + ((stadt == null) ? 0 : stadt.hashCode());
			result = prime * result
					+ ((strasse == null) ? 0 : strasse.hashCode());
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
			Adresse other = (Adresse) obj;
			if (hausnummer == null) {
				if (other.hausnummer != null)
					return false;
			} else if (!hausnummer.equals(other.hausnummer))
				return false;
			if (plz == null) {
				if (other.plz != null)
					return false;
			} else if (!plz.equals(other.plz))
				return false;
			if (stadt == null) {
				if (other.stadt != null)
					return false;
			} else if (!stadt.equals(other.stadt))
				return false;
			if (strasse == null) {
				if (other.strasse != null)
					return false;
			} else if (!strasse.equals(other.strasse))
				return false;
			return true;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Adresse [strasse=");
			builder.append(strasse);
			builder.append(", hausnummer=");
			builder.append(hausnummer);
			builder.append(", stadt=");
			builder.append(stadt);
			builder.append(", plz=");
			builder.append(plz);
			builder.append("]");
			return builder.toString();
		}
}
