package de.steri.springbatch.file.processing;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class FieldSetMapper1<T extends String> implements FieldSetMapper<T>{

	public T mapFieldSet(FieldSet fieldSet) throws BindException {
		String str = fieldSet.readString(0) + fieldSet.readString(1) + fieldSet.readString(2) ;

		return (T) str;
	}

}
