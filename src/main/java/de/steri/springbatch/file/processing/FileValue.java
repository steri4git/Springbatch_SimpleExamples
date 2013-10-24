package de.steri.springbatch.file.processing;

public class FileValue {
	
	private String valueOne;
	private String valueTwo;
	private String valueThree;
	
	public String getValueOne() {
		return valueOne;
	}
	public void setValueOne(String valueOne) {
		this.valueOne = valueOne;
	}
	public String getValueTwo() {
		return valueTwo;
	}
	public void setValueTwo(String valueTwo) {
		this.valueTwo = valueTwo;
	}
	public String getValueThree() {
		return valueThree;
	}
	public void setValueThree(String valueThree) {
		this.valueThree = valueThree;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((valueOne == null) ? 0 : valueOne.hashCode());
		result = prime * result
				+ ((valueThree == null) ? 0 : valueThree.hashCode());
		result = prime * result
				+ ((valueTwo == null) ? 0 : valueTwo.hashCode());
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
		FileValue other = (FileValue) obj;
		if (valueOne == null) {
			if (other.valueOne != null)
				return false;
		} else if (!valueOne.equals(other.valueOne))
			return false;
		if (valueThree == null) {
			if (other.valueThree != null)
				return false;
		} else if (!valueThree.equals(other.valueThree))
			return false;
		if (valueTwo == null) {
			if (other.valueTwo != null)
				return false;
		} else if (!valueTwo.equals(other.valueTwo))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileValue [valueOne=");
		builder.append(valueOne);
		builder.append(", valueTwo=");
		builder.append(valueTwo);
		builder.append(", valueThree=");
		builder.append(valueThree);
		builder.append("]");
		return builder.toString();
	}
}
