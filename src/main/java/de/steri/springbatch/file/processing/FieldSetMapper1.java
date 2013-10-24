package de.steri.springbatch.file.processing;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class FieldSetMapper1<T extends String> implements FieldSetMapper<FileValue>{

	public FileValue mapFieldSet(FieldSet fieldSet) throws BindException {
		FileValue value = new FileValue();
		value.setValueOne(fieldSet.readString("EINS"));
		value.setValueTwo(fieldSet.readString("ZWEI"));
		value.setValueThree(fieldSet.readString("DREI"));
		return value;
	}
}
