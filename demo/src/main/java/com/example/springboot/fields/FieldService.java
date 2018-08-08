package com.example.springboot.fields;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class FieldService {

	@Autowired
	private FieldRepository fieldRepository;

	private List<Field> fields = new ArrayList<>(Arrays.asList(
			new Field(1,"Spring","A Framework"),
			new Field(2, "Java","Core of Java"),
			new Field(3,"JavaScript", "JS somethings")));
	
	public List<Field> getAllFields(){
//		return fields;
		return (List<Field>) fieldRepository.findAll();
	}
	
	public Field getField(Integer id) {
//		return fields.stream().filter(f -> f.getId().equals(id)).findFirst().get();
		return fieldRepository.findById(id).orElse(null);
	}

	public Field getFieldFromName(String name) {
		return fields.stream().filter(f -> f.getName().equals(name)).findFirst().get();
	}

	public void addField(Field field) {
		//fields.add(field);
		fieldRepository.save(field);
	}

	public void updateField(Field field, Integer id) {
//		if(id > 0)
//			fields.set(id - 1, field);
		fieldRepository.save(field);
	}

    public void deleteField(Integer id) {
//        if(id > 0)
//            fields.remove(id - 1);
		fieldRepository.deleteById(id);
    }
}
